package mvc.dao;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import mvc.dto.Member;

public class MemberDao {
	static final String LIST = "memberlist";
	
	ArrayList<Member> list= null; //memberlist를 저장하기위한 참조변수
	ServletContext context; // 메모리저장 application영역 접근을 위함
	
	public MemberDao(ServletContext context) {
		this.context = context;
		//member list를 가져온다
		list = (ArrayList<Member>)context.getAttribute(LIST);
		if(list == null){
			//member list가 존재하지 않으면 새로 생성한다.
			list = new ArrayList<Member>();
		}
	}
	public void setMemberList() {
		context.setAttribute(LIST, this.list); //멤버 리스트 저장
	}
	
	//member를 추가한다.
	public void insertMember(Member member) {
		//리스트에 멤버를 추가한다.
		list.add(member);
		//추가된 멤버 리스트 update
		this.setMemberList();
	}
	
	//member 삭제
	public void deleteMember(Member member) {
		//멤버리스트에서 삭제하기.
		list.remove(member);
		//변경된 리스트 update
		this.setMemberList();
	}
	/*
	//member 검색
		return -1 : 같은 이름이 존재하지않음
				 -2 : arraylist의 index
	 */
	public int searchMember(String name) {
		int index = -1;
		//arraylist전체를 하나씩 비교한다.
		for(int i=0;i<list.size();++i) {
			Member search = list.get(i);
			if(name.equals(search.getName())) {
				//같은 이름의 데이타를 찾음
				index=i;
				break;
				
			}
		}
		return index;
	}
	//index에 해당하는 member 넘겨주기
	public Member getMember(int index) {
		return list.get(index);
	}
	
	public Member getMember(String name) {
		Member search = null;
		int index = searchMember(name);
		if(index != -1) {
			search = list.get(index);
		}
		return search;
	}
	public int size() {
		return list.size();
	}
}
