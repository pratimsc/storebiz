package biz.storebiz.app.page;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

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
	}
	
	public abstract void renderPageBodyContent(PageParameters parameters);
}
