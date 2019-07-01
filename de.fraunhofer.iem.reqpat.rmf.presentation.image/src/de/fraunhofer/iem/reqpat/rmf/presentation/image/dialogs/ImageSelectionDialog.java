package de.fraunhofer.iem.reqpat.rmf.presentation.image.dialogs;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class ImageSelectionDialog extends ElementListSelectionDialog {

	private static class ImageLabelProvider extends LabelProvider {

		private IProject project;

		public ImageLabelProvider(IProject project) {
			this.project = project;
		}

		@Override
		public String getText(Object element) {
			if (element == null)
				return "";

			IResource resource = (IResource) element;
			IPath relativePath = resource.getFullPath().makeRelativeTo(
					project.getFullPath());

			return relativePath.toString();
		}
	}

	public ImageSelectionDialog(Shell parent, IProject project,
			List<IResource> images) {
		super(parent, new ImageLabelProvider(project));
		setElements(images.toArray());
	}

}
