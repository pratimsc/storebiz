package biz.storebiz.biz.service.db;

import java.util.List;

import biz.storebiz.app.view.entity.AddressViewModel;

import com.google.appengine.api.datastore.Key;

public interface IAddressDBService extends IApplicationDBService {
	public  AddressViewModel put(AddressViewModel viewModels);

	public List<AddressViewModel> getAll();

	public List<AddressViewModel> getById(String id);
	
	public AddressViewModel getByGaeKey(Key gaeKey);

	public String generateUniqueId(
			AddressViewModel viewModel);
	
	public List<AddressViewModel> findByText(String findText);
	
	
	
	public List<AddressViewModel> getAllAddresses(Key gaeOwnerKey);
	
	public List<AddressViewModel> put(List<AddressViewModel> addresses);	
}
