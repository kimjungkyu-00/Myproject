package mylogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class exLogin
 */
@WebServlet("/exLogin")
public class exLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public exLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("ExLogin.java");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		out.print("id : "+id);
		out.print("pw : "+pw);
		
		if(id.equals("admin") && pw.equals("1234")) {
			//session객체를 받아온다.
			HttpSession mySession = request.getSession();
			//session에 정보 저장
			mySession.setAttribute("userId", id);
			
			response.sendRedirect("loginOK.jsp");
		}else {
	// id != admin pw != "1234" -> loginform.jsp
			response.sendRedirect("loginForm.jsp");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
