package biz.nirvani.storebiz.utils.views.listeditor;

import java.util.List;

import org.apache.wicket.markup.html.form.Button;

public abstract class ListEditorButton extends Button {
	private transient ListItem<?> parent;
	
	public ListEditorButton(String id){
		super(id);
	}
	
	protected final ListItem<?>getItem(){
		if(parent==null){
			parent = findParent(ListItem.class);
		}
		return parent;
	}
	
	protected final List<?>getList(){
		return getEditor().items;
	}
	
	protected final ListEditor<?>getEditor(){
		return (ListEditor<?>)getItem().getParent();
	}
	
	protected void onDetatch(){
		parent=null;
		super.onDetach();
	}
	
}
