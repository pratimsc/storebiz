package biz.storebiz.utils;

import java.util.ArrayList;
import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import biz.storebiz.app.entity.view.AddressViewModel;
import biz.storebiz.app.entity.view.ManufacturerViewModel;
import biz.storebiz.app.entity.view.PhoneNumberViewModel;
import biz.storebiz.app.entity.view.SupplierViewModel;
import biz.storebiz.app.entity.view.WebViewModel;
import biz.storebiz.biz.common.constants.CApplicationConstants;
import biz.storebiz.biz.service.IBussinessService;
import biz.storebiz.biz.service.db.IAddressDBService;
import biz.storebiz.biz.service.implementation.BusinessServiceImpl;
import biz.storebiz.db.entity.common.Address;
import biz.storebiz.db.entity.common.PhoneNumber;
import biz.storebiz.db.entity.manufacturer.Manufacturer;
import biz.storebiz.db.entity.supplier.Supplier;

public abstract class AppEntityConverter {
	private AppEntityConverter() {

	}

	public static AddressViewModel convertDBEntityToViewModel(Address address) {
		if (address == null) {
			return null;
		}
		AddressViewModel addressVM = new AddressViewModel();
		addressVM.setAddressDisplayName(address.getAddressDisplayName());
		addressVM.setAddressLines(address.getAddressLines());
		addressVM.setAddressownerKey(address.getAddressownerKey());
		addressVM.setAddressOwnerType(address.getAddressOwnerType());
		addressVM.setAddressRegistrationDate(address
				.getAddressRegistrationDate());
		addressVM.setAddressRegistrationExpiryDate(address
				.getAddressRegistrationExpiryDate());
		addressVM.setAddressType(address.getAddressType());
		addressVM.setCity(address.getCity());
		addressVM.setContactFullName(address.getContactFullName());
		addressVM.setCountry(address.getCountry());
		addressVM.setCountryCode(address.getCountryCode());
		addressVM.setCounty(address.getCounty());
		addressVM.setCountyCode(address.getCountyCode());
		addressVM.setCreationDate(address.getCreationDate());
		addressVM.setGaeAddressKey(address.getAddressKey());
		addressVM.setLastModificationDate(address.getLastModificationDate());
		addressVM.setPostCode(address.getPostCode());
		addressVM.setPrefferedAddress(address.isPrefferedAddress());

		List<PhoneNumberViewModel> phoneNumbersVM = new ArrayList<PhoneNumberViewModel>();
		for (PhoneNumber phoneNumber : address.getPhoneNumbers()) {
			phoneNumbersVM.add(new PhoneNumberViewModel(phoneNumber
					.getPhoneNumberType(), phoneNumber.getPhoneNumberValue()));
		}
		addressVM.setPhoneNumbers(phoneNumbersVM);

		return addressVM;
	}

	public static Address convertViewModelToDBEntity(
			AddressViewModel addressViewModel) {
		Address address = new Address();
		address.setAddressKey(addressViewModel.getGaeAddressKey());
		address.setAddressDisplayName(addressViewModel.getAddressDisplayName());
		address.setAddressLines(addressViewModel.getAddressLines());
		address.setAddressownerKey(addressViewModel.getAddressownerKey());
		address.setAddressOwnerType(addressViewModel.getAddressOwnerType());
		address.setAddressRegistrationDate(addressViewModel
				.getAddressRegistrationDate());
		address.setAddressRegistrationExpiryDate(addressViewModel
				.getAddressRegistrationExpiryDate());
		address.setAddressType(addressViewModel.getAddressType());
		address.setCity(addressViewModel.getCity());
		address.setContactFullName(addressViewModel.getContactFullName());
		address.setCountry(addressViewModel.getCountry());
		address.setCountryCode(addressViewModel.getCountryCode());
		address.setCounty(addressViewModel.getCounty());
		address.setCountyCode(address.getCountyCode());
		address.setCreationDate(addressViewModel.getCreationDate());
		address.setLastModificationDate(addressViewModel
				.getLastModificationDate());
		address.setPostCode(addressViewModel.getPostCode());
		address.setPrefferedAddress(addressViewModel.isPrefferedAddress());
		address.setCountyCode(addressViewModel.getCountyCode());
		address.setCountryCode(addressViewModel.getCountryCode());

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (PhoneNumberViewModel phoneNumberVM : addressViewModel
				.getPhoneNumbers()) {
			phoneNumbers.add(new PhoneNumber(
					phoneNumberVM.getPhoneNumberType(), phoneNumberVM
							.getPhoneNumberValue()));
		}
		address.setPhoneNumbers(phoneNumbers);
		address.setAddressRegistrationExpiryDate(CApplicationConstants
				.getAApplicationEntityDefaultExpirationDate());

		return address;
	}

