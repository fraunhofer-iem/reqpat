package de.fraunhofer.iem.reqpat.rmf.ui.actions;

import org.eclipse.rmf.reqif10.SpecHierarchy;

import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry.SpecType;

public class CreateImageAsChild extends CreateChild {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.ipt.em.swt.isae.rmfextension.actions.CreateChild#insertNewChild
	 * (org.eclipse.rmf.reqif10.SpecHierarchy)
	 */
	@Override
	protected void insertNewChild(SpecHierarchy specHierarchy) {
		insertNewChild(specHierarchy,
				specTypeRegistry.getSpecTypeName(SpecType.Image));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.ipt.em.swt.isae.rmfextension.actions.CreateChild#showErrorPopup
	 * ()
	 */
	@Override
	protected void showErrorPopup() {
		showErrorPopup(specTypeRegistry.getSpecTypeName(SpecType.Image));
	}

}
