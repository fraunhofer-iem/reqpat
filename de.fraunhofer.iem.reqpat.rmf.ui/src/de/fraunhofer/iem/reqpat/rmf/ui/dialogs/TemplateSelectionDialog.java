package de.fraunhofer.iem.reqpat.rmf.ui.dialogs;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class TemplateSelectionDialog extends ElementListSelectionDialog {

	private static class TemplateLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			if (element == null || !(element instanceof IResource))
				return "";

			IResource resource = (IResource) element;

			String name = resource.getProjectRelativePath().toString();
			int pos = name.lastIndexOf(".");

			if (pos != -1) {
				name = name.substring(0, pos);
			}

			return name;
		}
	}

	public TemplateSelectionDialog(Shell parent, List<IResource> templates) {
		super(parent, new TemplateLabelProvider());

		setTitle("Select a template");
		setMessage("Select a template to insert(? = any character, * = any string):");
		setHelpAvailable(false);

		if (templates != null)
			setElements(templates.toArray(new IResource[templates.size()]));
	}
}
