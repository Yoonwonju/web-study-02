package web_study_02.unit08;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CheckboxServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String items[] = request.getParameterValues("item");
		
		if(items == null)
			items = new String[]{"선택한 항목이 없습니다."};
		String arrToltems = Arrays.stream(items).collect(Collectors.joining(","));
		
			
		request.setAttribute("arrToltems", arrToltems);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("08_result.jsp");
		dispatcher.forward(request, response);
		
	
	}

}
