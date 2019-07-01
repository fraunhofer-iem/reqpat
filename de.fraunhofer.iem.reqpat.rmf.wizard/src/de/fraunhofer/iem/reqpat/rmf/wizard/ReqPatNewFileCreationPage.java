package de.fraunhofer.iem.reqpat.rmf.wizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * Wizard page to create a new ReqPat model.
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 87 $, $Date: 2013-10-15 13:54:29 +0200 (Di, 15 Okt 2013) $
 */
public class ReqPatNewFileCreationPage extends WizardNewFileCreationPage {

	protected Text idPrefixText;

	protected String defaultIdPrefix;

	private Composite generateModelComposite;

	private Text orderText;
	private Text depthText;
	private Text topLevelElementsText;

	private Button generateModelButton;

	private boolean generateModel;

	private int topLevel;
	private int order;
	private int depth;

	private Label elementsLabel;

	private Composite topLevelComposite;

	/**
	 * Constructor of the ReqPatNewFileCreationPage class.
	 * 
	 * @param pageName
	 *            the wizard's page name
	 * @param selection
	 *            the default selection
	 * @param defaultIdPrefix
	 *            the default ID prefix
	 */
	public ReqPatNewFileCreationPage(String pageName,
			IStructuredSelection selection, String defaultIdPrefix) {
		super(pageName, selection);

		this.defaultIdPrefix = defaultIdPrefix;

		setTitle(pageName);
		setDescription("Create a new ReqPat model");
		setFileExtension("reqif");

		setAllowExistingResources(false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.dialogs.WizardNewFileCreationPage#createControl(org.eclipse
	 * .swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		topLevelComposite = (Composite) getControl();

		Composite prefixComposite = new Composite(topLevelComposite, SWT.NONE);

		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		gridLayout.makeColumnsEqualWidth = false;
		gridLayout.marginWidth = 0;
		gridLayout.horizontalSpacing = 13;

		prefixComposite.setLayout(gridLayout);

		prefixComposite.setLayoutData(new GridData(
				GridData.HORIZONTAL_ALIGN_FILL));

		Label label = new Label(prefixComposite, SWT.NONE);
		label.setText("ID prefix:");

		idPrefixText = new Text(prefixComposite, SWT.SINGLE | SWT.BORDER);
		idPrefixText.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true,
				false));

		if (defaultIdPrefix != null)
			idPrefixText.setText(defaultIdPrefix);

		generateModelButton = new Button(topLevelComposite, SWT.CHECK);
		generateModelButton.setText("Generate test model");

		GridData gridData = new GridData();
		gridData.horizontalSpan = 2;

