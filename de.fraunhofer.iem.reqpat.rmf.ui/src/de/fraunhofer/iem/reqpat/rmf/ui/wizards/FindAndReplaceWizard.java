package de.fraunhofer.iem.reqpat.rmf.ui.wizards;

import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.wizard.Wizard;

import com.google.inject.Inject;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternDescriptor;

/**
 * A wizard with a single page (FindAndReplaceWizardPage).
 * 
 * @author Frederik Knust
 * 
 */
public class FindAndReplaceWizard extends Wizard {

	private final IPatternDescriptor[] patternDescriptors;

	private final FindAndReplaceWizardPage findAndReplacePage;

	/**
	 * Constructor for the FindAndReplaceWizard class.
	 * 
	 * @param patternDescriptors
	 *            The available pattern descriptors. May not be null or empty.
	 */
	@Inject
	public FindAndReplaceWizard(IPatternDescriptor[] patternDescriptors) {
		Assert.isLegal(patternDescriptors != null
				&& patternDescriptors.length > 0);

		this.patternDescriptors = patternDescriptors;
		this.findAndReplacePage = new FindAndReplaceWizardPage(
				patternDescriptors);

		setWindowTitle("Find and Replace");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		addPage(findAndReplacePage);
	}

	/**
	 * Getter for the active pattern descriptors (the pattern descriptors that
	 * have been selected in the Wizard).
	 * 
	 * @return The active pattern descriptors.
	 */
	public Set<IPatternDescriptor> getActivePatternDescriptors() {
		return findAndReplacePage.getActivePatternDescriptors();
	}

	/**
	 * Getter for the find string.
	 * 
	 * @return The find string.
	 */
	public String getFindString() {
		return findAndReplacePage.getFindString();
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
		return findAndReplacePage.getReplaceString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		return findAndReplacePage.getFindString().length() > 0
				&& findAndReplacePage.getActivePatternDescriptors().size() > 0;
	}
}
