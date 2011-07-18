package biz.storebiz.app.entity;

import org.apache.wicket.Request;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import biz.storebiz.db.entity.user.AppUser;

public class StorebizSession extends WebSession {
	private AppUser user;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StorebizSession.class);
	
	public StorebizSession(Request request) {
		super(request);
		LOGGER.debug("New session created.");
	}
	
	public boolean isAuthenticated(){
		return (user!=null);
	}
	
	public static StorebizSession get(){
		return (StorebizSession)Session.get();
	}

	public AppUser getUser() {
		return user;
	}

	public void setUser(AppUser user) {
		this.user = user;
	}
	
}
