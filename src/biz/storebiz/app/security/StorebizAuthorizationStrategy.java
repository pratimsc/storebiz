package biz.storebiz.app.security;

import org.apache.wicket.Component;
import org.apache.wicket.RestartResponseAtInterceptPageException;
import org.apache.wicket.authorization.Action;
import org.apache.wicket.authorization.IAuthorizationStrategy;
import org.apache.wicket.authorization.IUnauthorizedComponentInstantiationListener;

import biz.nirvani.wicket.app.session.OpenIdSession;
import biz.nirvani.wicket.app.session.page.OpenIdLoginPage;
import biz.storebiz.app.page.SecurePage;

public class StorebizAuthorizationStrategy implements IAuthorizationStrategy,
		IUnauthorizedComponentInstantiationListener {

	@Override
	public boolean isActionAuthorized(Component component, Action action) {

		return true;
	}

	@Override
	public <T extends Component> boolean isInstantiationAuthorized(Class<T> clz) {
		if (SecurePage.class.isAssignableFrom(clz)) {
			return OpenIdSession.get().isAuthenticated();
		}
		return true;
	}

	@Override
	public void onUnauthorizedInstantiation(Component arg0) {
		/*
		 * The execution will reach here, whenever there is an attempt to access
		 * protected resources, without signing into the application.
		 * The user will be sent to Google servers for authentication.
		 */
		throw new RestartResponseAtInterceptPageException(OpenIdLoginPage.class);
	}

}
