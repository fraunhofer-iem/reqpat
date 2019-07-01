package de.fraunhofer.iem.reqpat.rmf.wizard;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.rmf.wizard.services.NewReqIfModelService;

/**
 * Wizard to create a new ReqPat model.
 * 
 * @author Frederik Knust, $LastChangedBy: fkl-rt $
 * @version $Rev: 251 $, $Date: 2016-03-11 18:12:18 +0100 (Fr, 11 Mär 2016) $
 */
public class ReqPatWizard extends Wizard implements IWorkbenchWizard {

	private static final String DEFAULT_ID_PREFIX = "REQ-";

	private final NewReqIfModelService newReqIfModelService;

	private IWorkbench workbench;

	private ReqPatNewFileCreationPage newFilePage;

	/**
	 * Constructor of the ReqPatWizard class.
	 */
	public ReqPatWizard() {
		Injector injector = de.fraunhofer.iem.reqpat.core.Activator
				.getInjector();
		Assert.isNotNull(injector);

		newReqIfModelService = injector.getInstance(NewReqIfModelService.class);
		Assert.isNotNull(newReqIfModelService);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		addPage(newFilePage);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;

		setWindowTitle("ReqPat Model");

		newFilePage = new ReqPatNewFileCreationPage("ReqPat Model", selection,
				DEFAULT_ID_PREFIX);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		IFile file = newFilePage.createNewFile();

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(file
				.getFullPath().toString()));

		String idPrefix = newFilePage.getIdPrefix();

		/*
		 * If the ID prefix is empty set it to null, so that no ID generator
		 * will be created.
		 */
		if (idPrefix != null && idPrefix.length() == 0)
			idPrefix = null;

		boolean generateModel = false;
		int topLevel = 0;
		int order = 0;
		int depth = 0;

		if (newFilePage.generateModel()) {
			generateModel = true;
			topLevel = newFilePage.getTopLevel();
			order = newFilePage.getOrder();
			depth = newFilePage.getDepth();
		}

		ReqIF reqIf = newReqIfModelService.createDefaultReqIfModel(idPrefix,
				generateModel, topLevel, order, depth);

		resource.getContents().add(reqIf);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			newFilePage.setErrorMessage("Unable to create ReqPat model.");
			return false;
		}

		try {
			IDE.openEditor(
					workbench.getActiveWorkbenchWindow().getActivePage(), file);
		} catch (PartInitException e) {
		}

		return true;
	}
}
