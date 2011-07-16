package biz.storebiz.biz.service.db;

import java.util.List;

import biz.storebiz.app.view.entity.SupplierViewModel;

import com.google.appengine.api.datastore.Key;

public interface ISupplierDBService extends IApplicationDBService{
	public  SupplierViewModel put(SupplierViewModel viewModels);

	public List<SupplierViewModel> getAll();

	public List<SupplierViewModel> getById(String id);
	
	public SupplierViewModel getByGaeKey(Key gaeKey);

	public String generateUniqueId(
			SupplierViewModel viewModel);
	
	public List<SupplierViewModel> findByText(String findText);
}
