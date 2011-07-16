package biz.storebiz.app.page;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

public class AppBasePage extends WebPage{
	public AppBasePage(PageParameters parameters){
		//GAE specific tweaks
		setVersioned(false);
		
		add(new FeedbackPanel("appFeedback"));
		add(new Label("organizationName","Blue Monkey"));
	}
}
