package com.trainings.pool;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource( name = "jdbc/mydb")
	private DataSource datasource;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Connection con = null;	
	Statement stmt = null;
	ResultSet rs = null;
	PrintWriter out = response.getWriter();
	
	try {
		con = datasource.getConnection();
		String sql = "select * from ems_details";
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		
		//process the resource
		
		while(rs.next()) {
			out.println("<br/>" + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " "+ rs.getString(5)+ " "+rs.getString(6) );
		}
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	}

}
