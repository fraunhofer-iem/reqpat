/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.provider;

import java.util.Collection;
import java.util.List;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.Cell;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrPresentationConfigurationItemProvider;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationEditorInterface;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import com.google.inject.Injector;

import de.fraunhofer.iem.reqpat.core.interfaces.IXtextService;
import de.fraunhofer.iem.reqpat.rmf.exceptions.PatternException;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternDescriptor;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IPatternService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.IReqIfService;
import de.fraunhofer.iem.reqpat.rmf.interfaces.ISpecTypeRegistry;
import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.Activator;
import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.EmbeddedXtextEditorConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.ui.XtextCellRenderer;
import de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor.ui.XtextPopupCellEditor;

/**
 * This is the item provider adapter for a
 * {@link EmbeddedXtextEditor.EmbeddedXtextEditorConfiguration} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 * 
 * @author Frederik Knust
 */
public class EmbeddedXtextEditorConfigurationItemProvider extends
		ProrPresentationConfigurationItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		PresentationEditorInterface {

	private final IReqIfService reqIfService;
	private final IPatternService patternService;
	private final EmbeddedEditorFactory factory;
	private final IEditedResourceProvider resourceProvider;

	private XtextCellRenderer xtextCellRenderer;
	private IEclipsePreferences preferences;

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EmbeddedXtextEditorConfigurationItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);

		Injector injector = de.fraunhofer.iem.reqpat.core.Activator
				.getInjector();
		Assert.isNotNull(injector);

		IXtextService xtextService = injector.getInstance(IXtextService.class);
		Assert.isNotNull(xtextService);

		reqIfService = injector.getInstance(IReqIfService.class);
		Assert.isNotNull(reqIfService);

		patternService = injector.getInstance(IPatternService.class);
		Assert.isNotNull(patternService);

		factory = xtextService.getEmbeddedEditorFactory();
		Assert.isNotNull(factory);

		resourceProvider = xtextService.getResourceProvider();
		Assert.isNotNull(resourceProvider);

		preferences = ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.pror.reqif10.util.PresentationEditInterface#canEdit()
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

		Specification specification = reqIfService
				.getSpecificationFromActiveEditor();

		SpecObject specObject = null;
		if (affectedObject instanceof SpecHierarchy) {
			SpecHierarchy specHierarchy = (SpecHierarchy) affectedObject;

			if (specHierarchy.isSetObject())
				specObject = specHierarchy.getObject();
		}

		Cell[] selectedCells = agileGrid.getCellSelection();
		Cell selectedCell = null;

		if (selectedCells.length > 0) {
			// take the first cell to get its row and column
			selectedCell = selectedCells[0];
		}

		StringBuilder prefix = new StringBuilder();
		StringBuilder suffix = new StringBuilder();

		ReqIF reqIf = ReqIF10Util.getReqIF(affectedObject);

		try {
			IPatternDescriptor[] patternDescriptors = patternService
					.getPatternDescriptors(reqIf,
							ISpecTypeRegistry.SpecType.Heading,
							ISpecTypeRegistry.SpecType.Requirement);
			reqIfService.buildPrefixAndSuffix(specification, specObject,
					patternDescriptors, prefix, suffix);
		} catch (PatternException e) {
			MessageDialog.openError(agileGrid.getShell(), e.getTitle(),
					e.getMessage());
			// throw runtime exception to prevent the an editor from opening
			throw new RuntimeException(e);
		}

		return new XtextPopupCellEditor(reqIfService, patternService,
				agileGrid, specification, factory, resourceProvider,
				editingDomain, preferences, selectedCell, specObject, av,
				parent, affectedObject, prefix, suffix);
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
		if (xtextCellRenderer == null)
			xtextCellRenderer = new XtextCellRenderer();

		return xtextCellRenderer;
	}

	/**
	 * This returns EmbeddedXtextEditorConfiguration.gif. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getResourceLocator().getImage(
						"full/obj16/EmbeddedXtextEditorConfiguration"));
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
		Object o = getAttributeValue(av);

		if (o != null) {
			String value = o.toString();

			value = value.trim();

			/*
			 * Check if the string is longer as 30 characters and shorten it if
			 * this is the case.
			 */
			if (value.length() > 30) {
				value = value.substring(0, 28);
				value += "...";
			}

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
		return EmbeddedXtextEditorEditPlugin.INSTANCE;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EmbeddedXtextEditorConfiguration embeddedXtextEditorConfiguration = (EmbeddedXtextEditorConfiguration) object;
		String[] subst = new String[1];
		subst[0] = embeddedXtextEditorConfiguration.getDatatype() == null ? "(PLEASE SET TYPE)"
				: embeddedXtextEditorConfiguration.getDatatype().getLongName();

		return getString("_UI_EmbeddedXtextEditorConfiguration_type", subst);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.rmf.pror.reqif10.util.PresentationEditInterface#handleDragAndDrop
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
