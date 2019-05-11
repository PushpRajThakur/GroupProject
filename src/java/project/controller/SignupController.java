/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.controller;

import java.io.IOException;
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
public class SignupController extends HttpServlet {

      

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            SignupDao user=new SignupDao();
            user.setFirstName(request.getParameter("firstname"));
            user.setLastName(request.getParameter("lastname"));
            user.setGender(request.getParameter("gender"));
            user.setUsername(request.getParameter("username"));
            user.setPhone(request.getParameter("phone"));
            user.setPassword(request.getParameter("password"));
            user.setUsertype(request.getParameter("usertype"));
            int i=SignupOperation.Signup(user);
          if(i>0)
            {
                HttpSession session = request.getSession(false);
                session.setAttribute("message","Registration Successfull");
                response.sendRedirect("login.html");
            }
            else
            {
                HttpSession session=request.getSession(false);
                session.setAttribute("message","Registration Not Successfull");
                response.sendRedirect("signup.jsp");
            }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
