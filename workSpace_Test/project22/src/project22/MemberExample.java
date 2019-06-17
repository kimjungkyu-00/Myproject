package project22;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1= new Member("blue");
		Member obj2= new Member("blue");
		Member obj3= new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 , 2 과 동일합니다.");
	}else {
		System.out.println("obj1과 obj2는 동일하지않습니ㅏㄷ.");
	}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 3는 동등합니다");
		}else {
			System.out.println("동일하지않습니다.");
		}
	}
}


