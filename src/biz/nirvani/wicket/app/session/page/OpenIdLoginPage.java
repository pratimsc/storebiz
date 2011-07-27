package biz.nirvani.wicket.app.session.page;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
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

	public OpenIdLoginPage(PageParameters parameters) {
		super(parameters);
		AppUser appUser = null;
		UserService userService = OpenIdLoginPage.getUserService();
		User currentUser = userService.getCurrentUser();
		if(currentUser == null){
			_LOGGER.info("Direct user to Google for authentication.");
			String loginUrl = getUserService().createLoginURL(
					(String) urlFor(this.getClass(),parameters));
			_LOGGER.info("Login Url :"+loginUrl);
			getRequestCycle().setRequestTarget(
					new RedirectRequestTarget(loginUrl));
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
