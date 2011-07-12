package biz.nirvani.storebiz.biz.service.db.implementation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slim3.datastore.Datastore;

import biz.nirvani.storebiz.app.view.entity.AddressViewModel;
import biz.nirvani.storebiz.app.view.entity.ManufacturerViewModel;
import biz.nirvani.storebiz.app.view.entity.WebViewModel;
import biz.nirvani.storebiz.biz.common.constants.CApplicationConstants;
import biz.nirvani.storebiz.biz.service.db.IManufacturerDBService;
import biz.nirvani.storebiz.biz.service.implementation.BusinessServiceImpl;
import biz.nirvani.storebiz.db.entity.common.Address;
import biz.nirvani.storebiz.db.entity.manufacturer.Manufacturer;
import biz.nirvani.storebiz.db.entity.manufacturer.ManufacturerMeta;
import biz.nirvani.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry;
import biz.nirvani.storebiz.utils.AppEntityConverter;
import biz.nirvani.storebiz.utils.AppOpertionalUtility;

import com.google.appengine.api.datastore.Key;

public class ManufacturerDBServiceImpl implements IManufacturerDBService , Serializable{


	@Override
	public List<ManufacturerViewModel> findByText(String findText) {
		findText = findText.toUpperCase();
		List<ManufacturerViewModel> manVMList = new ArrayList<ManufacturerViewModel>();
		ManufacturerMeta manMeta = ManufacturerMeta.get();
		
		List<Manufacturer> manList1 = Datastore.query(manMeta).filter(manMeta.manufacturerName.startsWith(findText)).asList();
		List<Manufacturer> manList2 = Datastore.query(manMeta).filter(manMeta.manufacturerId.startsWith(findText)).asList();
		List<Manufacturer> manList3 = Datastore.query(manMeta).filter(manMeta.primaryAddressCountry.startsWith(findText)).asList();
		
		if(manList1!=null && manList1.size()>0){
			for(Manufacturer tMan : manList1){
				manVMList.add(AppEntityConverter.convertDBEntityToViewModel(tMan));			
			}
		}
		if(manList2!=null && manList2.size()>0){
			for(Manufacturer tMan : manList2){
				manVMList.add(AppEntityConverter.convertDBEntityToViewModel(tMan));			
			}
		}
		if(manList3!=null && manList3.size()>0){
			for(Manufacturer tMan : manList3){
				manVMList.add(AppEntityConverter.convertDBEntityToViewModel(tMan));			
			}
		}
		
		return manVMList;
	}

	@Override
	public synchronized ManufacturerViewModel put(ManufacturerViewModel viewModel) {
		Manufacturer manufacturer = new Manufacturer();
		if(viewModel.getGaeManufacturerKey()==null){
			Key key = Datastore.allocateId(Manufacturer.class);
			viewModel.setGaeManufacturerKey(key);
			viewModel
			.setManufacturerId(generateUniqueId(viewModel));
		}
		manufacturer.setManufacturerKey(viewModel.getGaeManufacturerKey());
		manufacturer.setManufacturerId(viewModel.getManufacturerId());

		manufacturer.setManufacturerName(viewModel
				.getManufacturerName());
		manufacturer.setStatus(viewModel.getStatus());
		manufacturer.setPrimaryAddressCountryCode(viewModel.getPrimaryAddressCountryCode());
		manufacturer.setPrimaryAddressCountry(viewModel.getPrimaryAddressCountry());
		manufacturer.setPrimaryAddressCountyCode(viewModel.getPrimaryAddressCountyCode());
		manufacturer.setPrimaryAddressCounty(viewModel.getPrimaryAddressCounty());
		
		for(AddressViewModel addrVM : viewModel.getPostalAddresses()){
			addrVM.setAddressownerKey(manufacturer.getManufacturerKey());
		}		
		List<AddressViewModel> addrVMList = BusinessServiceImpl.getInstance().getAddressDBServiceInstance().put(viewModel.getPostalAddresses());
		List<Address> addrDBList = new ArrayList<Address>();
		for(WebViewModel webVM : addrVMList){
			AddressViewModel addrVM = (AddressViewModel) webVM;
			addrDBList.add(AppEntityConverter.convertViewModelToDBEntity(addrVM));
		}
		manufacturer.setPostalAddresses(addrDBList);
		manufacturer.setManufacturerRegistrationExpiryDate(CApplicationConstants.getAApplicationEntityDefaultExpirationDate());
		
		// Store the Manufacturer in database.
		Datastore.put(manufacturer);

		return AppEntityConverter.convertDBEntityToViewModel(manufacturer);
	}

