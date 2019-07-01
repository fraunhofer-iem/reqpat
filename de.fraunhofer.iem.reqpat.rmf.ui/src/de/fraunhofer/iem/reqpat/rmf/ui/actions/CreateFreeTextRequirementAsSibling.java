package de.fraunhofer.iem.reqpat.rmf.ui.actions;

import org.eclipse.rmf.reqif10.SpecHierarchy;

import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry.SpecType;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 94 $, $Date: 2012-07-04 17:12:10 +0200 (Mi, 04 Jul 2012) $
 */
public class CreateFreeTextRequirementAsSibling extends CreateSibling {

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.ipt.em.swt.isae.rmfextension.actions.CreateSibling#
	 * insertNewSibling(org.eclipse.rmf.reqif10.SpecHierarchy)
	 */
	@Override
	protected void insertNewSibling(SpecHierarchy specHierarchy) {
		insertNewSibling(specHierarchy,
				specTypeRegistry.getSpecTypeName(SpecType.FreeText));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.ipt.em.swt.isae.rmfextension.actions.CreateSibling#
	 * showErrorPopup()
	 */
	@Override
	protected void showErrorPopup() {
		showErrorPopup(specTypeRegistry.getSpecTypeName(SpecType.FreeText));
	}

}
