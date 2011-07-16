package biz.storebiz.app.common.panel.supplier.display;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import biz.storebiz.app.common.panel.address.display.AddressDisplayPanel;
import biz.storebiz.app.view.entity.AddressViewModel;
import biz.storebiz.app.view.entity.SupplierViewModel;
import biz.storebiz.utils.AppOpertionalUtility;

public class SupplierDetailDisplayPanel extends Panel {

	public SupplierDetailDisplayPanel(String id, IModel<SupplierViewModel> model) {
		super(id, model);
		prepareSupplierDetailViewPanelLayout(model.getObject());
	}

	private void prepareSupplierDetailViewPanelLayout(final SupplierViewModel supplierVM) {
		if (supplierVM == null) {
			// DO STUFF TO SEND BACK THE USER TO RETURN PAGE
			return;
		}

		Label supplierId = new Label("supplierId",
				supplierVM.getSupplierId());
		add(supplierId);

		Label supplierName = new Label("supplierName",
				supplierVM.getSupplierName());
		add(supplierName);

		AddressDisplayPanel manufacturerAddress = new AddressDisplayPanel(
				"supplierAddress",
				new LoadableDetachableModel<AddressViewModel>() {
					@Override
					protected AddressViewModel load() {
						return supplierVM.getPostalAddresses().get(0);
					}
				});
		add(manufacturerAddress);

		Label supplierRegistrationDate = new Label(
				"supplierRegistrationDate",
				AppOpertionalUtility.formatDateForDisplay(supplierVM
						.getSupplierRegistrationDate()));
		add(supplierRegistrationDate);

		Label supplierRegistrationExpiryDate = new Label(
				"supplierRegistrationExpiryDate",
				AppOpertionalUtility.formatDateForDisplay(supplierVM
						.getSupplierRegistrationExpiryDate()));
		add(supplierRegistrationExpiryDate);

		Label status = new Label("status", supplierVM.getStatus());
		add(status);

		Label lastModificationDate = new Label("lastModificationDate",
				AppOpertionalUtility.formatDateForDisplay(supplierVM
						.getLastModificationDate()));
		add(lastModificationDate);
	}
}
