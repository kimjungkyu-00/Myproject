package project27;

import java.util.*;
import java.io.*;

public class AddressBookImpl01 implements AddressBook {
	private ArrayList<Data> List = null; // Data 객체를 담는 ArrayList 변수 선언
	private File file = null; // 파일관리
	private Data address = null;

	public void init(String strFile) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		List = new ArrayList<Data>(50); // Data 객체를 담을 ArrayList 50개 생성
		file = new File(strFile); // 파일 클래스 객체 생성

		/* 파일이 읽기 가능한가를 판단 */
		if (file.canRead()) {
			/* 읽기가 가능하다면 파일 객체를 읽을 수 있는 입출력 객체를 만든다. */
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String strTmp; // 파일에서 읽어온 내용을 임시로 저장

			/* BufferedReader 클래스 객체의 readLine() 메소드를 이용해 파일의 내용을 읽는다. */
			while ((strTmp = br.readLine()) != null) { // 한줄 씩 읽어 오는데 null값이 아닐 때 까지
				/* strTemp에서 "\t" 을 구분문자로 ArrayList에 각각 문자열을 삽입한다. */
				String strArray[] = strTmp.split("\t");
				address = new Data();
				address.strName = strArray[0];
				address.strAddress = strArray[1];
				address.strPhone = strArray[2];

				/* List에 address객체를 추가한다. */
				List.add(address);

				/* 화면에 출력 */
				System.out.print(address.strName + "\t");
				System.out.print(address.strAddress + "\t");
				System.out.println(address.strPhone);
			}
			/* 입력클래스를 닫는다 */
			fr.close();
			br.close();

		} else {
			/* 주소록 파일이 없음으로 새로 생성 */
			file.createNewFile();
		}
	}

	public void add(String strName, String strAddress, String strPhone) {
		address = new Data();
		address.strName = strName;
		address.strAddress = strAddress;
		address.strPhone = strPhone;

		/* List에 address객체를 추가한다. */
		List.add(address);
	}

	public void save() throws IOException {
		/* File 객체를 인수로 출력 스트림 객체를 만든다. */
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));

		for (int index = 0; index < List.size(); index++) {
			address = List.get(index); // List에 있는 address객체를 순서대로 받아온다.

			/* write()메서드로 버퍼에 내용을 채운다 */
			bw.write(address.strName + "\t" + address.strAddress + "\t" + address.strPhone + "\n");

			/* 버퍼의 내용을 한꺼번에 파일에 쓴다. */
			bw.flush();
		}
		/* 출력을 위한 객체를 닫는다. */
		bw.close();
	}

	public void save(String strFile) throws IOException {
		/* File 객체를 인수로 출력 스트림 객체를 만든다. */
		BufferedWriter bw = new BufferedWriter(new FileWriter(strFile));

		for (int index = 0; index < List.size(); index++) {
			address = List.get(index); // List에 있는 address객체를 순서대로 받아온다.

			/* write()메서드로 버퍼에 내용을 채운다 */
			bw.write(address.strName + "\t" + address.strAddress + "\t" + address.strPhone + "\n");

			/* 버퍼의 내용을 한꺼번에 파일에 쓴다. */
			bw.flush();
		}
		/* 출력을 위한 객체를 닫는다. */
		bw.close();
	}

	public void delete(String deleteFile) throws IOException {
		/* File 객체를 인수로 출력 스트림 객체를 만든다. */
		for (int index = 0; index < List.size(); index++) {
			address = List.get(index); // List에 있는 address객체를 순서대로 받아온다.

			/* for문을 돌다가 같은 이름이 발견되면 */
			if (deleteFile.equals((String) address.strName)) {
				List.remove(index); // List에서 해당 index를 삭제
				System.out.println(deleteFile + "이 삭제 되었습니다.");
			}
		}

	}

	/* 주소록 수정 */
	public void modify(String searchFile, String modifyFile) throws IOException {
		for (int index = 0; index < List.size(); index++) {
			address = List.get(index); // List에 있는 address객체를 순서대로 받아온다.

			/* for문을 돌다가 같은 이름이 발견되면 */
			if (searchFile.equals((String) address.strName)) {
				address.strName = modifyFile; // 수정할 이름 Data타입에 삽입하고
				List.set(index, address); // 수정된 Data타입을 ArrayList에 교체한다.
				System.out.println(searchFile + "이 " + modifyFile + " 로수정 되었습니다.");
			}
		}
	}
}
