/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.headline;

import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Configuration</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration#getSize
 * <em>Size</em>}</li>
 * </ul>
 * </p>
 * 
 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServicePackage#getHeadlinePresentationServiceConfiguration()
 * @model
 * @generated
 */
public interface HeadlinePresentationServiceConfiguration extends
		ProrPresentationConfiguration {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute. The default
	 * value is <code>"14"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServicePackage#getHeadlinePresentationServiceConfiguration_Size()
	 * @model default="14" required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '
	 * {@link de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration#getSize
	 * <em>Size</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // HeadlinePresentationServiceConfiguration
