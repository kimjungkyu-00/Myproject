
public class Developer {
	String name;
	int annual;
	int num;

	
	Developer(String name,int annual){
		this.name=name;
		this.annual=annual;
		
	}
	
	
	public int salary(){
		
		
		if(annual<=3) {
			num=2800 + (100*3);
		}
		else if(annual<7 && annual>=4) {
			num=3500 + (100*5);		
		}
		else if(annual>=7) {
			num=4500 + (100*7);		
		}
		return num;
		
		
	}
}