package biz.nirvani.storebiz.biz.service.db.implementation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.slim3.datastore.Datastore;

import biz.nirvani.storebiz.app.view.entity.CountyViewModel;
import biz.nirvani.storebiz.biz.service.db.ICountyDBService;
import biz.nirvani.storebiz.db.entity.common.County;
import biz.nirvani.storebiz.db.entity.common.CountyMeta;

import com.google.appengine.api.datastore.Key;

public class CountyDBServiceImpl implements ICountyDBService, Serializable{
	private static HashMap<String, List<CountyViewModel>> countyListAll = new HashMap<String, List<CountyViewModel>>();

	
	@Override
	public List<CountyViewModel> getCountyByCode(String countyCode,
			String countryCode, String codeType) {
		System.err
				.println("Method [getCountyByCode(String countyCode,String countryCode, String codeType)] has not been implemented");
		return null;
	}

	@Override
	public List<CountyViewModel> getCountyByCountryCode(String countryCode,
			String codeType) {
		if (countyListAll != null) {
			List<CountyViewModel> counties = countyListAll.get(codeType
					+ countryCode);
			if (counties == null || counties.size() == 0) {
				counties = new ArrayList<CountyViewModel>();
				CountyMeta cm = CountyMeta.get();
				Iterator<County> ctdb = Datastore
						.query(cm)
						.filter(cm.countyCodeType.equal(codeType),
								cm.countryCode.equal(countryCode)).asIterator();
				if (ctdb != null) {
					while (ctdb.hasNext()) {
						County ct = ctdb.next();
						counties.add(convertEntityFromDbToView(ct));
					}
					countyListAll.put(codeType + countryCode, counties);
					return counties;
				} else {
					return null;
				}

			}
			return counties;
		}
		return null;
	}

	/*
	 * Convert DB object to a view layer object
	 */

	private CountyViewModel convertEntityFromDbToView(County county) {
		if (county == null) {
			return null;
		}

		CountyViewModel cvm = new CountyViewModel();
		cvm.setGaeCountyKey(county.getCountyKey());
		cvm.setCountyCode(county.getCountyCode());
		cvm.setCountyCodeType(county.getCountyCodeType());
		cvm.setCountyName(county.getCountyName());
		cvm.setCountryKey(county.getCountryKey());
		cvm.setCountryCode(county.getCountryCode());
		cvm.setLanguage(county.getLanguage());
		cvm.setCreationDate(county.getCreationDate());
		cvm.setLastModificationDate(county.getLastModificationDate());
		return cvm;
	}

	@Override
	public CountyViewModel put(CountyViewModel viewModel) {
		System.err
		.println("[Method [put(CountyViewModel countyViewModel)] has not been implemented.");
return null;
	}

	@Override
	public List<CountyViewModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CountyViewModel> getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CountyViewModel getByGaeKey(Key gaeKey) {
		System.err
		.println("Method [getCountyByGaeKey(Key gaeCountyKey)] has not been implemented");
return null;
	}

	@Override
	public String generateUniqueId(CountyViewModel viewModel) {
		if(viewModel==null){
			return null;
		}
		CountyViewModel ctVM = (CountyViewModel)viewModel;
		return ctVM.getCountryCode()+ctVM.getCountyCode()+ctVM.getCountyCodeType()+ctVM.getLanguage();
	}

	@Override
	public List<CountyViewModel> findByText(String findText) {
		// TODO Auto-generated method stub
		return null;
	}

}
