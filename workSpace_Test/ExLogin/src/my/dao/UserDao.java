package my.dao;

import my.dto.User;
import java.util.ArrayList;

public class UserDao {
	final static String LIST = "userlist";
	ArrayList<User> list=null;
	
	public UserDao() {
		list = new ArrayList<User>();
		for(int i=0;i < 10; ++i) {
			list.add(new User("myid"+i,"myid"+i));
		}
	}
	
	//return 값이 0 : i/pw 같은 경우  그외 login 실패
	public int loginCheck(String id,String pw) {
		int result=-1;
		//userlist전체 검사
		for(int i=0; i < list.size(); ++i) {
			//id가 같은지 확인
			if( id.equals(list.get(i).getId())) {
				//같은 id의 pw 같은지 검사
				if( pw.equals(list.get(i).getPw())) {
					result=0;
					break;
				}
			}
		}
		return result;
	}
}
