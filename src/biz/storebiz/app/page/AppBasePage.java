package biz.storebiz.app.page;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

import biz.nirvani.wicket.app.session.OpenIdSession;
import biz.nirvani.wicket.app.session.page.OpenIdLoginPage;
import biz.nirvani.wicket.app.session.page.OpenIdLogoutPage;

public abstract class AppBasePage extends WebPage{
	public AppBasePage(PageParameters parameters){
		//GAE specific tweaks
		setVersioned(false);
		
		renderPageBodyHeader(parameters);
		renderPageBodyContent(parameters);
	}
	
	private void renderPageBodyHeader(PageParameters parameters){
		add(new FeedbackPanel("appFeedback"));
		add(new Label("organizationName","Blue Monkey"));		
		
		if(OpenIdSession.get().getUser()==null){
			Link<String> accessLink=new Link<String>("accessLink") {

				@Override
				public void onClick() {
					setResponsePage(OpenIdLoginPage.class, null);					
				}
				
			};
			add(accessLink);
			accessLink.add(new Label("accessLinkLabel","Sign In"));
		}else{
			Link<String> accessLink= new Link<String>("accessLink") {

				@Override
				public void onClick() {
					setResponsePage(OpenIdLogoutPage.class, null);					
				}
				
			};
			add(accessLink);
			accessLink.add(new Label("accessLinkLabel","Sign Out"));
		}
		
	}
	
	public abstract void renderPageBodyContent(PageParameters parameters);
}
