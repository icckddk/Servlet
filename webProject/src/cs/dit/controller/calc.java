package cs.dit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calc
 */
@WebServlet("/calc")
public class calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1, num2;
		int result;
		String op;
		doGet(request, response);
		
		response.setContentType("text/html); carset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		
		op = request.getParameter("operator");
		
		Calc1 calc = new Calc1(num1, num2, op);
		result = calc.getResult();
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>CALCULATOR</TITLE></HEAD>");
		out.println("<BODY><CENTER>");
		out.println("<H2>CALCULATING RESULT</H2><HR>");
		out.println(num1 + " " + op + "+ num2" + " = " + result);
		out.println("</BODY></HTML>");
	}

}
