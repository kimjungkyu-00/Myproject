
import java.io.*;

public interface AddressBook {
	/* �ּҷ� ���Ϸκ��� �����͸� �о�� ���� ��ü�� ���� */
	public void init(String strFile) throws IOException;

	/* �ּҷϿ� �� �ּ� ������ �߰� */
	public void add(String strName, String strAddress, String strPhone);

	/* ���ŵ� �ּҷ��� ���� ���Ͽ� ���� */
	public void save() throws IOException;

	/* �ּҷ��� �� ���Ͽ� ���� */
	public void save(String strFile) throws IOException;

	/* �ּҷ��� ���� */
	public void delete(String strFile) throws IOException;

	/* �ּҷ��� ���� */
	public void modify(String searchFile, String strFile) throws IOException;

}