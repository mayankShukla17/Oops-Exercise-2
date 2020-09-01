package Oops_Exercise_2.Problem2;
public class ProductOrder {
	private int id;
	private String name;
	private ProductLineItem lineItems;
		
	public ProductOrder(int id, String name, ProductLineItem lineItems) {
		super();
		this.id = id;
		this.name = name;
		this.lineItems = lineItems;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductLineItem getLineItems() {
		return lineItems;
	}
	public void setLineItems(ProductLineItem lineItems) {
		this.lineItems = lineItems;
	}
	public void addItem(ProductLineItem lineItems) {
		this.lineItems = lineItems;
	}
	public String removeItemById(int Id) {
        int itemId=id;
        return "item removed from the order with item Id="+itemId;
	}
	public static void main(String[] args) {
        Product product=new Product(1,"Mobile","Purchase");
        ProductLineItem productLineItems=new ProductLineItem(1,2,product);
        ProductOrder productOrder=new ProductOrder(1,"HeadPhones",productLineItems);
        System.out.println(product.getProductDetails());
        productOrder.addItem(productLineItems);
        System.out.println(productOrder.getLineItems());
        System.out.println(productOrder.removeItemById(1));
    }
}
