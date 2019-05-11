/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import project.dao.SignupDao;
import project.operation.SignupOperation;

/**
 *
 * @author HP
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      

           SignupDao user=new SignupDao();
           user.setUsername(request.getParameter("username"));
           user.setPassword(request.getParameter("password"));
           user=SignupOperation.login(user);  
           PrintWriter out=response.getWriter();
           
           if(user!=null && user.getUsertype().equalsIgnoreCase("Admin"))
           {
               HttpSession session=request.getSession(true);
               session.setAttribute("user",user);
               response.sendRedirect("admindashboard.jsp");
           }
           else if(user!=null && user.getUsertype().equalsIgnoreCase("User"))
           {
               HttpSession session=request.getSession(true);
              
               session.setAttribute("user",user);
               response.sendRedirect("userdashboard.jsp?id="+session.getId());
           }
           else
           {
              out.println("Sorry you have entered wrong username or password");
               //response.sendRedirect("index.html");
           }
      
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
}
