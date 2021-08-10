package com.aiti.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.aiti.entities.Student;
import com.aiti.model.StudentModel;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/student-mgt")
	private DataSource datasource;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String page = request.getParameter("page");
		
		switch(page) {
		
		case "home" -> request.getRequestDispatcher("index.jsp").forward(request, response);
		
		case "listStudent" -> {
								listStudent(request, response);
			}
		case "editStudent" -> {
			RequestDispatcher dispatcher = request.getRequestDispatcher("editStudent-form.jsp");
			dispatcher.forward(request, response);
		}
		case "deletStudent" -> {
			int studentId = Integer.parseInt(request.getParameter("studentId"));
			deleteRecord(studentId);
			listStudent(request,response);
		}
		case "searchForStudent" ->{
			searchForRecord(request, response);
			listStudent(request, response);
		}
		
		case "search"->{
			searchStudentName(request, response);
		}
		
		/*case "deleteStudent" -> {
			request.getRequestDispatcher("deleteStudent-form.jsp").forward(request, response);
		}*/
		
		default -> request.getRequestDispatcher("error.jsp").forward(request, response);
		
		}
		
		
	}
	private void searchStudentName(HttpServletRequest request, HttpServletResponse response) {
		//read the search from the form data
		String searchName = request.getParameter("searchName");
		//search the student from the database
		List<Student> students = new StudentModel().searchStudentName(datasource, searchName);
		request.setAttribute("list_student", students);
		try {
			request.getRequestDispatcher("listStudent.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void listStudent (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<Student>  list_student = new ArrayList<>();
		list_student = new StudentModel().listAllStudent(datasource);
		request.setAttribute("list_student", list_student);
		request.getRequestDispatcher("listStudent.jsp").forward(request, response);
	
	}
	
	
	
	public void addRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		Student newStudent = new Student(firstName, lastName, email); 
				new StudentModel().addNewStudent(datasource, newStudent);
				//request.getRequestDispatcher("addStudent-form.jsp").forward(request, response);
		
	}
	
	
public void searchForRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		Student lookAtStudent = new Student(firstName, lastName, email); 
				new StudentModel().lookForStudent(datasource, lookAtStudent);
				//request.getRequestDispatcher("addStudent-form.jsp").forward(request, response);
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
			String from = request.getParameter("from");
			switch(from) {
						
			case "addRecord" -> {
				addRecord(request, response);
				listStudent(request, response);
			}
			case "editStudent" -> {editStudentRecord(request, response);
			listStudent(request, response);	
}
			/*case "deleteStudent" -> {
				deleteStudentRecord(request, response);
				listStudent(request, response);
			}
*/
default -> request.getRequestDispatcher("error.jsp").forward(request, response);

			
			}
			
	}
public void editStudentRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int studentId = Integer.parseInt(request.getParameter("studentId"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		Student editStudent = new Student(studentId, firstName, lastName, email); 
				new StudentModel().editStudent(datasource, editStudent);

}
/*
public void deleteStudentRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	int studentId = Integer.parseInt(request.getParameter("studentId"));
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	String email = request.getParameter("email");
	
	Student deleteStudent = new Student(studentId, firstName, lastName, email); 
			new StudentModel().deleteStudent(datasource, deleteStudent);

}*/

public void deleteRecord(int studentId) throws ServletException, IOException{
	
	new StudentModel().deleteStudent(datasource, studentId);
	
	
	/*
	int studentId = Integer.parseInt(request.getParameter("studentId"));
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	String email = request.getParameter("email");
	
	Student deleteStudent = new Student(studentId, firstName, lastName, email); 
			new StudentModel().deleteStudent(datasource, deleteStudent);
*/
}

public void searchStudent (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	List<Student>  search_Student = new ArrayList<>();
	String firstName = request.getParameter("firstName");
	//String lastName = request.getParameter("lastName");
	search_Student = new StudentModel().searchRecord(datasource, firstName);
	request.setAttribute("search_Student", search_Student);
	request.getRequestDispatcher("listStudent.jsp").forward(request, response);

}
}
