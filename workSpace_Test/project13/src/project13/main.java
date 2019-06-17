package project13;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		ArrayList<User> u = new ArrayList<User>();

		while (true) {
			System.out.println("============");
			System.out.println("1.등록  2.변경 3.삭제");
			System.out.println("============");
			System.out.print("선택 : ");
			Scanner sc = new Scanner(System.in);
			int check = sc.nextInt();

			if (check == 1) {
				User user = new User();
				Scanner sc1 = new Scanner(System.in);
				String[] arg = sc1.nextLine().split(",");
				user.name = arg[0];
				user.num = arg[1];
				user.address = arg[2];
				user.email = arg[3];
				u.add(user);
				for (User u1 : u) {
					System.out.println(u1.name + u1.num + u1.address + u1.email);
				}
			}
			if (check == 2) {
				User user = new User();
				Scanner sc1 = new Scanner(System.in);
				String[] arg = sc1.nextLine().split(",");

				for (User u1 : u) {
					{
						System.out.println(u1.name +","+ u1.num+"," + u1.address+"," + u1.email);
					}
				}
			}

		}
	}

}
