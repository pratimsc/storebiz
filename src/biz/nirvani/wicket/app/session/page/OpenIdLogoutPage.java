package biz.nirvani.wicket.app.session.page;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.target.basic.RedirectRequestTarget;

import biz.nirvani.wicket.app.session.OpenIdSession;

public class OpenIdLogoutPage extends WebPage {

	public OpenIdLogoutPage(PageParameters parameters) {
		super(parameters);
		OpenIdSession.get().setUser(null);
		String logoutUrl = OpenIdLoginPage.getUserService().createLogoutURL((String)urlFor(getApplication().getHomePage(),parameters));
		getRequestCycle().setRequestTarget(new RedirectRequestTarget(logoutUrl));
	}
	
}
