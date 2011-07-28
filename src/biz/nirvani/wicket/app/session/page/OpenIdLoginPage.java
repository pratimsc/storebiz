package biz.nirvani.wicket.app.session.page;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.Model;
import org.apache.wicket.protocol.http.RequestUtils;
import org.apache.wicket.request.target.basic.RedirectRequestTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import biz.nirvani.wicket.app.session.OpenIdSession;
import biz.storebiz.db.entity.user.AppUser;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class OpenIdLoginPage extends WebPage {
	private static UserService _userService;
	private static Logger _LOGGER = LoggerFactory.getLogger(OpenIdLoginPage.class);
	private static List<OpenIdInformation> _openIdProviderList;
	static {
		_openIdProviderList = new ArrayList<OpenIdInformation>();
		_openIdProviderList.add(new OpenIdInformation("Google", "google.com/accounts/o8/id"));
		_openIdProviderList.add(new OpenIdInformation("Yahoo","yahoo.com"));
		_openIdProviderList.add(new OpenIdInformation("MySpace", "myspace.com"));
		_openIdProviderList.add(new OpenIdInformation("AOL","aol.com"));
		_openIdProviderList.add(new OpenIdInformation("MyOpenId.com", "myopenid.com"));
	}
	
	private static class OpenIdInformation{
		private String openIdProviderName;
		private String openIdProviderUrl;
		public OpenIdInformation(String openIdProviderName,
				String openIdProviderUrl) {
			super();
			this.openIdProviderName = openIdProviderName;
			this.openIdProviderUrl = openIdProviderUrl;
		}
		public String getOpenIdProviderName() {
			return openIdProviderName;
		}
		public void setOpenIdProviderName(String openIdProviderName) {
			this.openIdProviderName = openIdProviderName;
		}
		public String getOpenIdProviderUrl() {
			return openIdProviderUrl;
		}
		public void setOpenIdProviderUrl(String openIdProviderUrl) {
			this.openIdProviderUrl = openIdProviderUrl;
		}
		
		
	}
	
	public static UserService getUserService() {
		if (_userService == null) {
			_userService = UserServiceFactory.getUserService();
			_LOGGER.debug("Creating Google user service.");
		}
		return _userService;
	}

	public OpenIdLoginPage() {
		this(null);
	}

	@SuppressWarnings({ "unchecked", "unchecked", "unchecked" })
	public OpenIdLoginPage(final PageParameters parameters) {
		super(parameters);
		AppUser appUser = null;
		UserService userService = OpenIdLoginPage.getUserService();
		User currentUser = userService.getCurrentUser();
		final Set<String> attributes = new HashSet<String>();
		if(currentUser == null || !userService.isUserLoggedIn()){
			_LOGGER.info("Present user links for logging in using OpenId service providers.");
			
			@SuppressWarnings({ "rawtypes", "unchecked" })
			ListView openIdProviders = new ListView("openIdProviders",_openIdProviderList) {
				
				@Override
				protected void populateItem(ListItem item) {
					final OpenIdInformation openIdInf = (OpenIdInformation) item.getModelObject();
					
					Link<String> openIdUrl = new Link<String>("openIdUrl") {
						@Override
						public void onClick() {
							String reqUri = RequestUtils.toAbsolutePath((String) urlFor(OpenIdLoginPage.class, parameters));
							
							String loginUrl = getUserService().createLoginURL(reqUri, null, openIdInf.getOpenIdProviderUrl(), attributes);
							_LOGGER.info("Login Url :"+loginUrl);
							getRequestCycle().setRequestTarget(new RedirectRequestTarget(loginUrl));							
						}						
					};
					item.add(openIdUrl);
					openIdUrl.add(new Label("openIdUrlLabel", new Model(openIdInf.getOpenIdProviderName())));
				}				
			};
			
			add(openIdProviders);			
			
		}else{
			appUser = new AppUser();
			appUser.setGoogleUser(currentUser);
			_LOGGER.info("The user was successfully authenticated by Google.");
			_LOGGER.info("The user details as stored in session are :"+appUser.toString());
			OpenIdSession.get().setUser(appUser);
			setResponsePage(getApplication().getHomePage());
		}			
	}

}
