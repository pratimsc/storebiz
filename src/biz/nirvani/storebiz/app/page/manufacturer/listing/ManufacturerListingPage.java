package biz.nirvani.storebiz.app.page.manufacturer.listing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

import biz.nirvani.storebiz.app.common.components.column.ClickablePropertyColumn;
import biz.nirvani.storebiz.app.common.panel.manufacturer.display.ManufacturerDetailDisplayPanel;
import biz.nirvani.storebiz.app.page.AppBasePage;
import biz.nirvani.storebiz.app.page.SecureAppBasePage;
import biz.nirvani.storebiz.app.view.entity.ManufacturerViewModel;
import biz.nirvani.storebiz.biz.common.constants.CApplicationConstants;
import biz.nirvani.storebiz.biz.service.implementation.BusinessServiceImpl;
import biz.nirvani.storebiz.utils.AppOpertionalUtility;
import biz.nirvani.storebiz.utils.AppOrderingProvider;

import com.google.appengine.repackaged.com.google.common.collect.Ordering;

public class ManufacturerListingPage extends SecureAppBasePage {
	private String _manSrchTxt;
	private List<IColumn<ManufacturerViewModel>> _columns = new ArrayList<IColumn<ManufacturerViewModel>>();
	private ManufacturerProvider _manProvider = new ManufacturerProvider();

	public ManufacturerListingPage(PageParameters parameters) {
		super(parameters);
		
		Form manSrchFrm = new Form("manufacturerSearch") {

			@Override
			protected void onSubmit() {
				_manProvider.setFilterText(_manSrchTxt);
			}
		};
		add(manSrchFrm);

		TextField<String> manufacturerSearchText = new TextField<String>(
				"manufacturerSearchText", new PropertyModel<String>(this,
						"_manSrchTxt"));
		manSrchFrm.add(manufacturerSearchText);
		AppOpertionalUtility.prepareFormComponents(manufacturerSearchText,
				true, "Manufactuerer Search Text", 1, 150, true);

		prepareDataListViewColumns();
		DefaultDataTable<ManufacturerViewModel> ddt = new DefaultDataTable<ManufacturerViewModel>(
				"manufacturerList",
				_columns,
				_manProvider,
				CApplicationConstants.APP_PAGINATION_NUMBER_OF_RECORDS_IN_A_PAGE);
		add(ddt);

		Label tmpLabel = new Label("manufacturerDetailDisplayPanel", "");
		add(tmpLabel);

	}

	private void prepareDataListViewColumns() {
		_columns.add(new ClickablePropertyColumn<ManufacturerViewModel>(Model
				.of("Manufacturer Id"), "manufacturerId", "manufacturerId") {

			@Override
			protected void onClick(IModel<ManufacturerViewModel> model) {
				ManufacturerDetailDisplayPanel manufacturerDetailDisplayPanel = new ManufacturerDetailDisplayPanel(
						"manufacturerDetailDisplayPanel", model);
				ManufacturerListingPage.this
						.remove("manufacturerDetailDisplayPanel");
				ManufacturerListingPage.this
						.add(manufacturerDetailDisplayPanel);

			}
		});

		_columns.add(new PropertyColumn<ManufacturerViewModel>(Model
				.of("Manufacturer Name"), "manufacturerName",
				"manufacturerName"));
		_columns.add(new PropertyColumn<ManufacturerViewModel>(Model
				.of("Status"), "status", "status"));
		_columns.add(new PropertyColumn<ManufacturerViewModel>(Model
				.of("Primary Office Country"), "primaryAddressCountry",
				"primaryAddressCountry"));
		_columns.add(new PropertyColumn<ManufacturerViewModel>(Model
				.of("Primary Office County"), "primaryAddressCounty",
				"primaryAddressCounty"));
		_columns.add(new PropertyColumn<ManufacturerViewModel>(Model
				.of("Registration Date"), "manufacturerRegistrationDate",
				"manufacturerRegistrationDate"));
	}

	private class ManufacturerProvider extends
			SortableDataProvider<ManufacturerViewModel> {
		private String filterText;
		private List<ManufacturerViewModel> manVMList = new ArrayList<ManufacturerViewModel>();

		public ManufacturerProvider() {
			setSort("manufacturerRegistrationDate", true);
		}

		@Override
		public int size() {
			return (manVMList == null) ? 0 : manVMList.size();
		}

		@Override
		public IModel<ManufacturerViewModel> model(ManufacturerViewModel object) {
			return Model.of(object);
		}

		@Override
		public Iterator<? extends ManufacturerViewModel> iterator(int first,
				int count) {
			if (manVMList == null) {
				return new ArrayList<ManufacturerViewModel>().iterator();
			}

			// Logic for sorting
			String sortOrder = getSort().getProperty();
			Ordering<ManufacturerViewModel> orderer;
			if (sortOrder.equals("manufacturerId")) {
				orderer = AppOrderingProvider.getManufactureridordering();
			} else if (sortOrder.equals("manufacturerName")) {
				orderer = AppOrderingProvider.getManufacturernameordering();
			} else if (sortOrder.equals("status")) {
				orderer = AppOrderingProvider.getManufacturerstatusordering();
			} else if (sortOrder.equals("primaryAddressCountry")) {
				orderer = AppOrderingProvider
						.getManufacturerprimaryaddresscountryordering();
			} else if (sortOrder.equals("primaryAddressCounty")) {
				orderer = AppOrderingProvider
						.getManufacturerprimaryaddresscountyordering();
			} else {
				orderer = AppOrderingProvider
						.getManufacturerregistrationdateordering();
			}

			List<ManufacturerViewModel> sortedManVMList;
			if (getSort().isAscending()) {
				sortedManVMList = orderer.sortedCopy(manVMList);
			} else {
				sortedManVMList = orderer.reverse().sortedCopy(manVMList);
			}

			// Return the subset of SortObject
			return sortedManVMList.subList(first,
					Math.min(first + count, sortedManVMList.size())).iterator();
		}

		public String getFilterText() {
			return filterText;
		}

		public void setFilterText(String filterText) {
			this.filterText = filterText;
			manVMList = BusinessServiceImpl.getInstance()
					.getManufacturerDBServiceInstance().findByText(filterText);
		}

	}
}
