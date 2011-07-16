package biz.storebiz.app.common.panel.address.editable;

import java.util.List;

import org.apache.wicket.feedback.ComponentFeedbackMessageFilter;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.FormComponentPanel;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;

import biz.storebiz.app.view.entity.CountyViewModel;
import biz.storebiz.biz.service.IBussinessService;
import biz.storebiz.biz.service.db.ICountyDBService;
import biz.storebiz.biz.service.implementation.BusinessServiceImpl;
import biz.storebiz.utils.AppOpertionalUtility;

import com.wicketinaction.listeditor.ListEditor;
import com.wicketinaction.listeditor.ListItem;
import com.wicketinaction.listeditor.RemoveButton;

public class AddressEditablePanel extends FormComponentPanel<AddressEditablePanelModel> {

	private static IBussinessService ibs = BusinessServiceImpl.getInstance();
	private static ICountyDBService countySrv = ibs
			.getCountyDBServiceInstance();

	private AddressEditablePanelModel addressModel = new AddressEditablePanelModel();

	private TextField<String> addressDisplayName;
	private TextField<String> contactFullName;
	private ListEditor<AddressEditablePanelAddressLine> addressLineEditor;
	private TextField<String> city;
	private DropDownChoice<CountyViewModel> countiesDDChoice;
	private TextField<String> country;
	private TextField<String> postCode;
	private ListEditor<AddressEditablePanelPhoneNumberPanelModel> phoneNumberEditor;
	
	private CountyViewModel countyViewModel;

	public AddressEditablePanel(String id, IModel<AddressEditablePanelModel> model) {
		super(id, model);
		addressModel = model.getObject();
		model.setObject(addressModel);
		prepareAddressPanelLayout();
	}

	private void prepareAddressPanelLayout() {		

		addressDisplayName = new TextField<String>("addressDisplayName",
				new PropertyModel<String>(this,
						"addressModel.addressDisplayName"));
		add(addressDisplayName);
		AppOpertionalUtility.prepareFormComponents(addressDisplayName, true,
				"Address Display Name", -1, 150, true);

		contactFullName = new TextField<String>("contactFullName",
				new PropertyModel<String>(this, "addressModel.contactFullName"));
		add(contactFullName);
		AppOpertionalUtility.prepareFormComponents(contactFullName, true,
				"Contact Full Name", -1, 150, true);

		add(new Label("addressLinesLabel", "Address Line"));

		addressLineEditor = new ListEditor<AddressEditablePanelAddressLine>("addressLines",
				new PropertyModel<List<AddressEditablePanelAddressLine>>(this, "addressModel.addressLines")) {
			@Override
			protected void onPopulateItem(ListItem<AddressEditablePanelAddressLine> item) {
				item.setModel(new CompoundPropertyModel<AddressEditablePanelAddressLine>(item.getModel()));

				TextField addressLineTxtFld = new TextField("addressLineValue");
				item.add(addressLineTxtFld);
				AppOpertionalUtility.prepareFormComponents(addressLineTxtFld,
						true, "Line " + item.getIndex() + 1, 1, 150, true);

				item.add(new RemoveButton("remove"));

			}
		};
		add(addressLineEditor);

		add(new Button("addAddressLine") {

			@Override
			public void onSubmit() {
				addressLineEditor.addItem(new AddressEditablePanelAddressLine());
			}
		}.setDefaultFormProcessing(false));

		add(new Label("phoneNumbersLabel", "Phone Numbers"));

		phoneNumberEditor = new ListEditor<AddressEditablePanelPhoneNumberPanelModel>(
				"phoneNumbers", new PropertyModel<List<AddressEditablePanelPhoneNumberPanelModel>>(this,
						"addressModel.phoneNumbers")) {
			@Override
			protected void onPopulateItem(ListItem<AddressEditablePanelPhoneNumberPanelModel> item) {
				item.setModel(new CompoundPropertyModel<AddressEditablePanelPhoneNumberPanelModel>(
						item.getModel()));

				TextField phoneNumberType = new TextField("phoneNumberType");
				item.add(phoneNumberType);
				AppOpertionalUtility.prepareFormComponents(phoneNumberType,
						true, "Phone Number Type", 1, 100, false);

				TextField phoneNumberValue = new TextField("phoneNumberValue");
				item.add(phoneNumberValue);
				AppOpertionalUtility.prepareFormComponents(phoneNumberValue,
						true, "Phone Number", 1, 15, true);

				item.add(new RemoveButton("remove"));
			}
		};
		add(phoneNumberEditor);
		add(new Button("addPhoneNumber") {
			@Override
			public void onSubmit() {
				phoneNumberEditor.addItem(new AddressEditablePanelPhoneNumberPanelModel());
			}
		}.setDefaultFormProcessing(false));

		city = new TextField<String>("city", new PropertyModel<String>(this,
				"addressModel.city"));
		add(city);
		AppOpertionalUtility.prepareFormComponents(city, true, "City", -1, 150,
				true);

		countiesDDChoice = new DropDownChoice<CountyViewModel>("counties",
				new PropertyModel<CountyViewModel>(this, "countyViewModel"),
				new CountyPanelModel(), new ChoiceRenderer<CountyViewModel>(
						"countyName", "countyCode")) {

			@Override
			protected boolean wantOnSelectionChangedNotifications() {
				return true;
			}

			@Override
			protected void onSelectionChanged(CountyViewModel newSelection) {
				addressModel.setCounty(newSelection.getCountyName());
				addressModel.setCountyCode(newSelection.getCountyCode());

			}

		};
		countiesDDChoice.setRequired(true);
		add(countiesDDChoice);
		add(new FeedbackPanel("countiesFeedbackPanel",
				new ComponentFeedbackMessageFilter(countiesDDChoice)));

		country = new TextField<String>("country", new PropertyModel<String>(this,
				"addressModel.country"));
		add(country);
		country.setEnabled(false);

		postCode = new TextField<String>("postCode", new PropertyModel<String>(this,
				"addressModel.postCode"));
		add(postCode);
		AppOpertionalUtility.prepareFormComponents(postCode, true, "Post Code",
				-1, 150, true);

	}

	@Override
	public void convertInput() {
		setConvertedInput(addressModel);
	}

	private class CountyPanelModel extends
			LoadableDetachableModel<List<? extends CountyViewModel>> {
		protected List<? extends CountyViewModel> load() {
			String countryCode = (addressModel.getCountryCode() == null) ? "IN"
					: addressModel.getCountryCode();

			return countySrv.getCountyByCountryCode(countryCode, "ISO");
		}
	}
}
