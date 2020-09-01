package Oops_Exercise_2.Problem2;

public class Product {
	private int id;
	private String name;
	private String description;
	public Product(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public  String toString(){
        return "Product{id="+getId()+", name="+getName()+","+"description="+getDescription()+"}";
    }
	public String getProductDetails() {
        return "Product{"+"name="+getName()+","+"description="+getDescription()+"}";	
	}
}
