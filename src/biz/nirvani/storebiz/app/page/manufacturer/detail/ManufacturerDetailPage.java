package biz.nirvani.storebiz.app.page.manufacturer.detail;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.LoadableDetachableModel;

import biz.nirvani.storebiz.app.common.panel.manufacturer.display.ManufacturerDetailDisplayPanel;
import biz.nirvani.storebiz.app.view.entity.ManufacturerViewModel;
import biz.nirvani.storebiz.biz.service.db.IManufacturerDBService;
import biz.nirvani.storebiz.biz.service.implementation.BusinessServiceImpl;

import com.google.appengine.api.datastore.Key;

public class ManufacturerDetailPage extends WebPage {
	public static String MANUFACTURER_ID = "MANUFACTURER_ID";
	public static String MANUFACTURER_OBJECT = "MANUFACTURER_OBJECT";
	public static String MANUFACTURER_KEY = "MANUFACTURER_KEY";

	private static IManufacturerDBService _manDBSrv = BusinessServiceImpl.getInstance().getManufacturerDBServiceInstance();

	private ManufacturerViewModel _manufacturerVM;

	public ManufacturerDetailPage(PageParameters parameters) {
		setVersioned(false);
		add(new FeedbackPanel("feedback"));

		_manufacturerVM = (ManufacturerViewModel) parameters
				.get(MANUFACTURER_OBJECT);
		if (_manufacturerVM == null) {
			String manufacturerId = (String) parameters.get(MANUFACTURER_ID);
			// Fetch the object from DB
		}
		if (_manufacturerVM == null) {
			Key gaeManufactuererKey = (Key) parameters.get(MANUFACTURER_KEY);
			// Fetch the Object from DB by Key
			_manufacturerVM = (ManufacturerViewModel) _manDBSrv
					.getByGaeKey(gaeManufactuererKey);
		}
		if (_manufacturerVM == null) {
			// DO STUFF TO SEND BACK THE USER TO RETURN PAGE
			return;
		}

		ManufacturerDetailDisplayPanel manufacturerDetailDisplayPanel = new ManufacturerDetailDisplayPanel("manufacturerDetailDisplayPanel", new LoadableDetachableModel<ManufacturerViewModel>() {
			
			@Override
			protected ManufacturerViewModel load() {
				// TODO Auto-generated method stub
				return _manufacturerVM;
			}
		});
		
		add(manufacturerDetailDisplayPanel);
	}
}
