package biz.nirvani.storebiz.app.page.error;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.AbstractBehavior;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.form.FormComponent;

public class ErrorClassAppender extends AbstractBehavior {

	@Override
	public void onComponentTag(Component component,ComponentTag componentTag){
		if(!((FormComponent<?>)component).isValid()){
			String c1 = componentTag.getAttribute("class");
			if(c1==null){
				componentTag.put("class", "error");
			}else{
				componentTag.put("class", "error "+c1);
			}
		}
	}
}
