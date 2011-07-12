package biz.nirvani.storebiz.biz.service.db;

import java.util.List;

import biz.nirvani.storebiz.app.view.entity.CountyViewModel;

import com.google.appengine.api.datastore.Key;

public interface ICountyDBService extends IApplicationDBService {
	public  CountyViewModel put(CountyViewModel viewModels);

	public List<CountyViewModel> getAll();

	public List<CountyViewModel> getById(String id);
	
	public CountyViewModel getByGaeKey(Key gaeKey);

	public String generateUniqueId(
			CountyViewModel viewModel);
	
	public List<CountyViewModel> findByText(String findText);
	
	
	
	
	public List<CountyViewModel> getCountyByCode(
			String countyCode, String countryCode, String codeType);
	
	public List<CountyViewModel> getCountyByCountryCode(
			String countryCode, String codeType);
}
