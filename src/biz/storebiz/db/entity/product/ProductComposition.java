package biz.storebiz.db.entity.product;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;

@Model
public class ProductComposition {
	@Attribute (primaryKey=true)
	private Key productCompositionKey;
	private Key associatedProductKey;
	private String compositionName;
	private String compositionValue;
	
	public ProductComposition(){
		super();
	}
	
	public ProductComposition(Key productCompositionKey, Key associatedProductKey, String compositionName, String compositionValue){
		this.productCompositionKey = productCompositionKey;
		this.associatedProductKey = associatedProductKey;
		this.compositionName = compositionName;
		this.compositionValue = compositionValue;
	}
	
	public Key getProductCompositionKey() {
		return productCompositionKey;
	}
	public void setProductCompositionKey(Key productCompositionKey) {
		this.productCompositionKey = productCompositionKey;
	}
	public Key getAssociatedProductKey() {
		return associatedProductKey;
	}
	public void setAssociatedProductKey(Key associatedProductKey) {
		this.associatedProductKey = associatedProductKey;
	}
	public String getCompositionName() {
		return compositionName;
	}
	public void setCompositionName(String compositionName) {
		this.compositionName = compositionName;
	}
	public String getCompositionValue() {
		return compositionValue;
	}
	public void setCompositionValue(String compositionValue) {
		this.compositionValue = compositionValue;
	}
	
	
}
