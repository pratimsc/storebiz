package biz.storebiz.app.page.supplier.detail;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.LoadableDetachableModel;

import biz.storebiz.app.common.panel.supplier.display.SupplierDetailDisplayPanel;
import biz.storebiz.app.entity.view.SupplierViewModel;
import biz.storebiz.app.page.AppBasePage;
import biz.storebiz.app.page.SecurePage;
import biz.storebiz.biz.service.db.ISupplierDBService;
import biz.storebiz.biz.service.implementation.BusinessServiceImpl;

import com.google.appengine.api.datastore.Key;

public class SupplierDetailPage extends SecurePage {
	public static String SUPPLIER_ID = "SUPPLIER_ID";
	public static String SUPPLIER_OBJECT = "SUPPLIER_OBJECT";
	public static String SUPPLIER_KEY = "SUPPLIER_KEY";

	private static ISupplierDBService _suppDBSrv = BusinessServiceImpl
			.getInstance().getSupplierDBServiceInstance();

	private SupplierViewModel _supplierVM;

	public SupplierDetailPage(PageParameters parameters) {
		super(parameters);
	}

	@Override
	public void renderPageBodyContent(PageParameters parameters) {
		add(new FeedbackPanel("feedback"));

		_supplierVM = (SupplierViewModel) parameters.get(SUPPLIER_OBJECT);
		if (_supplierVM == null) {
			String supplierId = (String) parameters.get(SUPPLIER_ID);
			// Fetch the object from DB
		}
		if (_supplierVM == null) {
			Key gaeKey = (Key) parameters.get(SUPPLIER_KEY);
			// Fetch the Object from DB by Key
			_supplierVM = (SupplierViewModel) _suppDBSrv.getByGaeKey(gaeKey);
		}
		if (_supplierVM == null) {
			// DO STUFF TO SEND BACK THE USER TO RETURN PAGE
			return;
		}

		SupplierDetailDisplayPanel supplierDetailDisplayPanel = new SupplierDetailDisplayPanel(
				"supplierDetailDisplayPanel",
				new LoadableDetachableModel<SupplierViewModel>() {

					@Override
					protected SupplierViewModel load() {
						// TODO Auto-generated method stub
						return _supplierVM;
					}
				});

		add(supplierDetailDisplayPanel);

	}
}
