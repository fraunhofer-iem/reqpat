/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.headline.provider;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrPresentationConfigurationItemProvider;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationEditorInterface;
import org.eclipse.rmf.reqif10.util.ReqIF10Switch;

import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServicePackage;
import de.fraunhofer.iem.reqpat.rmf.presentation.headline.ui.HeadlineCellEditor;
import de.fraunhofer.iem.reqpat.rmf.presentation.headline.ui.HeadlineCellRenderer;
import de.fraunhofer.iem.reqpat.rmf.presentation.headline.ui.HeadlinePresentationService;

/**
 * This is the item provider adapter for a
 * {@link HeadlinePresentationService.HeadlinePresentationServiceConfiguration}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 * 
 * @author Frederik Knust
 */
public class HeadlinePresentationServiceConfigurationItemProvider extends
		ProrPresentationConfigurationItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		PresentationEditorInterface {

	protected HeadlineCellRenderer headlineCellRenderer;

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public HeadlinePresentationServiceConfigurationItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This adds a property descriptor for the Size feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_HeadlinePresentationServiceConfiguration_size_feature"),
						getString(
								"_UI_PropertyDescriptor_description",
								"_UI_HeadlinePresentationServiceConfiguration_size_feature",
								"_UI_HeadlinePresentationServiceConfiguration_type"),
						HeadlinePresentationServicePackage.Literals.HEADLINE_PRESENTATION_SERVICE_CONFIGURATION__SIZE,
						true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.reqif10.pror.util.PresentationEditInterface#canEdit()
	 */
	@Override
	public boolean canEdit() {
		return true;
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	protected Object getAttributeValue(AttributeValue attributeValue) {
		if (attributeValue == null)
			return null;

		return ReqIF10Util.getTheValue(attributeValue);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rmf.reqif10.pror.editor.presentation.service.
	 * PresentationEditorInterface
	 * #getCellEditor(org.agilemore.agilegrid.AgileGrid,
	 * org.eclipse.emf.edit.domain.EditingDomain,
	 * org.eclipse.rmf.reqif10.AttributeValue,
	 * org.eclipse.rmf.reqif10.SpecElementWithAttributes, java.lang.Object)
	 */
	@Override
	public CellEditor getCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain, AttributeValue av,
			SpecElementWithAttributes parent, Object affectedObject) {

		return new HeadlineCellEditor(agileGrid, editingDomain, av, parent,
				affectedObject);
	}

	@Override
	public IProrCellRenderer getCellRenderer(AttributeValue av) {
		if (headlineCellRenderer == null) {
			/*
			 * This code has been copied from
			 * org.eclipse.rmf.pror.presentation.headline
			 * .ui.HeadlinePresentationService and has been adjusted to fit the
			 * new environment.
			 */

			// Only works if this itemProvider is stateful (via model generator)
			final HeadlinePresentationServiceConfiguration config = (HeadlinePresentationServiceConfiguration) getTarget();
			DatatypeDefinition dd = config.getDatatype();

			headlineCellRenderer = new HeadlineCellRenderer(dd.getIdentifier());
			headlineCellRenderer.setFontSize(config.getSize());

			// Register for notifications
			config.eAdapters().add(new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					// React to size changes
					switch (msg
							.getFeatureID(HeadlinePresentationServiceConfiguration.class)) {
					case HeadlinePresentationServicePackage.HEADLINE_PRESENTATION_SERVICE_CONFIGURATION__SIZE:
						headlineCellRenderer.setFontSize(msg.getNewIntValue());
						refreshUi(config.getDatatype());
						break;
					case HeadlinePresentationServicePackage.HEADLINE_PRESENTATION_SERVICE_CONFIGURATION__DATATYPE:
						if (msg.getNewValue() != null)
							headlineCellRenderer
									.setDatatypeId(((DatatypeDefinition) msg
											.getNewValue()).getIdentifier());
						refreshUi(config.getDatatype());
					default:
						break;
					}
				}
			});
		}

		return headlineCellRenderer;
	}

	/**
	 * This returns HeadlinePresentationServiceConfiguration.gif. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getResourceLocator().getImage(
						"full/obj16/HeadlinePresentationServiceConfiguration"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.reqif10.pror.util.PresentationEditInterface#getLabel(
	 * org.eclipse.rmf.reqif10.AttributeValue)
	 */
	@Override
	public String getLabel(AttributeValue av) {
		Object o = getAttributeValue(av);

		if (o != null) {
			String value = o.toString();

			return value;
		}

		return "";
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HeadlinePresentationServiceEditPlugin.INSTANCE;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		HeadlinePresentationServiceConfiguration headlinePresentationServiceConfiguration = (HeadlinePresentationServiceConfiguration) object;

		String[] subst = new String[2];
		subst[0] = headlinePresentationServiceConfiguration.getDatatype() == null ? "(PLEASE SET TYPE)"
				: headlinePresentationServiceConfiguration.getDatatype()
						.getLongName();
		subst[1] = headlinePresentationServiceConfiguration.getSize() + "";

		return getString("_UI_HeadlinePresentationServiceConfiguration_type",
				subst);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.reqif10.pror.util.PresentationEditInterface#handleDragAndDrop
	 * (java.util.Collection, java.lang.Object,
	 * org.eclipse.emf.edit.domain.EditingDomain, int)
	 */
	@Override
	public Command handleDragAndDrop(Collection<?> source, Object target,
			EditingDomain editingDomain, int operation) {
		return null;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification
				.getFeatureID(HeadlinePresentationServiceConfiguration.class)) {
		case HeadlinePresentationServicePackage.HEADLINE_PRESENTATION_SERVICE_CONFIGURATION__SIZE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * Copied from org.eclipse.rmf.pror.presentation.headline.ui.
	 * HeadlinePresentationService.
	 */
	@SuppressWarnings("rawtypes")
	private void refreshUi(DatatypeDefinition dd) {
		if (dd == null)
			return;
		ReqIF10Switch visitor = new ReqIF10Switch() {
			@Override
			public Object caseSpecHierarchy(SpecHierarchy object) {
				Notification n = new NotificationImpl(Notification.SET,
						object.getObject(), object.getObject());
				object.eNotify(new ViewerNotification(n));
				return super.caseSpecHierarchy(object);
			}
		};
		EList<Specification> roots = ReqIF10Util.getReqIF(dd).getCoreContent()
				.getSpecifications();
		for (Iterator i = EcoreUtil.getAllProperContents(roots, true); i
				.hasNext();) {
			visitor.doSwitch((EObject) i.next());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rmf.reqif10.pror.util.PresentationEditInterface#
	 * registerPresentationConfiguration
	 * (org.eclipse.rmf.reqif10.pror.configuration
	 * .ProrPresentationConfiguration,
	 * org.eclipse.emf.edit.domain.EditingDomain)
	 */
	@Override
	public void registerPresentationConfiguration(
			ProrPresentationConfiguration config, EditingDomain editingDomain) {

		// if (editingDomain instanceof AdapterFactoryEditingDomain) {
		// AdapterFactory adapterFactory = ((AdapterFactoryEditingDomain)
		// editingDomain).getAdapterFactory();
		//
		// if (adapterFactory instanceof ComposedAdapterFactory) {
		// ((ComposedAdapterFactory) adapterFactory).addAdapterFactory(new
		// HeadlinePresentationServiceItemProviderAdapterFactory());
		// }
		// }
	}

	@Override
	public Class<? extends DatatypeDefinition> suggestAsDefault() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rmf.reqif10.pror.util.PresentationEditInterface#
	 * unregisterPresentationConfiguration
	 * (org.eclipse.rmf.reqif10.pror.configuration
	 * .ProrPresentationConfiguration)
	 */
	@Override
	public void unregisterPresentationConfiguration(
			ProrPresentationConfiguration config) {
	}

}
