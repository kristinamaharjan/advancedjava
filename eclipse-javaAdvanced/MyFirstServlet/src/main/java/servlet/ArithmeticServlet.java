package servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ArithmeticServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
	PrintWriter pw = response.getWriter();
	int first = Integer.parseInt(request.getParameter("txtFirst"));
	int second = Integer.parseInt(request.getParameter("txtSecond"));
	int result;
	
	String buttonPressed = request.getParameter("btn");
	if(buttonPressed.equals("Add")) {
		result = first + second;
		pw.print("Sum of" + first + "and" + second + "is:" +result);
	}else {
		result = first - second;
		pw.print("Subtraction of" + first + "and" + second + "is:" +result);
	}
	}
}
