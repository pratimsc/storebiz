package biz.storebiz.biz.service.db;

import java.util.List;

import biz.storebiz.app.view.entity.ManufacturerViewModel;

import com.google.appengine.api.datastore.Key;


public interface IManufacturerDBService extends IApplicationDBService{
	public  ManufacturerViewModel put(ManufacturerViewModel viewModels);

	public List<ManufacturerViewModel> getAll();

	public List<ManufacturerViewModel> getById(String id);
	
	public ManufacturerViewModel getByGaeKey(Key gaeKey);

	public String generateUniqueId(
			ManufacturerViewModel viewModel);
	
	public List<ManufacturerViewModel> findByText(String findText);
	
}
