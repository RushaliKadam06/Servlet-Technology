package com.jsp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class Demo extends HttpServlet{
	//httpservlet implements but still it is abstract class because no one can create its object used directly its method and states
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String save = req.getParameter("save");
		String update = req.getParameter("update");
		String delete = req.getParameter("delete");
		if(save!=null) {
		PrintWriter printWriter= resp.getWriter();
		printWriter.write("<html><body><h1></h1>"+"Save method to be executed"+"</body></html>");
	     }else 
		if(update!=null) {
			PrintWriter printWriter= resp.getWriter();
			printWriter.write("<html><body><h1></h1>"+"Update method to be executed"+"</body></html>");
	}else if(delete!=null) {
			PrintWriter printWriter= resp.getWriter();
			printWriter.write("<html><body><h1></h1>"+"Delete method to be executed"+"</body></html>");
	}

	}}
