package mvc.dao;

import java.util.ArrayList;

import javax.servlet.ServletContext;

public class LogonDao {
	final static String LIST = "logonlist";
	ServletContext contex=null;
	ArrayList<LogonDataBean> list=null;
	
	public LogonDao(ServletContext context) {
		this.contex =context;
		list = (ArrayList<LogonDataBean>)context.getAttribute(LIST);
		if(list == null) {
			list=new ArrayList<LogonDataBean>();
		}
	}
	public void insertMember(LogonDataBean log) {
		list.add(log);
	}
}
