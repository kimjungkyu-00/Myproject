import java.util.*;
import java.io.*;

public class AddressBookImpl01 implements AddressBook {
	private ArrayList<Data> List = null; // Data ��ü�� ��� ArrayList ���� ����
	private File file = null; // ���ϰ���
	private Data address = null;

	public void init(String strFile) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		List = new ArrayList<Data>(50); // Data ��ü�� ���� ArrayList 50�� ����
		file = new File(strFile); // ���� Ŭ���� ��ü ����

		/* ������ �б� �����Ѱ��� �Ǵ� */
		if (file.canRead()) {
			/* �бⰡ �����ϴٸ� ���� ��ü�� ���� �� �ִ� ����� ��ü�� �����. */
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String strTmp; // ���Ͽ��� �о�� ������ �ӽ÷� ����

			/* BufferedReader Ŭ���� ��ü�� readLine() �޼ҵ带 �̿��� ������ ������ �д´�. */
			while ((strTmp = br.readLine()) != null) { // ���� �� �о� ���µ� null���� �ƴ� �� ����
				/* strTemp���� "\t" �� ���й��ڷ� ArrayList�� ���� ���ڿ��� �����Ѵ�. */
				String strArray[] = strTmp.split("\t");
				address = new Data();
				address.strName = strArray[0];
				address.strAddress = strArray[1];
				address.strPhone = strArray[2];

				/* List�� address��ü�� �߰��Ѵ�. */
				List.add(address);

				/* ȭ�鿡 ��� */
				System.out.print(address.strName + "\t");
				System.out.print(address.strAddress + "\t");
				System.out.println(address.strPhone);
			}
			/* �Է�Ŭ������ �ݴ´� */
			fr.close();
			br.close();

		} else {
			/* �ּҷ� ������ �������� ���� ���� */
			file.createNewFile();
		}
	}

	public void add(String strName, String strAddress, String strPhone) {
		address = new Data();
		address.strName = strName;
		address.strAddress = strAddress;
		address.strPhone = strPhone;

		/* List�� address��ü�� �߰��Ѵ�. */
		List.add(address);
	}

	public void save() throws IOException {
		/* File ��ü�� �μ��� ��� ��Ʈ�� ��ü�� �����. */
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));

		for (int index = 0; index < List.size(); index++) {
			address = List.get(index); // List�� �ִ� address��ü�� ������� �޾ƿ´�.

			/* write()�޼���� ���ۿ� ������ ä��� */
			bw.write(address.strName + "\t" + address.strAddress + "\t" + address.strPhone + "\n");

			/* ������ ������ �Ѳ����� ���Ͽ� ����. */
			bw.flush();
		}
		/* ����� ���� ��ü�� �ݴ´�. */
		bw.close();
	}

	public void save(String strFile) throws IOException {
		/* File ��ü�� �μ��� ��� ��Ʈ�� ��ü�� �����. */
		BufferedWriter bw = new BufferedWriter(new FileWriter(strFile));

		for (int index = 0; index < List.size(); index++) {
			address = List.get(index); // List�� �ִ� address��ü�� ������� �޾ƿ´�.

			/* write()�޼���� ���ۿ� ������ ä��� */
			bw.write(address.strName + "\t" + address.strAddress + "\t" + address.strPhone + "\n");

			/* ������ ������ �Ѳ����� ���Ͽ� ����. */
			bw.flush();
		}
		/* ����� ���� ��ü�� �ݴ´�. */
		bw.close();
	}

	public void delete(String deleteFile) throws IOException {
		/* File ��ü�� �μ��� ��� ��Ʈ�� ��ü�� �����. */
		for (int index = 0; index < List.size(); index++) {
			address = List.get(index); // List�� �ִ� address��ü�� ������� �޾ƿ´�.

			/* for���� ���ٰ� ���� �̸��� �߰ߵǸ� */
			if (deleteFile.equals((String) address.strName)) {
				List.remove(index); // List���� �ش� index�� ����
				System.out.println(deleteFile + "�� ���� �Ǿ����ϴ�.");
			}
		}

	}

	/* �ּҷ� ���� */
	public void modify(String searchFile, String modifyFile) throws IOException {
		for (int index = 0; index < List.size(); index++) {
			address = List.get(index); // List�� �ִ� address��ü�� ������� �޾ƿ´�.

			/* for���� ���ٰ� ���� �̸��� �߰ߵǸ� */
			if (searchFile.equals((String) address.strName)) {
				address.strName = modifyFile; // ������ �̸� DataŸ�Կ� �����ϰ�
				List.set(index, address); // ������ DataŸ���� ArrayList�� ��ü�Ѵ�.
				System.out.println(searchFile + "�� " + modifyFile + " �μ��� �Ǿ����ϴ�.");
			}
		}
	}
}
