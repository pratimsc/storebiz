package biz.nirvani.wicket.app.session;

import org.apache.wicket.Request;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import biz.storebiz.db.entity.user.AppUser;

public class OpenIdSession extends WebSession {
	private AppUser user;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OpenIdSession.class);
	
	public OpenIdSession(Request request) {
		super(request);
		LOGGER.debug("New session created.");
	}
	
	public boolean isAuthenticated(){
		return (user!=null);
	}
	
	public static OpenIdSession get(){
		return (OpenIdSession)Session.get();
	}

	public AppUser getUser() {
		return user;
	}

	public void setUser(AppUser user) {
		this.user = user;
	}
	
}
