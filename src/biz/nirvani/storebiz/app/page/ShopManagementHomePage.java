package biz.nirvani.storebiz.app.page;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.ExternalLink;

import biz.nirvani.storebiz.app.page.customer.registration.CustomerRegistrationPage;
import biz.nirvani.storebiz.app.page.manufacturer.listing.ManufacturerListingPage;
import biz.nirvani.storebiz.app.page.manufacturer.registration.ManufacturerRegistrationPage;
import biz.nirvani.storebiz.app.page.supplier.listing.SupplierListingPage;
import biz.nirvani.storebiz.app.page.supplier.registration.SupplierRegistrationPage;

import com.wicketinaction.HomePage;

public class ShopManagementHomePage extends WebPage {
	public ShopManagementHomePage(PageParameters pageParameters){
		String linkCustomerRegistrationPageUrl = (String)urlFor(CustomerRegistrationPage.class,pageParameters);
		add(new ExternalLink("linkCustomerRegistrationPage", linkCustomerRegistrationPageUrl));
		add(new ExternalLink("linkManufacturerRegistrationPage", (String) urlFor(ManufacturerRegistrationPage.class,pageParameters)));
		add(new ExternalLink("linkManufacturerListingPage",(String)urlFor(ManufacturerListingPage.class,pageParameters)));
		add(new ExternalLink("linkSupplierRegistrationPage", (String) urlFor(SupplierRegistrationPage.class,pageParameters)));
		add(new ExternalLink("linkSupplierListingPage",(String)urlFor(SupplierListingPage.class,pageParameters)));
		
		add(new ExternalLink("linkTestListEditor","#"));
		add(new ExternalLink("linkTestMultiFormPanel","#"));
		add(new ExternalLink("wicketInActionHomePage",(String)urlFor(HomePage.class,pageParameters)));
	}
}
