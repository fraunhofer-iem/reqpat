package de.fraunhofer.iem.reqpat.rmf.ui.wizards;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.rmf.reqif10.ReqIF;

import de.fraunhofer.iem.reqpat.rmf.ui.actions.InsertTemplate.Placeholder;

/**
 * A Wizard with a single page (InsertTemplateWizardPage).
 * 
 * @author Frederik Knust
 * 
 */
public class InsertTemplateWizard extends Wizard {

	protected InsertTemplateWizardPage insertTemplateWizardPage;

	/**
	 * Constructor for the InsertTemplateWizard class.
	 * 
	 * @param templates
	 *            A list of templates, that will be shown to the user when he
	 *            activates the TemplateSelectionDialog.
	 */
	public InsertTemplateWizard(List<IResource> templates) {
		insertTemplateWizardPage = new InsertTemplateWizardPage(templates);

		setWindowTitle("Insert Template");
		setHelpAvailable(false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		addPage(insertTemplateWizardPage);
	}

	/**
	 * Getter for the active placeholders. A placeholder is active if a value
	 * has been entered to replace the placeholder.
	 * 
	 * @return A list of active placeholders.
	 */
	public List<Placeholder> getActivePlaceholders() {
		if (insertTemplateWizardPage != null)
			return insertTemplateWizardPage.getActivePlaceholders();

		return null;
	}

	/**
	 * Getter for the ReqIF model of the selected template.
	 * 
	 * @return The ReqIF model of the selected template or null.
	 */
	public ReqIF getReqIf() {
		if (insertTemplateWizardPage != null)
			return insertTemplateWizardPage.getReqIf();

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		return true;
	}
}
