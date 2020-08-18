package web_study_02.unit04;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));
		

		request.setAttribute("id", id);
		request.setAttribute("age", age);
		response.setContentType("text/html; charset=UTF-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("04_result.jsp");
		dispatcher.forward(request, response);
//		response.getWriter()
//		.append("<html><body>")
//		.append("당신이 입력한 정보입니다.<br>")
//		.append("아 이 디 : ")
//		.append(id)
//		.append("<br> 나이 : ")
//		.append(age)
//		.append("<br><a href='javascript:history.go(-1)'>다시</a>")
//		.append("</body></html>");
		
		
	}
}

//
//@WebServlet("/hello")
//public class HelloServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		processRequest(request, response);
//		
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		processRequest(request, response);
////		doGet(request, response);
//	}
//
//	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		response.setContentType("text/html; charset=UTF-8");
//		response.getWriter()
//		.append("<html><body><h1>")
//		.append("Hello Servlet 한글~")
//		.append("</h1></body></html>");
//		
//	}
//
//}
