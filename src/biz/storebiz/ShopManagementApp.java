package biz.storebiz;

import org.apache.wicket.Page;
import org.apache.wicket.Request;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.HttpSessionStore;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.session.ISessionStore;
import org.apache.wicket.util.lang.PackageName;

import biz.storebiz.app.entity.StorebizSession;
import biz.storebiz.app.page.ShopManagementHomePage;
import biz.storebiz.app.page.session.LoginPage;

public class ShopManagementApp extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return LoginPage.class;
	}
	
	@Override
	protected ISessionStore newSessionStore(){
		return new HttpSessionStore(this);
	}
	
	@Override
	public void init(){
		getResourceSettings().setResourcePollFrequency(null);
		mount("storebiz",PackageName.forClass(ShopManagementApp.class));
	}

	@Override
	public Session newSession(Request request, Response response) {
		// TODO Auto-generated method stub
		return new StorebizSession(request);
	}
	
	
}
