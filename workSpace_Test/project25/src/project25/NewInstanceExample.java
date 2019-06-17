package project25;

public class NewInstanceExample {

	public static void main(String[] args) {

		try {
//			Class clazz = Class.forName("project25.SendAction");
			Class clazz = Class.forName("project25.ReciveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
