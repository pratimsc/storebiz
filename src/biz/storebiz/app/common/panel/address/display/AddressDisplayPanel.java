package biz.storebiz.app.common.panel.address.display;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;

import biz.storebiz.app.view.entity.AddressViewModel;
import biz.storebiz.app.view.entity.PhoneNumberViewModel;

public class AddressDisplayPanel extends Panel {

	public AddressDisplayPanel(String id, IModel<AddressViewModel> model) {
		super(id, model);
		prepareAddressDisplayPanelLayout(model.getObject());
	}

	private void prepareAddressDisplayPanelLayout(AddressViewModel addressVM) {

		Label addressDisplayName = new Label("addressDisplayName",
				addressVM.getAddressDisplayName());
		add(addressDisplayName);

		Label contactFullName = new Label("contactFullName",
				addressVM.getContactFullName());
		add(contactFullName);

		// Write code for address line repeater
		ListView<String> addressLines = new ListView<String>("addressLines",
				addressVM.getAddressLines()) {

			@Override
			protected void populateItem(ListItem<String> item) {
				Label addressLineValue = new Label("addressLineValue",
						item.getModel());
				item.add(addressLineValue);
			}
		};
		add(addressLines);

		Label city = new Label("city", addressVM.getCity());
		add(city);

		Label county = new Label("county", addressVM.getCounty());
		add(county);

		Label country = new Label("country", addressVM.getCountry());
		add(country);

		Label postCode = new Label("postCode", addressVM.getPostCode());
		add(postCode);

		ListView<PhoneNumberViewModel> phoneNumbers = new ListView<PhoneNumberViewModel>(
				"phoneNumbers", addressVM.getPhoneNumbers()) {

			@Override
			protected void populateItem(ListItem<PhoneNumberViewModel> item) {
				Label phoneNumberType = new Label("phoneNumberType", item
						.getModelObject().getPhoneNumberType());
				item.add(phoneNumberType);
				Label phoneNumberValue = new Label("phoneNumberValue", item
						.getModelObject().getPhoneNumberValue());
				item.add(phoneNumberValue);
			}
		};
		add(phoneNumbers);
	}

}
