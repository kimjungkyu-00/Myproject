package mvc.dto;

public class Product {
	String name;
	String no;
	String desc;
	int price;
	String img;
	
	public Product() { }
	
	public Product(String name, String no, String desc , int price , String img) { 
		this.name=name;
		this.no=no;
		this.desc=desc;
		this.price=price;
		this.img = img;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
