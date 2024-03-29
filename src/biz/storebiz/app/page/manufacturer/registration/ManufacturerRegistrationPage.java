package biz.storebiz.app.page.manufacturer.registration;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

import biz.storebiz.app.common.panel.address.editable.AddressEditablePanel;
import biz.storebiz.app.common.panel.address.editable.AddressEditablePanelModel;
import biz.storebiz.app.entity.view.AddressViewModel;
import biz.storebiz.app.entity.view.ManufacturerViewModel;
import biz.storebiz.app.page.SecurePage;
import biz.storebiz.app.page.manufacturer.detail.ManufacturerDetailPage;
import biz.storebiz.biz.common.constants.CAddressOwnerType;
import biz.storebiz.biz.common.constants.CAddressType;
import biz.storebiz.biz.common.constants.CEntityLifeStatus;
import biz.storebiz.biz.service.IBussinessService;
import biz.storebiz.biz.service.db.IManufacturerDBService;
import biz.storebiz.biz.service.implementation.BusinessServiceImpl;
import biz.storebiz.utils.AppOpertionalUtility;

public class ManufacturerRegistrationPage extends SecurePage {

	private ManufacturerViewModel manufacturer;
	private AddressEditablePanelModel addressModel;

	private Form<?> manufacturerRegistrationForm;

	public ManufacturerRegistrationPage(PageParameters parameters) {
		super(parameters);
	}

	@Override
	public void renderPageBodyContent(PageParameters parameters) {
		// Set the default country as INDIA. As the application will only run
		// for India
		addressModel = new AddressEditablePanelModel();
		addressModel.setCountry("INDIA");
		addressModel.setCountryCode("IN");

		add(new FeedbackPanel("feedback"));

		manufacturerRegistrationForm = new Form<Void>(
				"manufacturerRegistrationForm") {

			@Override
			public void onSubmit() {
				// Add the manufacturer to database and redirect to Manufacturer
				// detail page
				addressModel
						.setAddressOwnerType(CAddressOwnerType.ADDRESS_OWNER_TYPE_ORGANIZATION);
				addressModel
						.setAddressType(CAddressType.ADDRESS_TYPE_INDUSTRIAL);

				List<AddressViewModel> addrVMList = new ArrayList<AddressViewModel>();
				addrVMList.add(new AddressViewModel(addressModel));
				manufacturer.setPostalAddresses(addrVMList);
				// By default make the manufacturer status active.
				manufacturer.setStatus(CEntityLifeStatus.ACTIVE);
				manufacturer.setPrimaryAddressCountryCode(addrVMList.get(0)
						.getCountryCode());
				manufacturer.setPrimaryAddressCountry(addrVMList.get(0)
						.getCountry());
				manufacturer.setPrimaryAddressCountyCode(addrVMList.get(0)
						.getCountyCode());
				manufacturer.setPrimaryAddressCounty(addrVMList.get(0)
						.getCounty());

				// Now add the Manufacturer in the DataBase
				IManufacturerDBService mnDbsrv = BusinessServiceImpl
						.getInstance().getManufacturerDBServiceInstance();
				manufacturer = mnDbsrv.put(manufacturer);

				// info("Manufacturer information is registered with the system. The details are below.");
				// info(manufacturer.toString());

				// Direct the customer to Manufacturer detail page

				PageParameters pars = new PageParameters();
				pars.put(ManufacturerDetailPage.MANUFACTURER_OBJECT,
						manufacturer);
				setResponsePage(new ManufacturerDetailPage(pars));
			}

		};
		add(manufacturerRegistrationForm);

		manufacturerRegistrationForm.add(new Label("manufacturerNameLabel",
				new Model("Manufacturer Name")));

		TextField<String> manufacturerNameTxt = new TextField<String>(
				"manufacturerName", new PropertyModel(this,
						"manufacturer.manufacturerName"));
		manufacturerRegistrationForm.add(manufacturerNameTxt);
		AppOpertionalUtility.prepareFormComponents(manufacturerNameTxt, true,
				"Manufacturer's Name", 1, 150, true);

		AddressEditablePanel addressPanel = new AddressEditablePanel(
				"manufacturerAddress",
				new PropertyModel<AddressEditablePanelModel>(this,
						"addressModel"));
		manufacturerRegistrationForm.add(addressPanel);
	}

}