		generateModelButton.setLayoutData(gridData);
		generateModelButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				setEnabled(generateModelComposite,
						generateModelButton.getSelection());
				validatePage();
			}
		});

		generateModelComposite = new Composite(topLevelComposite, SWT.NONE);
		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.center = true;
		rowLayout.spacing = 8;
		rowLayout.marginWidth = 0;
		rowLayout.marginLeft = 0;
		generateModelComposite.setLayout(rowLayout);

		gridData = new GridData();
		gridData.horizontalSpan = 2;

		generateModelComposite.setLayoutData(gridData);

		Composite topLevelElementsComposite = new Composite(
				generateModelComposite, SWT.NONE);
		rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.center = true;
		rowLayout.marginWidth = 0;
		rowLayout.marginLeft = 0;
		topLevelElementsComposite.setLayout(rowLayout);

		Label topLevelElementsLabel = new Label(topLevelElementsComposite,
				SWT.SINGLE);
		topLevelElementsLabel.setText("Top level elements:");

		topLevelElementsText = new Text(topLevelElementsComposite, SWT.SINGLE
				| SWT.BORDER);
		RowData rowData = new RowData(20, SWT.DEFAULT);
		topLevelElementsText.setLayoutData(rowData);

		Composite degreeComposite = new Composite(generateModelComposite,
				SWT.NONE);
		rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.center = true;
		degreeComposite.setLayout(rowLayout);

		Label orderLabel = new Label(degreeComposite, SWT.SINGLE);
		orderLabel.setText("Order:");

		orderText = new Text(degreeComposite, SWT.SINGLE | SWT.BORDER);
		rowData = new RowData(20, SWT.DEFAULT);
		orderText.setLayoutData(rowData);

		Composite depthComposite = new Composite(generateModelComposite,
				SWT.NONE);
		rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.center = true;
		depthComposite.setLayout(rowLayout);

		Label depthLabel = new Label(depthComposite, SWT.SINGLE);
		depthLabel.setText("Depth:");

		depthText = new Text(depthComposite, SWT.SINGLE | SWT.BORDER);
		rowData = new RowData(20, SWT.DEFAULT);
		depthText.setLayoutData(rowData);

		elementsLabel = new Label(generateModelComposite, SWT.SINGLE);

		ModifyListener modifyListener = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				validatePage();
			}
		};

		topLevelElementsText.addModifyListener(modifyListener);
		orderText.addModifyListener(modifyListener);
		depthText.addModifyListener(modifyListener);

		setEnabled(generateModelComposite, false);
	}

	/**
	 * Returns a value indicating whether or not a test model shall be
	 * generated.
	 * 
	 * @return true if it should be generated, otherwise false
	 */
	public boolean generateModel() {
		return generateModel;
	}

	/**
	 * Getter for the default ID prefix.
	 * 
	 * @return the default ID prefix
	 */
	public String getDefaultIdPrefix() {
		return defaultIdPrefix;
	}

	/**
	 * Getter for the depth.
	 * 
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * Getter for the ID prefix.
	 * 
	 * @return the ID prefix
	 */
	public String getIdPrefix() {
		if (idPrefixText != null && !idPrefixText.isDisposed()) {
			return idPrefixText.getText();
		}

		throw new IllegalStateException(
				"This method may not be called before the control has been created or after it has been disposed.");
	}

	/**
	 * Calculates the total node amount for the given order and depth.
	 * 
	 * @param order
	 *            the order
	 * @param depth
	 *            the depth
	 * @return the total node amount
	 */
	private double getNodeAmount(int order, int depth) {
		double amount = 0;
		for (int e = 0; e <= depth - 1; e++) {
			amount += Math.pow(order, e);
		}

		return amount;
	}

	/**
	 * Getter for the order.
	 * 
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * Getter for the top level amount.
	 * 
	 * @return the top level amount
	 */
	public int getTopLevel() {
		return topLevel;
	}

	/**
	 * Setter for the default ID prefix.
	 * 
	 * @param defaultIdPrefix
	 *            the default ID prefix
	 */
	public void setDefaultIdPrefix(String defaultIdPrefix) {
		this.defaultIdPrefix = defaultIdPrefix;

		if (idPrefixText != null) {
			if (defaultIdPrefix == null)
				defaultIdPrefix = "";

			idPrefixText.setText(defaultIdPrefix);
		}
	}

	private void setEnabled(Control control, boolean value) {
		control.setEnabled(value);

		if (control instanceof Composite) {
			Composite composite = (Composite) control;

			for (Control c : composite.getChildren())
				setEnabled(c, value);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#validatePage()
	 */
	@Override
	protected boolean validatePage() {
		generateModel = false;
		if (elementsLabel != null && !elementsLabel.isDisposed())
			elementsLabel.setText("");

		boolean valid = super.validatePage();

		if (generateModelButton != null && !generateModelButton.isDisposed()
				&& generateModelButton.getSelection()) {
			try {
				topLevel = Integer.parseInt(topLevelElementsText.getText());
				order = Integer.parseInt(orderText.getText());
				depth = Integer.parseInt(depthText.getText());

				if (topLevel <= 0 || order <= 0 || depth <= 0) {
					setErrorMessage("Please enter a positive number.");
					setPageComplete(false);
					return false;
				}
			} catch (NumberFormatException e) {
				setErrorMessage("Please enter a positive number.");
				setPageComplete(false);
				return false;
			}

			generateModel = true;

			double totalAmount = 0;
			if (order == 1)
				totalAmount = topLevel * depth;
			else
				totalAmount = topLevel * getNodeAmount(order, depth);
			elementsLabel.setText(String.format("%.0f elements", totalAmount));
			topLevelComposite.layout(true);
		}

		setPageComplete(valid);
		return valid;
	}

}
