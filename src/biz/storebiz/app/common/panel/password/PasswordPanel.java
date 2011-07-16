package biz.storebiz.app.common.panel.password;

import java.util.regex.Pattern;

import org.apache.wicket.feedback.ComponentFeedbackMessageFilter;
import org.apache.wicket.markup.html.form.FormComponentPanel;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.ValidationErrorFeedback;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.string.Strings;
import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.IValidator;
import org.apache.wicket.validation.ValidationError;
import org.apache.wicket.validation.validator.StringValidator;

import biz.storebiz.app.page.error.ErrorClassAppender;

public class PasswordPanel extends FormComponentPanel<String> {
	private PasswordTextField password;
	private PasswordTextField passwordRetype;
	
	/**
	 * Declaring error message ids 
	 */
	private static final String PASSWORD_INPUT_RETYPE_MISMATCH="PASSWORD_INPUT_RETYPE_MISMATCH";

	public PasswordPanel(String id, IModel<String> model) {
		super(id, model);
		
		password = new PasswordTextField("password", new Model<String>());
		password.add(StringValidator.lengthBetween(5, 20));
		password.add(new PasswordPolicyValidator());
		//password.add(new ErrorClassAppender());
		password.setLabel(Model.of("Password"));
		add(password);
		add(new FeedbackPanel("passwordFeedbackPanel",new ComponentFeedbackMessageFilter(password)));
		
		passwordRetype = new PasswordTextField("passwordRetype", new Model<String>());
		add(passwordRetype);		
	}
	
	@Override
	protected void onModelChanged(){
		if(this.password!= null && this.passwordRetype!= null){
			if(!this.password.equals(this.passwordRetype)){
				ValidationError valErr = new ValidationError();
				valErr.addMessageKey(getClass().getSimpleName()+"."+PASSWORD_INPUT_RETYPE_MISMATCH);
				error(new ValidationErrorFeedback(valErr, PASSWORD_INPUT_RETYPE_MISMATCH));
			}
		}
	}
	
	@Override
	protected void convertInput(){
		String strPassword = password.getConvertedInput();
		setConvertedInput(strPassword);
	}
	
	
	private static class PasswordPolicyValidator implements IValidator<String>{
		private static final Pattern UPPER = Pattern.compile("[A-Z]");
		private static final Pattern LOWER = Pattern.compile("[a-z]");
		private static final Pattern NUMBER = Pattern.compile("[0-9]");
		
		/**
		 * Declaring error message ids 
		 */
		private static final String PASSWORD_IS_EMPTY="PASSWORD_IS_EMPTY";
		private static final String PASSWORD_HAS_NO_UPPERCASE="PASSWORD_HAS_NO_UPPERCASE";
		private static final String PASSWORD_HAS_NO_LOWERCASE="PASSWORD_HAS_NO_LOWERCASE";
		private static final String PASSWORD_HAS_NO_NUMBER="PASSWORD_HAS_NO_NUMBER";
		
		@Override
		public void validate(IValidatable<String> validatable) {
			final String password = validatable.getValue();
			if(Strings.isEmpty(password)){
				error(validatable,PASSWORD_IS_EMPTY);
			}
			
			if(!UPPER.matcher(password).find()){
				error(validatable,PASSWORD_HAS_NO_UPPERCASE);
			}
			
			if(!LOWER.matcher(password).find()){
				error(validatable,PASSWORD_HAS_NO_LOWERCASE);
			}
			
			if(!NUMBER.matcher(password).find()){
				error(validatable,PASSWORD_HAS_NO_NUMBER);
			}
			
		}
		
		private void error(IValidatable<String> validatable, final String errorKey){
			ValidationError valMsg = new ValidationError();
			valMsg.addMessageKey(getClass().getSimpleName()+"."+errorKey);
			validatable.error(valMsg);
		}
		
	}

}
