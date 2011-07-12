package biz.nirvani.storebiz.biz.service.db.implementation;

import java.util.ArrayList;
import java.util.List;

import org.slim3.datastore.Datastore;

import biz.nirvani.storebiz.app.view.entity.AddressViewModel;
import biz.nirvani.storebiz.app.view.entity.SupplierViewModel;
import biz.nirvani.storebiz.app.view.entity.WebViewModel;
import biz.nirvani.storebiz.biz.common.constants.CApplicationConstants;
import biz.nirvani.storebiz.biz.service.db.ISupplierDBService;
import biz.nirvani.storebiz.biz.service.implementation.BusinessServiceImpl;
import biz.nirvani.storebiz.db.IStorebizSerializableEntity;
import biz.nirvani.storebiz.db.entity.common.Address;
import biz.nirvani.storebiz.db.entity.supplier.Supplier;
import biz.nirvani.storebiz.db.entity.supplier.SupplierMeta;
import biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry;
import biz.nirvani.storebiz.utils.AppEntityConverter;
import biz.nirvani.storebiz.utils.AppOpertionalUtility;

import com.google.appengine.api.datastore.Key;

public class SupplierDBServiceImpl implements ISupplierDBService,
		IStorebizSerializableEntity {

	@Override
	public SupplierViewModel put(SupplierViewModel viewModel) {
		Supplier supplier = new Supplier();
		if(viewModel.getGaeSupplierKey() ==null){
			Key key = Datastore.allocateId(Supplier.class);
			viewModel.setGaeSupplierKey(key);
			viewModel
			.setSupplierId(generateUniqueId(viewModel));
		}
		supplier.setSupplierKey(viewModel.getGaeSupplierKey());
		supplier.setSupplierId(viewModel.getSupplierId());

		supplier.setSupplierName(viewModel
				.getSupplierName());
		supplier.setStatus(viewModel.getStatus());
		supplier.setPrimaryAddressCountryCode(viewModel.getPrimaryAddressCountryCode());
		supplier.setPrimaryAddressCountry(viewModel.getPrimaryAddressCountry());
		supplier.setPrimaryAddressCountyCode(viewModel.getPrimaryAddressCountyCode());
		supplier.setPrimaryAddressCounty(viewModel.getPrimaryAddressCounty());
		
		for(AddressViewModel addrVM : viewModel.getPostalAddresses()){
			addrVM.setAddressownerKey(supplier.getSupplierKey());
		}		
		List<AddressViewModel> addrVMList = BusinessServiceImpl.getInstance().getAddressDBServiceInstance().put(viewModel.getPostalAddresses());
		List<Address> addrDBList = new ArrayList<Address>();
		for(WebViewModel webVM : addrVMList){
			AddressViewModel addrVM = (AddressViewModel) webVM;
			addrDBList.add(AppEntityConverter.convertViewModelToDBEntity(addrVM));
		}
		supplier.setPostalAddresses(addrDBList);
		supplier.setRegistrationExpiryDate(CApplicationConstants.getAApplicationEntityDefaultExpirationDate());
		
		// Store the Manufacturer in database.
		Datastore.put(supplier);

		return AppEntityConverter.convertDBEntityToViewModel(supplier);
	}

	@Override
	public List<SupplierViewModel> getAll() {
		SupplierMeta suppMeta = SupplierMeta.get();
		List<Supplier> suppliers = Datastore.query(suppMeta).asList();
		List<SupplierViewModel> supplierVMs= new ArrayList<SupplierViewModel>();
		for (Supplier supp: suppliers) {
			supplierVMs.add(AppEntityConverter.convertDBEntityToViewModel(supp));
		}

		return supplierVMs;
	}

	@Override
	public List<SupplierViewModel> getById(String id) {
		SupplierMeta suppMeta = SupplierMeta.get();
		List<Supplier> suppliers = Datastore.query(suppMeta)
				.filter(suppMeta.supplierId.startsWith(id))
				.asList();
		List<SupplierViewModel> supplierVMs = new ArrayList<SupplierViewModel>();
		for (Supplier supp: suppliers) {
			supplierVMs.add(AppEntityConverter.convertDBEntityToViewModel(supp));
		}
		return supplierVMs;
	}

	@Override
	public SupplierViewModel getByGaeKey(Key gaeKey) {
		Supplier supp = Datastore.get(Supplier.class,
				gaeKey);
		return AppEntityConverter.convertDBEntityToViewModel(supp);
	}

	@Override
	public String generateUniqueId(SupplierViewModel viewModel) {
		if(viewModel==null){
			return null;
		}
		
		String supplierId = new String("");
		SupplierUniqueIdRegistry uniqueIdRegistry = Datastore
				.query(SupplierUniqueIdRegistry.class).asSingle();
		if(uniqueIdRegistry == null) {
			uniqueIdRegistry = new SupplierUniqueIdRegistry();
			uniqueIdRegistry.setTotalRegistered(0);
			uniqueIdRegistry.setIdSequence(0);
			uniqueIdRegistry.setIdPrefix("S");
			uniqueIdRegistry.setKey(Datastore
					.allocateId(SupplierUniqueIdRegistry.class));
			Datastore.put(uniqueIdRegistry);
		}
		uniqueIdRegistry
				.setTotalRegistered(uniqueIdRegistry
						.getTotalRegistered() + 1);
		uniqueIdRegistry
				.setIdSequence(uniqueIdRegistry
						.getIdSequence() + 1);
		supplierId = uniqueIdRegistry.getIdPrefix()
				+ viewModel.getPrimaryAddressCountryCode()
				+ viewModel.getPrimaryAddressCountyCode()
				+ AppOpertionalUtility
						.formatIdSequenceNumber(uniqueIdRegistry
								.getIdSequence());
		Datastore.put(uniqueIdRegistry);
		return supplierId;
	}

	@Override
	public List<SupplierViewModel> findByText(String findText) {
		findText = findText.toUpperCase();
		List<SupplierViewModel> suppVMList = new ArrayList<SupplierViewModel>();
		SupplierMeta suppMeta = SupplierMeta.get();
		
		List<Supplier> suppList1 = Datastore.query(suppMeta).filter(suppMeta.supplierName.startsWith(findText)).asList();
		List<Supplier> suppList2 = Datastore.query(suppMeta).filter(suppMeta.supplierId.startsWith(findText)).asList();
		List<Supplier> suppList3 = Datastore.query(suppMeta).filter(suppMeta.primaryAddressCountry.startsWith(findText)).asList();
		
		if(suppList1!=null && suppList1.size()>0){
			for(Supplier supp : suppList1){
				suppVMList.add(AppEntityConverter.convertDBEntityToViewModel(supp));			
			}
		}
		if(suppList2!=null && suppList2.size()>0){
			for(Supplier supp : suppList2){
				suppVMList.add(AppEntityConverter.convertDBEntityToViewModel(supp));			
			}
		}
		if(suppList3!=null && suppList3.size()>0){
			for(Supplier supp : suppList3){
				suppVMList.add(AppEntityConverter.convertDBEntityToViewModel(supp));			
			}
		}
		
		return suppVMList;
	}
}
