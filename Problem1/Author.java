package Oops_Exercise_2.Problem1;

public class Author {
	private String name;
	private String country;
	public Author(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Author() {
		
	}
	public String toString() {
		return "Author {name=" + getName()+ ", country=" + getCountry()+ "}";
	}
	public String getAuthorDetails() {
		return toString();
	}
}
