package project27;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		AddressBook ab = null;
		int iMenu = 0;

		try {
			System.out.println("주소록을 초기화 합니다.");
			ab = new AddressBookImpl01();
			System.out.print("주소록 파일 이름을 입력하세요... ");
			ab.init(new String(dis.readLine()));

			while (iMenu != 6) {
				System.out.println("================================");
				System.out.println("   0. 주소록 파일 불러오기 ");
				System.out.println("   1. 주소 추가하기");
				System.out.println("   2. 주소 삭제하기");
				System.out.println("   3. 주소 변경하기");
				System.out.println("   4. 주소록 파일 저장하기");
				System.out.println("   5. 주소록 다른 파일에 저장하기");
				System.out.println("   6. 종료하기");
				System.out.println("================================");
				System.out.print("메뉴의 번호를 입력하세요 : ");
				iMenu = Integer.parseInt(dis.readLine());

				switch (iMenu) {
				case 0: // 주소록 파일 불러오기
					System.out.print("주소록 파일 이름을 입력하세요...");
					ab.init(new String(dis.readLine()));
					break;
				case 1: // 주소 추가하기
					String strName;
					String strAddress;
					String strPhone;
					System.out.print("이    름 : ");
					strName = new String(dis.readLine());
					System.out.print("주    소 : ");
					strAddress = new String(dis.readLine());
					System.out.print("전화번호 : ");
					strPhone = new String(dis.readLine());
					ab.add(strName, strAddress, strPhone);
					break;
				case 2: // 주소 삭제하기
					String deleteFile;
					System.out.print("삭제할 이름을 입력하세요 : ");
					deleteFile = new String(dis.readLine());
					ab.delete(deleteFile);
					break;
				case 3: // 주소 변경하기
					String searchFile;
					String modifyFile;
					System.out.print("검색할 이름을 입력하세요 : ");
					searchFile = new String(dis.readLine());
					System.out.print("수정할 이름을 입력하세요 : ");
					modifyFile = new String(dis.readLine());
					ab.modify(searchFile, modifyFile);
					break;
				case 4: // 주소록 파일 저장하기
					ab.save();
					break;
				case 5: // 주소록 다른 파일에 저장하기
					System.out.print("저장할 파일의 이름을 입력하세요...");
					ab.save(new String(dis.readLine()));
					break;
				case 6: // 종료하기
					iMenu = 6;
					break;
				default: // 잘못된 메뉴가 선택되었을 때
					break;
					
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}