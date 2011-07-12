package biz.nirvani.storebiz.app.common.behaviour;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.AbstractBehavior;
import org.apache.wicket.markup.ComponentTag;

public class ToUpperCaseBehaviour extends AbstractBehavior {

	@Override
	public void onComponentTag(Component component, ComponentTag tag) {
		tag.put(getJsEvent(), "this.value=this.value.toUpperCase();");
	}

	protected String getJsEvent() {
		return "onblur";
	}
	
}
