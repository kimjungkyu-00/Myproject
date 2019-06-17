package my.dao;

import java.util.*;

import javax.servlet.ServletContext;

import my.dto.*;

public class MemberDao {
	static final String LIST = "memberlist";
	
	ArrayList<Member> list=null;
	  ServletContext context=null;
	
	public MemberDao(ServletContext context) {
			list=(ArrayList<Member>)context.getAttribute(LIST);
			if(list == null) {
				list = new ArrayList<Member>();
			}
	  }
	public void setMemberList() {
		context.setAttribute(LIST, this.list);//멤버 리스트 저장
	}
	
	public void insultMember(Member member) {
		list.add(member);
		this.setMemberList();
	}
	
}
