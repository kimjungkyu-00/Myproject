package project17;

public class Animal {
	 String name;
	 String food;
	
	public Animal(String name,String food) {
		this.name=name;
		this.food=food;
		
	}
	

	@Override
	public String toString() {
		return name+","+food;
	}
	
	
	
	
}
