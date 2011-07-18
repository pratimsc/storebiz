package biz.storebiz.app.common.panel.manufacturer.display;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;

import biz.storebiz.app.common.panel.address.display.AddressDisplayPanel;
import biz.storebiz.app.entity.view.AddressViewModel;
import biz.storebiz.app.entity.view.ManufacturerViewModel;
import biz.storebiz.utils.AppOpertionalUtility;

public class ManufacturerDetailDisplayPanel extends Panel {

	public ManufacturerDetailDisplayPanel(String id, IModel<ManufacturerViewModel> model) {
		super(id, model);
		prepareManufacturerDetailViewPanelLayout(model.getObject());
	}

	private void prepareManufacturerDetailViewPanelLayout(final ManufacturerViewModel manufacturerVM) {
		if (manufacturerVM == null) {
			// DO STUFF TO SEND BACK THE USER TO RETURN PAGE
			return;
		}

		Label manufacturerId = new Label("manufacturerId",
				manufacturerVM.getManufacturerId());
		add(manufacturerId);

		Label manufacturerName = new Label("manufacturerName",
				manufacturerVM.getManufacturerName());
		add(manufacturerName);

		AddressDisplayPanel manufacturerAddress = new AddressDisplayPanel(
				"manufacturerAddress",
				new LoadableDetachableModel<AddressViewModel>() {
					@Override
					protected AddressViewModel load() {
						return manufacturerVM.getPostalAddresses().get(0);
					}
				});
		add(manufacturerAddress);

		Label manufacturerRegistrationDate = new Label(
				"manufacturerRegistrationDate",
				AppOpertionalUtility.formatDateForDisplay(manufacturerVM
						.getManufacturerRegistrationDate()));
		add(manufacturerRegistrationDate);

		Label manufacturerRegistrationExpiryDate = new Label(
				"manufacturerRegistrationExpiryDate",
				AppOpertionalUtility.formatDateForDisplay(manufacturerVM
						.getManufacturerRegistrationExpiryDate()));
		add(manufacturerRegistrationExpiryDate);

		Label status = new Label("status", manufacturerVM.getStatus());
		add(status);

		Label lastModificationDate = new Label("lastModificationDate",
				AppOpertionalUtility.formatDateForDisplay(manufacturerVM
						.getLastModificationDate()));
		add(lastModificationDate);
	}
}
