package web_study_02.unit05;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		
		request.setAttribute("name", name);
		request.setAttribute("addr", addr);
		
		response.setContentType("text/html; charset = UTF-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("05_result.jsp");
		dispatcher.forward(request, response);
	}

}

//private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	String id = request.getParameter("id");
//	int age = Integer.parseInt(request.getParameter("age"));
//	
//
//	request.setAttribute("id", id);
//	request.setAttribute("age", age);
//	response.setContentType("text/html; charset=UTF-8");
//	RequestDispatcher dispatcher = request.getRequestDispatcher("04_result.jsp");
//	dispatcher.forward(request, response);