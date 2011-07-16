package biz.storebiz.biz.service.db;

import java.util.List;

import biz.storebiz.app.view.entity.CountryViewModel;

import com.google.appengine.api.datastore.Key;

public interface ICountryDBService extends IApplicationDBService {
	public  CountryViewModel put(CountryViewModel viewModels);

	public List<CountryViewModel> getAll();

	public List<CountryViewModel> getById(String id);
	
	public CountryViewModel getByGaeKey(Key gaeKey);

	public String generateUniqueId(
			CountryViewModel viewModel);
	
	public List<CountryViewModel> findByText(String findText);
	
	public List<CountryViewModel> getCountryByCode(
			String countryCode, String codeType);
}
