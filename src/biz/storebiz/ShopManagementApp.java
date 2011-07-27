package biz.storebiz;

import org.apache.wicket.Page;
import org.apache.wicket.Request;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.HttpSessionStore;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.session.ISessionStore;
import org.apache.wicket.util.lang.PackageName;

import biz.nirvani.wicket.app.session.OpenIdSession;
import biz.storebiz.app.page.ShopManagementHomePage;
import biz.storebiz.app.security.StorebizAuthorizationStrategy;

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
		mount("storebiz",PackageName.forClass(ShopManagementApp.class));
		StorebizAuthorizationStrategy securityStrategy = new StorebizAuthorizationStrategy();
		getSecuritySettings().setAuthorizationStrategy(securityStrategy);
		getSecuritySettings().setUnauthorizedComponentInstantiationListener(securityStrategy);
	}

	@Override
	public Session newSession(Request request, Response response) {
		// TODO Auto-generated method stub
		return new OpenIdSession(request);
	}
	
	
}
