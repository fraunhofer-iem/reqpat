/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package de.fraunhofer.iem.reqpat.rmf.ui.util;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import de.fraunhofer.iem.reqpat.rmf.ui.views.ReqPatProblemsView;

/**
 * Standard Perspective for ISAE.
 * 
 * @author Markus Fockel, $LastChangedBy: fkl $
 * @version $Rev: 46 $, $Date: 2012-05-22 15:40:15 +0200 (Di, 22 Mai 2012) $
 */
public class RmfPerspectiveFactory implements IPerspectiveFactory {
	/**
	 * Perspective ID
	 */
	public static final String ID_PERSPECTIVE = "de.fraunhofer.ipt.em.swt.isae.RmfPerspectiveFactory";

	/**
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addPerspectiveShortcut(ID_PERSPECTIVE);

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT,
				0.2f, layout.getEditorArea());
		left.addView(IPageLayout.ID_OUTLINE);
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);

		IFolderLayout bottom = layout.createFolder("bottom",
				IPageLayout.BOTTOM, 0.70f, layout.getEditorArea());
		bottom.addView(ReqPatProblemsView.VIEW_ID);
		bottom.addView(IPageLayout.ID_PROP_SHEET);
	}
}
