package de.fraunhofer.iem.reqpat.rmf.ui.wizards;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.agilemore.agilegrid.Assert;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.ui.actions.InsertTemplate.Placeholder;
import de.fraunhofer.iem.reqpat.rmf.ui.dialogs.TemplateSelectionDialog;

/**
 * Wizard page that displays a grid where the user can enter values for
 * placeholders that were defined in the selected templat. It uses the
 * TemplateSelectionDialog to enable the user to choose a template.
 * 
 * @author Frederik Knust
 * 
 */
public class InsertTemplateWizardPage extends WizardPage {

	/**
	 * Editing support for the page's TableViewer.
	 * 
	 * @author Frederik Knust
	 * 
	 */
	private class ValueEditingSupport extends EditingSupport {

		private final TableViewer viewer;

		public ValueEditingSupport(TableViewer viewer) {
			super(viewer);
			this.viewer = viewer;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
		 */
		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.
		 * Object)
		 */
		@Override
		protected CellEditor getCellEditor(Object element) {
			return new TextCellEditor(viewer.getTable());
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
		 */
		@Override
		protected Object getValue(Object element) {
			if (((Placeholder) element).value == null)
				return "";

			return ((Placeholder) element).value;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object,
		 * java.lang.Object)
		 */
		@Override
		protected void setValue(Object element, Object value) {
			((Placeholder) element).value = String.valueOf(value);
			viewer.update(element, null);
		}
	}

	private final IReqIfService reqIfService;

	private ReqIF reqIf;

	private IResource selectedTemplate;

	private List<IResource> templates;

	private Label templateLabel;

	private TableViewer tableViewer;

	private List<Placeholder> placeholders;

	/**
	 * Constructor for the InsertTemplateWizardPage class.
	 * 
	 * @param templates
	 *            A list of templates, that will be shown to the user when he
	 *            activates the TemplateSelectionDialog.
	 */
	public InsertTemplateWizardPage(List<IResource> templates) {
		super("InsertTemplateWizardPage");

		this.templates = templates;

		Injector injector = de.fraunhofer.iem.reqpat.core.Activator
				.getInjector();
		Assert.isNotNull(injector);

		reqIfService = injector.getInstance(IReqIfService.class);
		Assert.isNotNull(reqIfService);

		setTitle("Insert Template");
		setDescription("1. Select a Template 2. Provide values for Placeholders (optional)");
		setPageComplete(false);
	}

	/**
	 * Creates the columns.
	 * 
	 * @param parent
	 *            The composite containing the table viewer.
	 */
	private void createColumns(Composite parent) {
		/*
		 * Key column.
		 */
		TableViewerColumn keyColumn = new TableViewerColumn(tableViewer,
				SWT.NONE);
		keyColumn.getColumn().setText("Key");
		keyColumn.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				Placeholder placeholder = (Placeholder) element;

				return placeholder.key;
			}

		});

		/*
		 * Value column.
		 */
		TableViewerColumn valueColumn = new TableViewerColumn(tableViewer,
				SWT.NONE);
		valueColumn.getColumn().setText("Value");
		valueColumn.setEditingSupport(new ValueEditingSupport(tableViewer));
		valueColumn.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				Placeholder placeholder = (Placeholder) element;

				return placeholder.value;
			}

		});

		/*
		 * The table layout specifies the width and weights of the different
		 * columns. The description column has the maximum weight and fills the
		 * complete empty space.
		 */
		TableColumnLayout tableLayout = new TableColumnLayout();
		parent.setLayout(tableLayout);

		tableLayout.setColumnData(keyColumn.getColumn(), new ColumnWeightData(
				0, 150));
		tableLayout.setColumnData(valueColumn.getColumn(),
				new ColumnWeightData(100, 200));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		Composite mainComposite = new Composite(parent, SWT.NONE);

		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		gridLayout.makeColumnsEqualWidth = false;

		mainComposite.setLayout(gridLayout);

		Label templateHeaderLabel = new Label(mainComposite, SWT.NONE);
		templateHeaderLabel.setText("Selected Template:");

		GridData gridData = new GridData();
		gridData.horizontalSpan = 2;

		templateHeaderLabel.setLayoutData(gridData);

		templateLabel = new Label(mainComposite, SWT.NONE);
		templateLabel.setText("No Template selected.");

		gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;

		templateLabel.setLayoutData(gridData);

		Button selectTemplateButton = new Button(mainComposite, SWT.PUSH);
		selectTemplateButton.setText("Select Template");

		selectTemplateButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				TemplateSelectionDialog templateSelectionDialog = new TemplateSelectionDialog(
						parent.getShell(), templates);
				templateSelectionDialog.open();

				IResource template = (IResource) templateSelectionDialog
						.getFirstResult();

				setSelectedTemplate(template);
			}
		});

		Label tableViewerHeader = new Label(mainComposite, SWT.NONE);
		tableViewerHeader.setText("Placeholders:");

		gridData = new GridData();
		gridData.horizontalSpan = 2;

		tableViewerHeader.setLayoutData(gridData);

		Composite tableComposite = new Composite(mainComposite, SWT.NONE);

		gridData = new GridData();
		gridData.horizontalSpan = 2;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;

		tableComposite.setLayoutData(gridData);

		tableViewer = new TableViewer(tableComposite, SWT.SINGLE | SWT.V_SCROLL
				| SWT.NO_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);

		createColumns(tableComposite);

		final Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		tableViewer.setContentProvider(new ArrayContentProvider());

		setControl(mainComposite);
	}

	/**
	 * Getter for the active placeholders. A placeholder is active if a value
	 * has been entered to replace the placeholder.
	 * 
	 * @return A list of active placeholders.
	 */
	List<Placeholder> getActivePlaceholders() {
		List<Placeholder> activePlaceholders = new ArrayList<Placeholder>();

		if (placeholders != null) {
			for (Placeholder placeholder : placeholders) {
				if (placeholder.isActive())
					activePlaceholders.add(placeholder);

			}
		}

		return activePlaceholders;
	}

	/**
	 * Getter for the ReqIF model of the selected template.
	 * 
	 * @return The ReqIF model of the selected template or null.
	 */
	ReqIF getReqIf() {
		return reqIf;
	}

	/**
	 * Getter for the IResource of the selected template.
	 * 
	 * @return The IResource of the selected template or null.
	 */
	IResource getSelectedTemplate() {
		return selectedTemplate;
	}

	/**
	 * Loads the ReqIF model from the given resource. Fetches the placeholders
	 * from the loaded ReqIF model and puts them into the grid.
	 * 
	 * @param selectedTemplate
	 *            The IResource containing the template.
	 */
	private void setSelectedTemplate(IResource selectedTemplate) {
		if (selectedTemplate != null
				&& selectedTemplate != this.selectedTemplate) {
			this.selectedTemplate = selectedTemplate;

			reqIf = reqIfService.loadReqIf(selectedTemplate);

			if (reqIf != null) {
				templateLabel.setText(selectedTemplate.getProjectRelativePath()
						.toString());
				setPageComplete(true);

				Set<String> placeholderKeys = reqIfService
						.getPlaceholder(reqIf);

				placeholders = new ArrayList<Placeholder>();

				for (String key : placeholderKeys) {
					placeholders.add(new Placeholder(key, null));
				}

				tableViewer.setInput(placeholders);
			} else {
				templateLabel.setText("Invalid ReqIF file.");
				tableViewer.setInput(null);
				setPageComplete(false);
			}
		}
	}
}
