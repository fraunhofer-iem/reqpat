package de.fraunhofer.iem.reqpat.rmf.presentation.image.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.editors.DialogCellEditor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.swt.widgets.Control;

import de.fraunhofer.iem.reqpat.rmf.presentation.image.dialogs.ImageSelectionDialog;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class ImageDialogCellEditor extends DialogCellEditor {

	private static Set<String> SUPPORTED_IMAGE_TYPES;

	static {
		SUPPORTED_IMAGE_TYPES = new HashSet<String>();
		SUPPORTED_IMAGE_TYPES.add("jpg");
		SUPPORTED_IMAGE_TYPES.add("jpeg");
		SUPPORTED_IMAGE_TYPES.add("png");
		SUPPORTED_IMAGE_TYPES.add("gif");
		SUPPORTED_IMAGE_TYPES.add("tif");
		SUPPORTED_IMAGE_TYPES.add("tiff");
		SUPPORTED_IMAGE_TYPES.add("bmp");
	}

	private final EditingDomain editingDomain;
	private final IProject project;
	private final SpecElementWithAttributes parent;
	private final Object affectedObject;

	private IResource selectedImage;
	private AttributeValue attributeValue;

	public ImageDialogCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain, IProject project, AttributeValue av,
			SpecElementWithAttributes parent, Object affectedObject) {
		super(agileGrid);

		this.editingDomain = editingDomain;
		this.project = project;
		this.attributeValue = av;
		this.parent = parent;
		this.affectedObject = affectedObject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.agilemore.agilegrid.editors.DialogCellEditor#doGetValue()
	 */
	@Override
	protected Object doGetValue() {
		if (selectedImage != null) {
			String path = selectedImage.getFullPath()
					.makeRelativeTo(project.getFullPath()).toPortableString();

			Object oldValue = ReqIF10Util.getTheValue(attributeValue);

			if (!path.equals(oldValue)) {
				ProrUtil.setTheValue(attributeValue, path, parent,
						affectedObject, editingDomain);
			}
		}

		return attributeValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.agilemore.agilegrid.editors.DialogCellEditor#doSetValue(java.lang
	 * .Object)
	 */
	@Override
	protected void doSetValue(Object value) {
		if (value instanceof AttributeValue) {
			String path = (String) ReqIF10Util
					.getTheValue((AttributeValue) value);

			if (path == null)
				super.doSetValue("");
			else
				super.doSetValue(path);
		} else if (value instanceof IResource) {
			IResource resource = (IResource) value;

			super.doSetValue(resource.getFullPath()
					.makeRelativeTo(project.getFullPath()).toString());
		} else {
			super.doSetValue(value);
		}
	}

	protected void getImagesRecursively(IContainer parent,
			final List<IResource> images) throws CoreException {
		if (parent != null) {

			IResource[] members = parent.members();

			for (IResource member : members) {
				if (member.getType() == IResource.FILE) {
					String fileExtension = member.getFileExtension();

					if (fileExtension != null) {
						fileExtension = fileExtension.toLowerCase();

						if (SUPPORTED_IMAGE_TYPES.contains(fileExtension))
							images.add(member);
					}
				} else if (member.getType() == IResource.FOLDER) {
					getImagesRecursively((IContainer) member, images);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.agilemore.agilegrid.editors.DialogCellEditor#openDialogBox(org.eclipse
	 * .swt.widgets.Control)
	 */
	@Override
	protected Object openDialogBox(Control control) {
		List<IResource> images = new ArrayList<IResource>();

		try {
			getImagesRecursively(project, images);
		} catch (CoreException e) {
			MessageDialog.openError(control.getShell(), e.getClass()
					.getSimpleName(), String.format(
					"Unable to fetch Images from Project '%s'.",
					project.getName()));
			return null;
		}

		ImageSelectionDialog imageSelectionDialog = new ImageSelectionDialog(
				control.getShell(), project, images);
		imageSelectionDialog.setTitle("Select an image");
		imageSelectionDialog
				.setMessage("Select an image to insert(? = any character, * = any string):");
		imageSelectionDialog.setHelpAvailable(false);
		imageSelectionDialog.open();

		selectedImage = (IResource) imageSelectionDialog.getFirstResult();

		return selectedImage;
	}
}
