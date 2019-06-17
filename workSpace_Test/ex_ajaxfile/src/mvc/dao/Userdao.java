package mvc.dao;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import mvc.dto.User;

public class Userdao {
	static final String LIST = "memberlist";
	   ArrayList<User> list = null; //memberlist를 저장하기 위한 참조변수
	   ServletContext context=null; //메모리저장 application영역 접근을 위함.

	   public Userdao(ServletContext context) {
			this.context = context;
			
			//member list를 가져온다
		    list= (ArrayList<User>)context.getAttribute(LIST);
		    if( list == null ){
		    	//member list가 존재하지 않으면 새로 생성한다.
		    	list = new ArrayList<User>();	    	
		    }
		}
	   
	   public void setMemberList() {
			context.setAttribute(LIST, this.list);//멤버 리스트 저장
		}
	   
		//member를 추가한다
		public void insertMember(User user) {
			//리스트에 멤버를 추가한다.
			list.add(user);	
			//추간된 멤버 리스트 update
			this.setMemberList();
		}
}