	@Override
	public List<ManufacturerViewModel> getAll() {
		ManufacturerMeta manMeta = ManufacturerMeta.get();
		List<Manufacturer> manufactuers = Datastore.query(manMeta).asList();
		List<ManufacturerViewModel> manufacturerViewModels = new ArrayList<ManufacturerViewModel>();
		for (Manufacturer manufacturer : manufactuers) {
			manufacturerViewModels.add(AppEntityConverter.convertDBEntityToViewModel(manufacturer));
		}

		return manufacturerViewModels;
	}

	@Override
	public List<ManufacturerViewModel> getById(String id) {
		ManufacturerMeta manMeta = ManufacturerMeta.get();
		List<Manufacturer> manufactuers = Datastore.query(manMeta)
				.filter(manMeta.manufacturerId.startsWith(id))
				.asList();
		List<ManufacturerViewModel> manufacturerViewModels = new ArrayList<ManufacturerViewModel>();
		for (Manufacturer manufacturer : manufactuers) {
			manufacturerViewModels.add(AppEntityConverter.convertDBEntityToViewModel(manufacturer));
		}

		return manufacturerViewModels;
	}

	@Override
	public ManufacturerViewModel getByGaeKey(Key gaeKey) {
		Manufacturer manufacturer = Datastore.get(Manufacturer.class,
				gaeKey);
		return AppEntityConverter.convertDBEntityToViewModel(manufacturer);
	}

	@Override
	public synchronized String generateUniqueId(ManufacturerViewModel viewModel) {
		if(viewModel==null){
			return null;
		}
		
		String manufacturerId = new String("");
		ManufacturerUniqueIdRegistry manufacturerUniqueIdRegistry = Datastore
				.query(ManufacturerUniqueIdRegistry.class).asSingle();
		if(manufacturerUniqueIdRegistry == null) {
			manufacturerUniqueIdRegistry = new ManufacturerUniqueIdRegistry();
			manufacturerUniqueIdRegistry.setTotalManufacturerRegistered(0);
			manufacturerUniqueIdRegistry.setManufacturerIdSequence(0);
			manufacturerUniqueIdRegistry.setManufacturerIdPrefix("M");
			manufacturerUniqueIdRegistry.setManufacturerUniqueIdKey(Datastore
					.allocateId(ManufacturerUniqueIdRegistry.class));
			Datastore.put(manufacturerUniqueIdRegistry);
		}
		manufacturerUniqueIdRegistry
				.setTotalManufacturerRegistered(manufacturerUniqueIdRegistry
						.getTotalManufacturerRegistered() + 1);
		manufacturerUniqueIdRegistry
				.setManufacturerIdSequence(manufacturerUniqueIdRegistry
						.getManufacturerIdSequence() + 1);
		manufacturerId = manufacturerUniqueIdRegistry.getManufacturerIdPrefix()
				+ viewModel.getPrimaryAddressCountryCode()
				+ viewModel.getPrimaryAddressCountyCode()
				+ AppOpertionalUtility
						.formatIdSequenceNumber(manufacturerUniqueIdRegistry
								.getManufacturerIdSequence());
		Datastore.put(manufacturerUniqueIdRegistry);
		return manufacturerId;
	}

}
