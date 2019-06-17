package test;


	
	class A{
		public A() {
			System.out.println("A생성");
		}
		
		void speack() {
			System.out.println("A");
		}
	}
	
	class B extends A{
		public B() {
			System.out.println("B생성");
		}
		
		@Override
		void speack() {
			System.out.println("B");
		}
	}


public class testa {

	public static void main(String[] args) {
		A a= (A) new B();
		
		a.speack();
		
		B b = new B();
		
	}

}

