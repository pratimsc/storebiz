package biz.nirvani.storebiz.app.page.customer.registration;

import org.apache.wicket.PageParameters;
import org.apache.wicket.feedback.ComponentFeedbackMessageFilter;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.validation.EqualInputValidator;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.validation.validator.EmailAddressValidator;
import org.apache.wicket.validation.validator.StringValidator;
import org.slim3.datastore.Datastore;

import biz.nirvani.storebiz.app.common.panel.password.PasswordPanel;
import biz.nirvani.storebiz.app.page.error.ErrorClassAppender;
import biz.nirvani.storebiz.db.entity.customer.Customer;

import com.google.appengine.api.datastore.Key;

public class CustomerRegistrationPage extends WebPage {
	private Customer customer;
	private String customerName;
	private String customerEmail;
	private String customerPassword;
	
	public CustomerRegistrationPage(final PageParameters parameters){
		super(parameters);
		
		
		
		Form<?> customerRegistrationForm01 = new Form<Void>("customerRegistrationForm01"){
			@Override
			protected void onSubmit(){
				info("Form successfully submitted.");
				info("Registering - "+customerName+" "+customerEmail+ " "+ customerPassword);
				storeCustomerInDatabase(customerName,customerEmail,customerPassword);
			}
			
			private void storeCustomerInDatabase(String customerName,
					String customerEmail, String customerPassword) {
				Key customerKey = Datastore.createKey(Customer.class, customerEmail);
				Customer customer = new Customer();
				customer.setCustomerKey(customerKey);
				Datastore.put(customer);
				
			}

			@Override
			protected void onValidate(){
				super.onValidate();
				if(hasError())return;
			}
		};
		add(new FeedbackPanel("customerRegistrationForm01FeedBackPanel",new ComponentFeedbackMessageFilter(customerRegistrationForm01)));
		
		add(customerRegistrationForm01);
		
		FormComponent<String> customerNameComp = new TextField<String>("customerName",new PropertyModel<String>(this,"customerName"));
		customerNameComp.setRequired(true);
		customerNameComp.add(StringValidator.maximumLength(150));
		customerNameComp.setLabel(Model.of("Customer Name"));		
		customerRegistrationForm01.add(customerNameComp);
		customerRegistrationForm01.add(new FeedbackPanel("customerNameFeedBackPanel", new ComponentFeedbackMessageFilter(customerNameComp)));
		
		
		
		
		FormComponent<String> customerEmailComp = new TextField<String>("customerEmail", new PropertyModel<String>(this, "customerEmail"));
		customerEmailComp.setRequired(true);
		customerEmailComp.add(EmailAddressValidator.maximumLength(150));
		customerEmailComp.add(EmailAddressValidator.getInstance());
		customerEmailComp.setLabel(Model.of("Customer Email"));
		customerRegistrationForm01.add(customerEmailComp);
		customerRegistrationForm01.add(new FeedbackPanel("customerEmailFeedBackPanel",new ComponentFeedbackMessageFilter(customerEmailComp)));
		
		FormComponent<String> customerEmailRetypeComp	= new TextField<String>("customerEmailRetype", new Model<String>());
		customerRegistrationForm01.add(new EqualInputValidator(customerEmailComp,customerEmailRetypeComp));
		customerRegistrationForm01.add(customerEmailRetypeComp);
		
		FormComponent<String> passwordComp = new PasswordPanel("customerPasswordPanel", new PropertyModel<String>(this, "customerPassword"));
		customerRegistrationForm01.add(passwordComp);
		
		customerRegistrationForm01.visitChildren(FormComponent.class, new IVisitor<FormComponent<?>>(){

			@Override
			public Object component(FormComponent<?> component) {
				component.add(new ErrorClassAppender());
				return CONTINUE_TRAVERSAL;
			}
			
		});
		
	}
	
}
