package biz.nirvani.storebiz.app.page.supplier.listing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

import biz.nirvani.storebiz.app.common.components.column.ClickablePropertyColumn;
import biz.nirvani.storebiz.app.common.panel.supplier.display.SupplierDetailDisplayPanel;
import biz.nirvani.storebiz.app.view.entity.SupplierViewModel;
import biz.nirvani.storebiz.biz.common.constants.CApplicationConstants;
import biz.nirvani.storebiz.biz.service.implementation.BusinessServiceImpl;
import biz.nirvani.storebiz.utils.AppOpertionalUtility;
import biz.nirvani.storebiz.utils.AppOrderingProvider;

import com.google.appengine.repackaged.com.google.common.collect.Ordering;

public class SupplierListingPage extends WebPage {
	private String _suppSrchTxt;
	private List<IColumn<SupplierViewModel>> _columns = new ArrayList<IColumn<SupplierViewModel>>();
	private SupplierProvider _suppProvider = new SupplierProvider();

	public SupplierListingPage(PageParameters parameters) {
		setVersioned(false);
		
		Form suppSrchFrm = new Form("supplierSearch") {

			@Override
			protected void onSubmit() {
				_suppProvider.setFilterText(_suppSrchTxt);
			}
		};
		add(suppSrchFrm);

		TextField<String> supplierSearchText = new TextField<String>(
				"supplierSearchText", new PropertyModel<String>(this,
						"_suppSrchTxt"));
		suppSrchFrm.add(supplierSearchText);
		AppOpertionalUtility.prepareFormComponents(supplierSearchText,
				true, "Supplier Search Text", 1, 150, true);

		prepareDataListViewColumns();
		DefaultDataTable<SupplierViewModel> ddt = new DefaultDataTable<SupplierViewModel>(
				"supplierList",
				_columns,
				_suppProvider,
				CApplicationConstants.APP_PAGINATION_NUMBER_OF_RECORDS_IN_A_PAGE);
		add(ddt);

		Label tmpLabel = new Label("supplierDetailDisplayPanel", "");
		add(tmpLabel);

	}

	private void prepareDataListViewColumns() {
		_columns.add(new ClickablePropertyColumn<SupplierViewModel>(Model
				.of("Supplier Id"), "supplierId", "supplierId") {

			@Override
			protected void onClick(IModel<SupplierViewModel> model) {
				SupplierDetailDisplayPanel supplierDetailDisplayPanel = new SupplierDetailDisplayPanel(
						"supplierDetailDisplayPanel", model);
				SupplierListingPage.this
						.remove("supplierDetailDisplayPanel");
				SupplierListingPage.this
						.add(supplierDetailDisplayPanel);

			}
		});

		_columns.add(new PropertyColumn<SupplierViewModel>(Model
				.of("Supplier Name"), "supplierName",
				"manufacturerName"));
		_columns.add(new PropertyColumn<SupplierViewModel>(Model
				.of("Status"), "status", "status"));
		_columns.add(new PropertyColumn<SupplierViewModel>(Model
				.of("Primary Office Country"), "primaryAddressCountry",
				"primaryAddressCountryCode"));
		_columns.add(new PropertyColumn<SupplierViewModel>(Model
				.of("Primary Office County"), "primaryAddressCounty",
				"primaryAddressCountyCode"));
		_columns.add(new PropertyColumn<SupplierViewModel>(Model
				.of("Registration Date"), "supplierRegistrationDate",
				"supplierRegistrationDate"));
	}

	private class SupplierProvider extends
			SortableDataProvider<SupplierViewModel> {
		private String filterText;
		private List<SupplierViewModel> suppVMList = new ArrayList<SupplierViewModel>();

		public SupplierProvider() {
			setSort("manufacturerRegistrationDate", true);
		}

		@Override
		public int size() {
			return (suppVMList == null) ? 0 : suppVMList.size();
		}

		@Override
		public IModel<SupplierViewModel> model(SupplierViewModel object) {
			return Model.of(object);
		}

		@Override
		public Iterator<? extends SupplierViewModel> iterator(int first,
				int count) {
			if (suppVMList == null) {
				return new ArrayList<SupplierViewModel>().iterator();
			}

			// Logic for sorting
			String sortOrder = getSort().getProperty();
			Ordering<SupplierViewModel> orderer;
			if (sortOrder.equals("supplierId")) {
				orderer = AppOrderingProvider.getSupplieridordering();
			} else if (sortOrder.equals("supplierName")) {
				orderer = AppOrderingProvider.getSuppliernameordering();
			} else if (sortOrder.equals("status")) {
				orderer = AppOrderingProvider.getSupplieridordering();
			} else if (sortOrder.equals("primaryAddressCountry")) {
				orderer = AppOrderingProvider
						.getSupplierprimaryaddresscountryordering();
			} else if (sortOrder.equals("primaryAddressCounty")) {
				orderer = AppOrderingProvider
						.getSupplierprimaryaddresscountyordering();
			} else {
				orderer = AppOrderingProvider
						.getSupplierregistrationdateordering();
			}

			List<SupplierViewModel> sortedManVMList;
			if (getSort().isAscending()) {
				sortedManVMList = orderer.sortedCopy(suppVMList);
			} else {
				sortedManVMList = orderer.reverse().sortedCopy(suppVMList);
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
			suppVMList = BusinessServiceImpl.getInstance()
					.getSupplierDBServiceInstance().findByText(filterText);
		}

	}
}
