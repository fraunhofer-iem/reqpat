package de.fraunhofer.iem.reqpat.rmf.ui.actions;

import org.eclipse.rmf.reqif10.SpecHierarchy;

import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry.SpecType;

public class CreateImageAsSibling extends CreateSibling {

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.ipt.em.swt.isae.rmfextension.actions.CreateSibling#
	 * insertNewSibling(org.eclipse.rmf.reqif10.SpecHierarchy)
	 */
	@Override
	protected void insertNewSibling(SpecHierarchy specHierarchy) {
		insertNewSibling(specHierarchy,
				specTypeRegistry.getSpecTypeName(SpecType.Image));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.ipt.em.swt.isae.rmfextension.actions.CreateSibling#
	 * showErrorPopup()
	 */
	@Override
	protected void showErrorPopup() {
		showErrorPopup(specTypeRegistry.getSpecTypeName(SpecType.Image));
	}

}
