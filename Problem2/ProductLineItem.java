package Oops_Exercise_2.Problem2;

public class ProductLineItem {
	private int id;
	private int quantity;
	private Product product;
	public ProductLineItem(int id, int quantity, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String toString(){
        return "ProductLineItem{"+"id="+getId()+","+"quantity="+getQuantity()+","+"Product="+product+"}";
    }
	public String getItemDetails() {
		return toString();
	}
}
