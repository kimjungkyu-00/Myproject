package mvc.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ServiceImp {
	String process(HttpServletRequest request, HttpServletResponse response);
}
