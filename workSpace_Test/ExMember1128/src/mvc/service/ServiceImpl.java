package mvc.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ServiceImpl {
	String process(HttpServletRequest request, HttpServletResponse response);
}
