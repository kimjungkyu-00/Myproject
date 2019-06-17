
public class ExMain {

	public static void main(String[] args) {
		Developer tom = new Developer("Tom",3);
		Developer john = new Developer("John",5);
		Developer sally = new Developer("Sally",7);

		
		System.out.println(tom.name+" : " +tom.salary());
		System.out.println(john.name+" : " +john.salary());
		System.out.println(sally.name+" : " +sally.salary());
		
	}
}
