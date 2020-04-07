package controller;

import java.io.IOException;
import java.sql.Connection;
//import java.time.LocalDate;
//import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.ConnectionManager;



@WebServlet(urlPatterns= {"/signup"})
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SignUpController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Sign up Controller");
		// Fill your code here
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupView.jsp");
		rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request,response);
		Connection cn= null;
		//ConnectionManager connectionmanager =new ConnectionManager();
		cn=ConnectionManager.getConnection();
		if(cn!=null) {
			System.out.println("Connection Established");
			
		}
		else
		{
			System.out.println("Check your connection");
		}

		
	}

}
