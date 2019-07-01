package de.fraunhofer.iem.reqpat.rmf.presentation.embeddedxtexteditor;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.service.prefs.BackingStoreException;

/**
 * 
 * @author Frederik Knust
 * 
 */
public class ReqPatPreferencesPage extends PreferencePage implements
		IWorkbenchPreferencePage {

	private IEclipsePreferences preferences;
	private Button autoCheckButton;

	public ReqPatPreferencesPage() {
	}

	public ReqPatPreferencesPage(String title) {
		super(title);
	}

	public ReqPatPreferencesPage(String title, ImageDescriptor image) {
		super(title, image);
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite autoCheckComposite = new Composite(parent, SWT.None);
		RowLayout rowLayout = new RowLayout();
		rowLayout.wrap = true;
		autoCheckComposite.setLayout(rowLayout);

		if (preferences != null) {
			autoCheckButton = new Button(autoCheckComposite, SWT.CHECK);
			autoCheckButton.setSelection(preferences.getBoolean(
					Activator.AUTO_CHECK, false));

			Label autoChecklabel = new Label(autoCheckComposite, SWT.None);
			autoChecklabel
					.setText("Automatically check document after changes");
		} else {
			new Label(autoCheckComposite, SWT.None)
					.setText("Unable to load preferences!");
		}

		return autoCheckComposite;
	}

	@Override
	public void init(IWorkbench workbench) {
		preferences = ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);
	}

	@Override
	protected void performDefaults() {
		if (autoCheckButton != null) {
			autoCheckButton.setSelection(false);
		}
	}

	@Override
	public boolean performOk() {
		if (preferences != null && autoCheckButton != null) {
			boolean autoCheck = autoCheckButton.getSelection();
			preferences.putBoolean(Activator.AUTO_CHECK, autoCheck);

			try {
				preferences.flush();
			} catch (BackingStoreException e) {
			}
		}

		return true;
	}
}
