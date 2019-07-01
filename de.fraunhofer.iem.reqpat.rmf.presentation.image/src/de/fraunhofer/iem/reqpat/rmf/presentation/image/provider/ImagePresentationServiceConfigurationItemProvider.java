/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.image.provider;

import java.util.Collection;
import java.util.List;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrPresentationConfigurationItemProvider;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationEditorInterface;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.image.ui.ImageCellRenderer;
import de.fraunhofer.iem.reqpat.rmf.presentation.image.ui.ImageDialogCellEditor;
import de.fraunhofer.iem.reqpat.rmf.presentation.image.ui.ImagePresentationService;

/**
 * This is the item provider adapter for a
 * {@link ImagePresentationService.ImagePresentationServiceConfiguration}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 * 
 * @author Frederik Knust
 */
public class ImagePresentationServiceConfigurationItemProvider extends
		ProrPresentationConfigurationItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		PresentationEditorInterface {

	private final IReqIfService reqIfService;

	private ImageCellRenderer imageCellRenderer;

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ImagePresentationServiceConfigurationItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);

		Injector injector = de.fraunhofer.iem.reqpat.core.Activator
				.getInjector();
		Assert.isNotNull(injector);

		reqIfService = injector.getInstance(IReqIfService.class);
		Assert.isNotNull(reqIfService);
	}

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

		IProject project = null;
		if (affectedObject instanceof EObject) {
			project = reqIfService.getProject((EObject) affectedObject);
		}

		if (project != null) {
			ImageDialogCellEditor imageDialogCellEditor = new ImageDialogCellEditor(
					agileGrid, editingDomain, project, av, parent,
					affectedObject);

			return imageDialogCellEditor;
		}

		MessageDialog
				.openError(
						agileGrid.getShell(),
						"Project not found",
						String.format(
								"Unable to find Project for attribute value '%s'.",
								av));
		throw new NullPointerException("Project may not be null.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rmf.pror.reqif10.editor.presentation.service.
	 * PresentationEditorInterface
	 * #getCellRenderer(org.eclipse.rmf.reqif10.AttributeValue)
	 */
	@Override
	public IProrCellRenderer getCellRenderer(AttributeValue av) {
		if (imageCellRenderer == null)
			imageCellRenderer = new ImageCellRenderer();

		return imageCellRenderer;
	}

	/**
	 * This returns ImagePresentationServiceConfiguration.gif. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getResourceLocator().getImage(
						"full/obj16/ImagePresentationServiceConfiguration"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.pror.reqif10.util.PresentationEditInterface#getLabel(
	 * org.eclipse.rmf.reqif10.AttributeValue)
	 */
	@Override
	public String getLabel(AttributeValue av) {
		return null;
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
		return ImagePresentationServiceEditPlugin.INSTANCE;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ImagePresentationServiceConfiguration imagePresentationServiceConfiguration = (ImagePresentationServiceConfiguration) object;

		String[] subst = new String[1];
		subst[0] = imagePresentationServiceConfiguration.getDatatype() == null ? "(PLEASE SET TYPE)"
				: imagePresentationServiceConfiguration.getDatatype()
						.getLongName();

		return getString("_UI_ImagePresentationServiceConfiguration_type",
				subst);
	}

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
		super.notifyChanged(notification);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rmf.pror.reqif10.util.PresentationEditInterface#
	 * registerPresentationConfiguration
	 * (org.eclipse.rmf.pror.reqif10.configuration
	 * .ProrPresentationConfiguration,
	 * org.eclipse.emf.edit.domain.EditingDomain)
	 */
	@Override
	public void registerPresentationConfiguration(
			ProrPresentationConfiguration config, EditingDomain editingDomain) {
	}

	@Override
	public Class<? extends DatatypeDefinition> suggestAsDefault() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.rmf.pror.reqif10.util.PresentationEditInterface#
	 * unregisterPresentationConfiguration
	 * (org.eclipse.rmf.pror.reqif10.configuration
	 * .ProrPresentationConfiguration)
	 */
	@Override
	public void unregisterPresentationConfiguration(
			ProrPresentationConfiguration config) {
	}

}
