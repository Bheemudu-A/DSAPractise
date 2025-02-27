package practise.interviewPrograms;

public class Person {
	
	private int id;
	private String names;
	private double price;
	private String category;
	
	public Person(int id, String names, double price, String category) {
		super();
		this.id = id;
		this.names = names;
		this.price = price;
		this.category = category;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", names=" + names + ", price=" + price + ", category=" + category + "]";
	}
	
	

}
