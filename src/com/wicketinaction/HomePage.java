package com.wicketinaction;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;

import com.wicketinaction.listeditor.ListEditor;
import com.wicketinaction.listeditor.ListItem;
import com.wicketinaction.listeditor.RemoveButton;

/**
 * Homepage
 */
public class HomePage extends WebPage
{

    private final Person person = new Person();
    private final ListEditor<Phone> editor;

    /**
     * Constructor that is invoked when page is invoked without a session.
     * 
     * @param parameters
     *            Page parameters
     */
    public HomePage(final PageParameters parameters)
    {
    	setVersioned(false);
    	
        add(new FeedbackPanel("feedback"));

        Form form = new Form("form")
        {
            @Override
            protected void onSubmit()
            {
                info(person.toString());
            }
        };
        add(form);
        form.add(new TextField("name", new PropertyModel(this, "person.name")));
        editor = new ListEditor<Phone>("phones", new PropertyModel(this, "person.phones"))
        {
            @Override
            protected void onPopulateItem(ListItem<Phone> item)
            {
                item.setModel(new CompoundPropertyModel(item.getModel()));
                item.add(new TextField("areacode"));
                item.add(new TextField("phone"));
                item.add(new TextField("ext"));

                item.add(new RemoveButton("remove"));
            }
        };

        form.add(new Button("add")
        {
            @Override
            public void onSubmit()
            {
                editor.addItem(new Phone());
            }
        }.setDefaultFormProcessing(false));
        form.add(editor);
    }
}
