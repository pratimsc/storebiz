package biz.storebiz.app.page;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.link.ExternalLink;

import biz.storebiz.app.page.customer.registration.CustomerRegistrationPage;
import biz.storebiz.app.page.manufacturer.listing.ManufacturerListingPage;
import biz.storebiz.app.page.manufacturer.registration.ManufacturerRegistrationPage;
import biz.storebiz.app.page.supplier.listing.SupplierListingPage;
import biz.storebiz.app.page.supplier.registration.SupplierRegistrationPage;

import com.wicketinaction.HomePage;

public class ShopManagementHomePage extends SecurePage {
	public ShopManagementHomePage(PageParameters parameters) {
		super(parameters);
	}

	@Override
	public void renderPageBodyContent(PageParameters parameters) {
		String linkCustomerRegistrationPageUrl = (String) urlFor(
				CustomerRegistrationPage.class, parameters);
		add(new ExternalLink("linkCustomerRegistrationPage",
				linkCustomerRegistrationPageUrl));
		add(new ExternalLink("linkManufacturerRegistrationPage",
				(String) urlFor(ManufacturerRegistrationPage.class, parameters)));
		add(new ExternalLink("linkManufacturerListingPage", (String) urlFor(
				ManufacturerListingPage.class, parameters)));
		add(new ExternalLink("linkSupplierRegistrationPage", (String) urlFor(
				SupplierRegistrationPage.class, parameters)));
		add(new ExternalLink("linkSupplierListingPage", (String) urlFor(
				SupplierListingPage.class, parameters)));

		add(new ExternalLink("linkTestListEditor", "#"));
		add(new ExternalLink("linkTestMultiFormPanel", "#"));
		add(new ExternalLink("wicketInActionHomePage", (String) urlFor(
				HomePage.class, parameters)));
	}
}
