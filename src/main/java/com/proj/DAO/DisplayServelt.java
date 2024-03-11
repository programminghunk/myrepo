package com.proj.DAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.proj.controller.JdbcController;

/**
 * Servlet implementation class DisplayServelt
 */
public class DisplayServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/HTML");
		PrintWriter pout=response.getWriter();
		JdbcController jc=new JdbcController();
		//jc.createTable();
		jc.insertEmployee();
		pout.append("<html><body><h1>Wecome!!!<br>This is Servlet<br> Data inserted successfully<h1></body></html>");
	}

}
