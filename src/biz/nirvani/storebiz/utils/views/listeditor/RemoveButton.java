package biz.nirvani.storebiz.utils.views.listeditor;

public class RemoveButton extends ListEditorButton {

	public RemoveButton(String id) {
		super(id);
		setDefaultFormProcessing(false);
	}
	
	@Override
	public void onSubmit(){
		int itemIndex = getItem().getIndex();
		for(int i = itemIndex+1; i<getItem().getParent().size(); i++){
			ListItem<?> item = (ListItem<?>)getItem().getParent().get(i);
			item.setIndex(item.getIndex()-1);
		}
		getList().remove(itemIndex);
		getEditor().remove(getItem());
	}

}