	public static ManufacturerViewModel convertDBEntityToViewModel(
			Manufacturer manufacturer) {
		if (manufacturer == null) {
			return null;
		}
		ManufacturerViewModel manufacturerViewModel = new ManufacturerViewModel();
		manufacturerViewModel.setGaeManufacturerKey(manufacturer
				.getManufacturerKey());
		manufacturerViewModel.setManufacturerId(manufacturer
				.getManufacturerId());
		manufacturerViewModel.setManufacturerName(manufacturer
				.getManufacturerName());
		manufacturerViewModel.setStatus(manufacturer.getStatus());
		manufacturerViewModel.setPrimaryAddressCountryCode(manufacturer
				.getPrimaryAddressCountryCode());
		manufacturerViewModel.setPrimaryAddressCountry(manufacturer.getPrimaryAddressCountry());
		manufacturerViewModel.setPrimaryAddressCountyCode(manufacturer
				.getPrimaryAddressCountyCode());
		manufacturerViewModel.setPrimaryAddressCounty(manufacturer.getPrimaryAddressCounty());
		List<AddressViewModel> addrViewModels = new ArrayList<AddressViewModel>();
		for (Address address : manufacturer.getPostalAddresses()) {
			addrViewModels.add(AppEntityConverter
					.convertDBEntityToViewModel(address));
		}
		manufacturerViewModel.setPostalAddresses(addrViewModels);
		manufacturerViewModel.setCreationDate(manufacturer.getCreationDate());
		manufacturerViewModel.setLastModificationDate(manufacturer
				.getLastModificationDate());
		manufacturerViewModel.setManufacturerRegistrationDate(manufacturer
				.getManufacturerRegistrationDate());
		manufacturerViewModel
				.setManufacturerRegistrationExpiryDate(manufacturer
						.getManufacturerRegistrationExpiryDate());

		return manufacturerViewModel;
	}

	public static SupplierViewModel convertDBEntityToViewModel(Supplier supplier) {
		if (supplier == null) {
			return null;
		}
		SupplierViewModel supplierVM = new SupplierViewModel();
		supplierVM.setGaeSupplierKey(supplier.getSupplierKey());
		supplierVM.setSupplierId(supplier
				.getSupplierId());
		supplierVM.setSupplierName(supplier
				.getSupplierName());
		supplierVM.setStatus(supplier.getStatus());
		supplierVM.setPrimaryAddressCountryCode(supplier
				.getPrimaryAddressCountryCode());
		supplierVM.setPrimaryAddressCountry(supplier.getPrimaryAddressCountry());
		supplierVM.setPrimaryAddressCountyCode(supplier
				.getPrimaryAddressCountyCode());
		supplierVM.setPrimaryAddressCounty(supplier.getPrimaryAddressCounty());
		List<AddressViewModel> addrViewModels = new ArrayList<AddressViewModel>();
		for (Address address : supplier.getPostalAddresses()) {
			addrViewModels.add(AppEntityConverter
					.convertDBEntityToViewModel(address));
		}
		supplierVM.setPostalAddresses(addrViewModels);
		supplierVM.setCreationDate(supplier.getCreationDate());
		supplierVM.setLastModificationDate(supplier
				.getLastModificationDate());
		supplierVM.setSupplierRegistrationDate(supplier
				.getRegistrationDate());
		supplierVM
				.setSupplierRegistrationExpiryDate(supplier
						.getRegistrationExpiryDate());

		return supplierVM;
	}
}
