package de.fraunhofer.iem.reqpat.rmf.presentation.image.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class ImageCellRenderer implements IProrCellRenderer {

	private static final int X_OFFSET = 3;
	private static final int Y_OFFSET = 1;

	private final IReqIfService reqIfService;

	/**
	 * Constructor for the ImageCellRenderer class.
	 */
	public ImageCellRenderer() {
		Injector injector = de.fraunhofer.iem.reqpat.core.Activator
				.getInjector();
		Assert.isNotNull(injector);

		reqIfService = injector.getInstance(IReqIfService.class);
		Assert.isNotNull(reqIfService);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.pror.reqif10.editor.presentation.service.IProrCellRenderer
	 * #doDrawCellContent(org.eclipse.swt.graphics.GC,
	 * org.eclipse.swt.graphics.Rectangle, java.lang.Object)
	 */
	@Override
	public int doDrawCellContent(GC gc, Rectangle rect, Object value) {
		if (value != null && value instanceof AttributeValue) {
			Object theValue = ReqIF10Util.getTheValue((AttributeValue) value);

			if (theValue != null && theValue instanceof String
					&& !(((String) theValue).length() == 0)) {
				IProject project = reqIfService
						.getProject((AttributeValue) value);

				if (project == null) {
					gc.drawText("Unable to load Project.", rect.x + X_OFFSET,
							rect.y);
					return gc.getFontMetrics().getHeight();
				}

				IPath path = Path.fromPortableString((String) theValue);
				IFile file = project.getFile(path);

				if (file == null) {
					gc.drawText("Image not found.", rect.x + X_OFFSET, rect.y);
					return gc.getFontMetrics().getHeight();
				}

				Image image = JFaceResources.getImage(file.getFullPath()
						.toString());
				String error = null;

				if (image == null) {
					if (!file.exists()) {
						error = "Image not found.";
					} else {
						try {
							image = new Image(gc.getDevice(), file
									.getLocation().toOSString());

							JFaceResources.getImageRegistry().put(
									file.getFullPath().toString(), image);
						} catch (SWTException e) {
							switch (e.code) {
							case SWT.ERROR_IO:
								error = "Image not found";
								break;
							case SWT.ERROR_INVALID_IMAGE:
								error = "Image data corrupt";
								break;
							case SWT.ERROR_UNSUPPORTED_FORMAT:
								error = "Image format unsupported";
								break;
							case SWT.ERROR_UNSUPPORTED_DEPTH:
								error = "Image depth unsupported";
								break;
							default:
								error = e.getMessage();
							}
						}
					}
				}

				if (image != null) {
					gc.drawImage(image, rect.x + X_OFFSET, rect.y + Y_OFFSET);

					return image.getBounds().height;
				} else if (error != null) {
					gc.drawText(String.format("%s: %s", error, path), rect.x
							+ X_OFFSET, rect.y);
					return gc.getFontMetrics().getHeight();
				} else {
					gc.drawText(
							String.format("Unable to load Image: %s", path),
							rect.x + X_OFFSET, rect.y);
					return gc.getFontMetrics().getHeight();
				}
			}
		}

		return gc.getFontMetrics().getHeight();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer
	 * #doDrawHtmlContent(org.eclipse.rmf.reqif10.AttributeValue)
	 */
	@Override
	public String doDrawHtmlContent(AttributeValue value) {
		if (value != null) {
			Object theValue = ReqIF10Util.getTheValue(value);

			if (theValue != null && theValue instanceof String
					&& !(((String) theValue).length() == 0)) {
				IProject project = reqIfService
						.getProject(value);

				if (project == null)
					return String.format("<img alt=\"%s\" />",
							"Unable to load Project.");

				IPath path = Path.fromPortableString((String) theValue);
				IFile file = project.getFile(path);

				if (file == null)
					return String.format("<img alt=\"%s\" />",
							"Image not found.");

				IPath rawLocation = file.getRawLocation();

				return String.format("<img src=\"file:///%s\"/>",
						rawLocation.toOSString());
			}
		}

		return null;
	}

}
