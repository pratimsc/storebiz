package biz.nirvani.storebiz.utils;

import java.io.StringWriter;
import java.util.Date;

import org.apache.wicket.feedback.ComponentFeedbackMessageFilter;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.string.Strings;
import org.apache.wicket.validation.validator.StringValidator;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import biz.nirvani.storebiz.app.common.behaviour.ToUpperCaseBehaviour;

import com.thoughtworks.xstream.XStream;

public final class AppOpertionalUtility {
	private static XStream xstream; 
	public static void prepareFormComponents(FormComponent formComponent,
			boolean isRequired, String label, int minimumLenght,
			int maximumLenght, boolean hasFeedBackPanel) {
		if (isRequired) {
			formComponent.setRequired(true);
		}
		if (!Strings.isEmpty(label)) {
			formComponent.setLabel(new Model<String>(label));
		}
		if (!(minimumLenght < 0)) {
			formComponent.add(StringValidator.minimumLength(minimumLenght));
		}
		if (!(maximumLenght < 0)) {
			formComponent.add(StringValidator.maximumLength(maximumLenght));
		}
		if (hasFeedBackPanel) {
			formComponent.getParent().add(new FeedbackPanel(formComponent.getId()
					+ "FeedbackPanel", new ComponentFeedbackMessageFilter(
					formComponent)));
		}
		
		//Add input behaviour
		formComponent.add(new ToUpperCaseBehaviour());
	}
	
	public static String convertObjectToXML(Object object){
			if(object==null){
				return null;
			}
			StringWriter writer = new StringWriter();
			Serializer serializer = new Persister();
			try {
				serializer.write(object, writer);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return writer.getBuffer().toString();
		
	}
	
	public static String formatIdSequenceNumber(long sequenceId){
		return String.format("%1$09d",sequenceId);
	}
	
	public static String formatDateForDisplay(Date date){
		return String.format("%1$td-%1$tb-%1$tY %1$TR", date);
	}
}
