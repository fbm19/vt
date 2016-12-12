package tn.enis.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import tn.enis.model.Expression;
import tn.enis.model.ExpressionForm;
import tn.enis.model.ExpressionHandler;

/**
 * Servlet implementation class ServletMain
 */
@WebServlet("/ServletMain")
public class ServletMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ExpressionForm expressionForm;

    /**
     * @see HttpServlet#HttpServlet()
     */
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		expressionForm=new ExpressionForm();
	}
    public ServletMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
	 
 
			if(!request.getParameter("textToTest").equals(null)){
				
				HttpSession session = request.getSession(true);
				if( request.getParameter("textToTest").length()==session.getAttribute("trueText").toString().length()){
				session.setAttribute("expressionForm", expressionForm);
				tn.enis.model.Expression exp=new tn.enis.model.Expression (request.getParameter("textToTest").toString());
				expressionForm.addExpression(exp);
				ExpressionHandler expHandler=new ExpressionHandler(session.getAttribute("trueText").toString(), request.getParameter("textToTest").toString());
				expressionForm.getExpressionList().get(expressionForm.getExpressionList().size()-1).setResult(expHandler.compareTexts());
				session.setAttribute("expressionForm", expressionForm);
		 
				if(request.getParameter("textToTest").equals(session.getAttribute("trueText"))){
					session.setAttribute("status", "You Won !");
			 
					session.setAttribute("expressionForm", null);
					expressionForm=new ExpressionForm();
				}
				if(expressionForm.getExpressionList().size()>=10 && !request.getParameter("textToTest").equals(session.getAttribute("trueText")) )
					{
				session.setAttribute("status", "You lost !");
				 
				session.setAttribute("expressionForm", null);
				expressionForm=new ExpressionForm();
					}
		}
		response.sendRedirect("Page1.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
