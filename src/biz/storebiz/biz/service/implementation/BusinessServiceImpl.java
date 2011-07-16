package biz.storebiz.biz.service.implementation;

import java.io.Serializable;

import biz.storebiz.biz.service.IBussinessService;
import biz.storebiz.biz.service.db.IAddressDBService;
import biz.storebiz.biz.service.db.ICountryDBService;
import biz.storebiz.biz.service.db.ICountyDBService;
import biz.storebiz.biz.service.db.IManufacturerDBService;
import biz.storebiz.biz.service.db.ISupplierDBService;
import biz.storebiz.biz.service.db.implementation.AddressDBServiceImpl;
import biz.storebiz.biz.service.db.implementation.CountryDBServiceImpl;
import biz.storebiz.biz.service.db.implementation.CountyDBServiceImpl;
import biz.storebiz.biz.service.db.implementation.ManufacturerDBServiceImpl;
import biz.storebiz.biz.service.db.implementation.SupplierDBServiceImpl;

public final class BusinessServiceImpl implements IBussinessService,Serializable {
	private static IBussinessService businessService = new BusinessServiceImpl();

	private static IManufacturerDBService manufacturerDBSrv;
	private static ISupplierDBService supplierDBSrv;
	private static IAddressDBService addressDBSrv;
	private static ICountryDBService countryDBSrv;
	private static ICountyDBService countyDBSrv;

	private BusinessServiceImpl() {
		super();
	}

	@Override
	public IManufacturerDBService getManufacturerDBServiceInstance() {
		if (manufacturerDBSrv == null) {
			manufacturerDBSrv = new ManufacturerDBServiceImpl();
		}
		return manufacturerDBSrv;
	}

	public static IBussinessService getInstance() {
		if (businessService == null) {
			businessService = new BusinessServiceImpl();
		}
		return businessService;
	}

	@Override
	public IAddressDBService getAddressDBServiceInstance() {
		if (addressDBSrv == null) {
			addressDBSrv = new AddressDBServiceImpl();
		}
		return addressDBSrv;
	}

	@Override
	public ICountryDBService getCountryDBServiceInstance() {
		if (countryDBSrv == null) {
			countryDBSrv = new CountryDBServiceImpl();
		}
		return countryDBSrv;
	}

	@Override
	public ICountyDBService getCountyDBServiceInstance() {
		if (countyDBSrv == null) {
			countyDBSrv = new CountyDBServiceImpl();
		}
		return countyDBSrv;
	}

	@Override
	public ISupplierDBService getSupplierDBServiceInstance() {
		if(supplierDBSrv == null){
			supplierDBSrv = new SupplierDBServiceImpl();
		}
		return supplierDBSrv;
	}

}
