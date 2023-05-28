package com.jsp.web;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/operation")
public class Saveuser extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		   String save= req.getParameter("save");
		   String update= req.getParameter("update");
		   String delete= req.getParameter("delete");
		   String getall= req.getParameter("getall");
		   
		   if(save!=null) {
			  RequestDispatcher rd= req.getRequestDispatcher("save.jsp");
			  rd.forward(req, resp);
		   }else if(update!=null) {
			   RequestDispatcher rd= req.getRequestDispatcher("save.jsp");
				  rd.forward(req, resp);
		   }else if(delete!=null) {
			   RequestDispatcher rd= req.getRequestDispatcher("save.jsp");
				  rd.forward(req, resp);
		   }else if(getall!=null){
			   RequestDispatcher rd= req.getRequestDispatcher("save.jsp");
				  rd.forward(req, resp);
		   }
	}	
		
		
		
	}


