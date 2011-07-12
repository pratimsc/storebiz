package biz.nirvani.storebiz.biz.service.db.implementation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slim3.datastore.Datastore;

import biz.nirvani.storebiz.app.view.entity.CountryViewModel;
import biz.nirvani.storebiz.app.view.entity.WebViewModel;
import biz.nirvani.storebiz.biz.service.db.ICountryDBService;
import biz.nirvani.storebiz.db.entity.common.Country;
import biz.nirvani.storebiz.db.entity.common.CountryMeta;

import com.google.appengine.api.datastore.Key;

public class CountryDBServiceImpl implements ICountryDBService, Serializable {
	private static List<CountryViewModel> countryListAll;

	@Override
	public List<CountryViewModel> getCountryByCode(String countryCode,
			String codeType) {
		CountryMeta cm = CountryMeta.get();
		Iterator<Country> it = Datastore
				.query(cm)
				.filter(cm.countryCodeType.equal(codeType),
						cm.countryCode.startsWith(countryCode)).asIterator();
		List<CountryViewModel> countryList = new ArrayList<CountryViewModel>();
		while (it.hasNext()) {
			countryList.add(convertEntityFromDbToView(it.next()));
		}
		return countryList;
	}

	@Override
	public CountryViewModel put(CountryViewModel viewModel) {
		System.err
				.println("Method [[put(CountryViewModel countryViewModel)] has not been implemented.");
		return null;
	}

	@Override
	public List<CountryViewModel> getAll() {
		if (countryListAll == null || countryListAll.size() == 0) {
			CountryMeta cm = CountryMeta.get();
			Iterator<Country> it = Datastore.query(cm).asIterator();
			countryListAll = new ArrayList<CountryViewModel>();
			while (it.hasNext()) {
				countryListAll.add(convertEntityFromDbToView(it.next()));
			}
		}
		return countryListAll;
	}

	@Override
	public List<CountryViewModel> getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CountryViewModel getByGaeKey(Key gaeKey) {
		Country country = Datastore.get(Country.class, gaeKey);
		return convertEntityFromDbToView(country);
	}

	@Override
	public String generateUniqueId(CountryViewModel viewModel) {
		return ((CountryViewModel) viewModel).getCountryCode()
				+ ((CountryViewModel) viewModel).getCountryCodeType()
				+ ((CountryViewModel) viewModel).getLanguage();
	}

	@Override
	public List<CountryViewModel> findByText(String findText) {
		System.err.print("findByText(String findText) from CountryDBService is not implemented. ");
		return countryListAll;
	}

	/*
	 * Convert DB object to a view layer object
	 */

	private CountryViewModel convertEntityFromDbToView(Country country) {
		if (country == null) {
			return null;
		}

		CountryViewModel cvm = new CountryViewModel();
		cvm.setGaeCountryKey(country.getCountryKey());
		cvm.setCountryCode(country.getCountryCode());
		cvm.setCountryCodeType(country.getCountryCodeType());
		cvm.setCountryName(country.getCountryName());
		cvm.setCreationDate(country.getCreationDate());
		cvm.setLanguage(country.getLanguage());
		cvm.setLastModificationDate(country.getLastModificationDate());

		return cvm;
	}
}
