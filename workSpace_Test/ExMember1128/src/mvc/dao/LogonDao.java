package mvc.dao;

import java.util.ArrayList;

import javax.servlet.ServletContext;

import com.sun.xml.internal.bind.CycleRecoverable.Context;

import mvc.dto.LogonDataBean;

public class LogonDao {
	final static String LIST = "logonlist";
	ServletContext context=null;
	ArrayList<LogonDataBean> list=null;
	
	public LogonDao(ServletContext context) {
		this.context = context;
		list = (ArrayList<LogonDataBean>)context.getAttribute(LIST);
		if( list ==null ) {
			list = new ArrayList<LogonDataBean>();
		}
	}
	
	public void updateMemberList() {
		context.setAttribute(LIST,this.list);
	}
	
	public void insertMember(LogonDataBean log) {
		list.add(log);		
		this.updateMemberList();
	}
	
	public int removeMember(String id) {
	  int result = -1;
	  LogonDataBean member = this.getMember(id);
	  if(member != null ) {
		  list.remove(member);
		  result =0;
	  }
	  return result ;
	}
	
	public int getMemberSize() {
		return list.size();
	}
	
	public LogonDataBean getMember(int index) {
		return list.get(index);
	}
	
	public LogonDataBean getMember(String id) {
		LogonDataBean member=null;		
		for(int i=0; i < getMemberSize() ;  ++i) {
			
			if(id.equals( list.get(i).getId() )) {
				member = list.get(i);
				break;
			}
		}
		return member;
	}
	
	
	//return  찾은경우 1, 못찾은경우 -1
	public int searchId(String id) {
		int result= -1;
		for(int i=0; i < list.size(); ++i) {
			if(id.equals(list.get(i).getId())) {
				result= 1;
				break;
			}
		}
		return result;
	}
	
	/* * id와 pw를 확인한다
	   * return 값 
	   *   -1 : id가 없는경우
	   *   -2 : pw가 틀린경우
	   *   0  : login 성공
	*/ 
	public int loginCheck(String id, String pw) {
		int result = -1;
		
		for(int i=0 ; i < this.getMemberSize(); ++i ) {
			if(id.equals( this.getMember(i).getId() ) ) { //아이디가 같은 경우
				if( pw.equals(this.getMember(i).getPasswd()) ) {
					result = 0;
				}else {
					result = -2;
				}
			}
		}
		return result;
	}
}
