/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.image.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.datatypes.DatatypesPackage;
import org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl;
import org.eclipse.rmf.reqif10.impl.ReqIF10PackageImpl;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.impl.ConfigurationPackageImpl;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl;

import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceFactory;
import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServicePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ImagePresentationServicePackageImpl extends EPackageImpl implements
		ImagePresentationServicePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass imagePresentationServiceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize
	 * {@link ImagePresentationServicePackage#eINSTANCE} when that field is
	 * accessed. Clients should not invoke it directly. Instead, they should
	 * simply access that field to obtain the package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImagePresentationServicePackage init() {
		if (isInited)
			return (ImagePresentationServicePackage) EPackage.Registry.INSTANCE
					.getEPackage(ImagePresentationServicePackage.eNS_URI);

		// Obtain or create and register package
		ImagePresentationServicePackageImpl theImagePresentationServicePackage = (ImagePresentationServicePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ImagePresentationServicePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ImagePresentationServicePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationPackage.eNS_URI)
				: ConfigurationPackage.eINSTANCE);
		ReqIF10PackageImpl theReqif10Package = (ReqIF10PackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ReqIF10Package.eNS_URI) instanceof ReqIF10PackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ReqIF10Package.eNS_URI) : ReqIF10Package.eINSTANCE);
		XhtmlPackageImpl theXhtmlPackage = (XhtmlPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(XhtmlPackage.eNS_URI) instanceof XhtmlPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(XhtmlPackage.eNS_URI) : XhtmlPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DatatypesPackage.eNS_URI)
				: DatatypesPackage.eINSTANCE);

		// Load packages
		theXhtmlPackage.loadPackage();

		// Create package meta-data objects
		theImagePresentationServicePackage.createPackageContents();
		theConfigurationPackage.createPackageContents();
		theReqif10Package.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theImagePresentationServicePackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();
		theReqif10Package.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Fix loaded packages
		theXhtmlPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theImagePresentationServicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImagePresentationServicePackage.eNS_URI,
				theImagePresentationServicePackage);
		return theImagePresentationServicePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImagePresentationServicePackageImpl() {
		super(eNS_URI, ImagePresentationServiceFactory.eINSTANCE);
	}

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		imagePresentationServiceConfigurationEClass = createEClass(IMAGE_PRESENTATION_SERVICE_CONFIGURATION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getImagePresentationServiceConfiguration() {
		return imagePresentationServiceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ImagePresentationServiceFactory getImagePresentationServiceFactory() {
		return (ImagePresentationServiceFactory) getEFactoryInstance();
	}

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConfigurationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		imagePresentationServiceConfigurationEClass.getESuperTypes().add(
				theConfigurationPackage.getProrPresentationConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(imagePresentationServiceConfigurationEClass,
				ImagePresentationServiceConfiguration.class,
				"ImagePresentationServiceConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // ImagePresentationServicePackageImpl
