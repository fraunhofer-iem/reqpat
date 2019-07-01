package de.fraunhofer.iem.reqpat.rmf.ui.wizards;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternDescriptor;

/**
 * Wizard page that can be used to select pattern descriptors the find and
 * replace action shall be applied to and where the user can enter the find and
 * replace values.
 * 
 * @author Frederik Knust
 * 
 */
public class FindAndReplaceWizardPage extends WizardPage {

	private final IPatternDescriptor[] patternDescriptors;

	private final Set<IPatternDescriptor> activePatternDescriptors;

	private String findString;
	private String replaceString;

	/**
	 * Constructor for the FindAndReplaceWizardPage class.
	 * 
	 * @param patternDescriptors
	 *            The available pattern descriptors (may not be null or empty).
	 */
	protected FindAndReplaceWizardPage(IPatternDescriptor[] patternDescriptors) {
		super("FindAndReplaceWizardPage");

		Assert.isLegal(patternDescriptors != null
				&& patternDescriptors.length != 0);
		this.patternDescriptors = patternDescriptors;

		this.activePatternDescriptors = new HashSet<IPatternDescriptor>();
		for (IPatternDescriptor patternDescriptor : patternDescriptors) {
			this.activePatternDescriptors.add(patternDescriptor);
		}

		this.findString = "";
		this.replaceString = "";

		setTitle("Find and Replace");
		setDescription("1. select the patterns you want to apply find/replace to 2. enter the search and replace strings 3. click finish");

		setPageComplete(false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite mainComposite = new Composite(parent, SWT.NONE);

		mainComposite.setLayout(new GridLayout(1, false));

		for (final IPatternDescriptor patternDescriptor : patternDescriptors) {
			final Button button = new Button(mainComposite, SWT.CHECK);
			button.setText(patternDescriptor.getName());
			button.setSelection(true);

			button.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					if (button.getSelection()) {
						activePatternDescriptors.add(patternDescriptor);
					} else {
						activePatternDescriptors.remove(patternDescriptor);
					}

					if (activePatternDescriptors.size() > 0
							&& findString.length() > 0) {
						setPageComplete(true);
					} else {
						setPageComplete(false);
					}
				}
			});
		}

		Label findLabel = new Label(mainComposite, SWT.NONE);
		findLabel.setText("Find");

		final Text findText = new Text(mainComposite, SWT.SINGLE | SWT.BORDER);
		findText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				findString = findText.getText();

				if (findString.length() > 0
						&& activePatternDescriptors.size() > 0) {
					setPageComplete(true);
				} else {
					setPageComplete(false);
				}
			}
		});

		GridData gridData = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
		findText.setLayoutData(gridData);

		Label replaceLabel = new Label(mainComposite, SWT.NONE);
		replaceLabel.setText("Replace");

		final Text replaceText = new Text(mainComposite, SWT.SINGLE
				| SWT.BORDER);
		replaceText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				replaceString = replaceText.getText();
			}
		});

		gridData = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
		replaceText.setLayoutData(gridData);

		setControl(mainComposite);
	}

	/**
	 * Getter for the active pattern descriptors (the pattern descriptors that
	 * have been selected in the Wizard).
	 * 
	 * @return The active pattern descriptors.
	 */
	public Set<IPatternDescriptor> getActivePatternDescriptors() {
		return activePatternDescriptors;
	}

	/**
	 * Getter for the find string.
	 * 
	 * @return The find string.
	 */
	public String getFindString() {
		return findString;
	}

	/**
	 * Getter for the pattern descriptors.
	 * 
	 * @return The pattern descriptors.
	 */
	public IPatternDescriptor[] getPatternDescriptors() {
		return patternDescriptors;
	}

	/**
	 * Getter for the replace string.
	 * 
	 * @return The replace string.
	 */
	public String getReplaceString() {
		return replaceString;
	}
}
