package biz.nirvani.storebiz.biz.service;

import biz.nirvani.storebiz.biz.service.db.IAddressDBService;
import biz.nirvani.storebiz.biz.service.db.ICountryDBService;
import biz.nirvani.storebiz.biz.service.db.ICountyDBService;
import biz.nirvani.storebiz.biz.service.db.IManufacturerDBService;
import biz.nirvani.storebiz.biz.service.db.ISupplierDBService;

public interface IBussinessService {
	public IManufacturerDBService getManufacturerDBServiceInstance();
	public ISupplierDBService getSupplierDBServiceInstance();
	public IAddressDBService getAddressDBServiceInstance();
	public ICountryDBService getCountryDBServiceInstance();
	public ICountyDBService getCountyDBServiceInstance();
}
