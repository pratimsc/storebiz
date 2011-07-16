package biz.storebiz.utils;

import java.util.Date;

import biz.storebiz.app.view.entity.ManufacturerViewModel;
import biz.storebiz.app.view.entity.SupplierViewModel;

import com.google.appengine.repackaged.com.google.common.base.Function;
import com.google.appengine.repackaged.com.google.common.collect.Ordering;

public abstract class AppOrderingProvider {
	private static final Ordering<ManufacturerViewModel> manufacturerIdOrdering = Ordering.natural().onResultOf(new Function<ManufacturerViewModel, String>() {

		@Override
		public String apply(ManufacturerViewModel from) {
			return from.getManufacturerId();
		}
	});
	
	private static final Ordering<ManufacturerViewModel> manufacturerNameOrdering = Ordering.natural().onResultOf(new Function<ManufacturerViewModel, String>() {

		@Override
		public String apply(ManufacturerViewModel from) {
			return from.getManufacturerName();
		}
	});
	
	private static final Ordering<ManufacturerViewModel> manufacturerStatusOrdering = Ordering.natural().onResultOf(new Function<ManufacturerViewModel, String>() {

		@Override
		public String apply(ManufacturerViewModel from) {
			return from.getStatus();
		}
	});
	
	private static final Ordering<ManufacturerViewModel> manufacturerPrimaryAddressCountryOrdering = Ordering.natural().onResultOf(new Function<ManufacturerViewModel, String>() {

		@Override
		public String apply(ManufacturerViewModel from) {
			return from.getPrimaryAddressCountry();
		}
	});
	
	private static final Ordering<ManufacturerViewModel> manufacturerPrimaryAddressCountyOrdering = Ordering.natural().onResultOf(new Function<ManufacturerViewModel, String>() {

		@Override
		public String apply(ManufacturerViewModel from) {
			return (from.getPrimaryAddressCounty()==null)?"":from.getPrimaryAddressCounty();
		}
	});
	
	private static final Ordering<ManufacturerViewModel> manufacturerRegistrationDateOrdering = Ordering.natural().onResultOf(new Function<ManufacturerViewModel, Date>() {

		@Override
		public Date apply(ManufacturerViewModel from) {
			return from.getManufacturerRegistrationDate();
		}
	});
	
	private static final Ordering<SupplierViewModel> supplierIdOrdering = Ordering.natural().onResultOf(new Function<SupplierViewModel, String>() {

		@Override
		public String apply(SupplierViewModel from) {
			return from.getSupplierId();
		}
	});
	
	private static final Ordering<SupplierViewModel> supplierNameOrdering = Ordering.natural().onResultOf(new Function<SupplierViewModel, String>() {

		@Override
		public String apply(SupplierViewModel from) {
			return from.getSupplierName();
		}
	});
	
	private static final Ordering<SupplierViewModel> supplierStatusOrdering = Ordering.natural().onResultOf(new Function<SupplierViewModel, String>() {

		@Override
		public String apply(SupplierViewModel from) {
			return from.getStatus();
		}
	});
	
	private static final Ordering<SupplierViewModel> supplierPrimaryAddressCountryOrdering = Ordering.natural().onResultOf(new Function<SupplierViewModel, String>() {

		@Override
		public String apply(SupplierViewModel from) {
			return (from.getPrimaryAddressCountry()==null)?"":from.getPrimaryAddressCountry();
		}
	});
	
	private static final Ordering<SupplierViewModel> supplierPrimaryAddressCountyOrdering = Ordering.natural().onResultOf(new Function<SupplierViewModel, String>() {

		@Override
		public String apply(SupplierViewModel from) {
			return (from.getPrimaryAddressCounty()==null)?"":from.getPrimaryAddressCounty();
		}
	});
	
	private static final Ordering<SupplierViewModel> supplierRegistrationDateOrdering = Ordering.natural().onResultOf(new Function<SupplierViewModel, Date>() {

		@Override
		public Date apply(SupplierViewModel from) {
			return from.getSupplierRegistrationDate();
		}
	});

	public static Ordering<ManufacturerViewModel> getManufactureridordering() {
		return manufacturerIdOrdering;
	}

	public static Ordering<ManufacturerViewModel> getManufacturernameordering() {
		return manufacturerNameOrdering;
	}

	public static Ordering<ManufacturerViewModel> getManufacturerstatusordering() {
		return manufacturerStatusOrdering;
	}

	public static Ordering<ManufacturerViewModel> getManufacturerprimaryaddresscountryordering() {
		return manufacturerPrimaryAddressCountryOrdering;
	}

	public static Ordering<ManufacturerViewModel> getManufacturerprimaryaddresscountyordering() {
		return manufacturerPrimaryAddressCountyOrdering;
	}

	public static Ordering<ManufacturerViewModel> getManufacturerregistrationdateordering() {
		return manufacturerRegistrationDateOrdering;
	}

	public static Ordering<SupplierViewModel> getSupplieridordering() {
		return supplierIdOrdering;
	}

	public static Ordering<SupplierViewModel> getSuppliernameordering() {
		return supplierNameOrdering;
	}

	public static Ordering<SupplierViewModel> getSupplierstatusordering() {
		return supplierStatusOrdering;
	}

	public static Ordering<SupplierViewModel> getSupplierprimaryaddresscountryordering() {
		return supplierPrimaryAddressCountryOrdering;
	}

	public static Ordering<SupplierViewModel> getSupplierprimaryaddresscountyordering() {
		return supplierPrimaryAddressCountyOrdering;
	}

	public static Ordering<SupplierViewModel> getSupplierregistrationdateordering() {
		return supplierRegistrationDateOrdering;
	}
	
	
	
}
