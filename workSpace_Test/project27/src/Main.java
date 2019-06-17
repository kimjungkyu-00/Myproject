
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		AddressBook ab = null;
		int iMenu = 0;

		try {
			System.out.println("�ּҷ��� �ʱ�ȭ �մϴ�.");
			ab = new AddressBookImpl01();
			System.out.print("�ּҷ� ���� �̸��� �Է��ϼ���... ");
			ab.init(new String(dis.readLine()));

			while (iMenu != 6) {
				System.out.println("================================");
				System.out.println("   0. �ּҷ� ���� �ҷ����� ");
				System.out.println("   1. �ּ� �߰��ϱ�");
				System.out.println("   2. �ּ� �����ϱ�");
				System.out.println("   3. �ּ� �����ϱ�");
				System.out.println("   4. �ּҷ� ���� �����ϱ�");
				System.out.println("   5. �ּҷ� �ٸ� ���Ͽ� �����ϱ�");
				System.out.println("   6. �����ϱ�");
				System.out.println("================================");
				System.out.print("�޴��� ��ȣ�� �Է��ϼ��� : ");
				iMenu = Integer.parseInt(dis.readLine());

				switch (iMenu) {
				case 0: // �ּҷ� ���� �ҷ�����
					System.out.print("�ּҷ� ���� �̸��� �Է��ϼ���...");
					ab.init(new String(dis.readLine()));
					break;
				case 1: // �ּ� �߰��ϱ�
					String strName;
					String strAddress;
					String strPhone;
					System.out.print("��    �� : ");
					strName = new String(dis.readLine());
					System.out.print("��    �� : ");
					strAddress = new String(dis.readLine());
					System.out.print("��ȭ��ȣ : ");
					strPhone = new String(dis.readLine());
					ab.add(strName, strAddress, strPhone);
					break;
				case 2: // �ּ� �����ϱ�
					String deleteFile;
					System.out.print("������ �̸��� �Է��ϼ��� : ");
					deleteFile = new String(dis.readLine());
					ab.delete(deleteFile);
					break;
				case 3: // �ּ� �����ϱ�
					String searchFile;
					String modifyFile;
					System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
					searchFile = new String(dis.readLine());
					System.out.print("������ �̸��� �Է��ϼ��� : ");
					modifyFile = new String(dis.readLine());
					ab.modify(searchFile, modifyFile);
					break;
				case 4: // �ּҷ� ���� �����ϱ�
					ab.save();
					break;
				case 5: // �ּҷ� �ٸ� ���Ͽ� �����ϱ�
					System.out.print("������ ������ �̸��� �Է��ϼ���...");
					ab.save(new String(dis.readLine()));
					break;
				case 6: // �����ϱ�
					iMenu = 6;
					break;
				default: // �߸��� �޴��� ���õǾ��� ��
					break;
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}