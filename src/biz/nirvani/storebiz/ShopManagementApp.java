package biz.nirvani.storebiz;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.HttpSessionStore;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.session.ISessionStore;

import biz.nirvani.storebiz.app.page.ShopManagementHomePage;

public class ShopManagementApp extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return ShopManagementHomePage.class;
	}
	
	@Override
	protected ISessionStore newSessionStore(){
		return new HttpSessionStore(this);
	}
	
	@Override
	public void init(){
		getResourceSettings().setResourcePollFrequency(null);
	}
}
