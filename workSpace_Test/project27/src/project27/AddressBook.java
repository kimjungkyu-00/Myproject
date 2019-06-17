package project27;


import java.io.*;

public interface AddressBook {
	/* 주소록 파일로부터 데이터를 읽어와 벡터 객체에 저장 */
	public void init(String strFile) throws IOException;

	/* 주소록에 새 주소 데이터 추가 */
	public void add(String strName, String strAddress, String strPhone);

	/* 갱신된 주소록을 원래 파일에 저장 */
	public void save() throws IOException;

	/* 주소록을 새 파일에 저장 */
	public void save(String strFile) throws IOException;

	/* 주소록을 삭제 */
	public void delete(String strFile) throws IOException;

	/* 주소록을 수정 */
	public void modify(String searchFile, String strFile) throws IOException;

}
