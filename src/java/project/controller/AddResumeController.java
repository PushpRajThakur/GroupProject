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
import project.dao.ResumeDao;
import project.operation.ResumeOperation;

/**
 *
 * @author HP
 */
public class AddResumeController extends HttpServlet {

   
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      try{               
            ResumeDao user=new ResumeDao();
            user.setFirstName(request.getParameter("firstname"));
            user.setLastName(request.getParameter("lastname"));
            user.setGender(request.getParameter("gender"));
            user.setDOB(request.getParameter("dob"));
            user.setEmail(request.getParameter("email"));
            user.setPhone(request.getParameter("phone"));
            user.setQualification(request.getParameter("qualification"));
            user.setPercentage(request.getParameter("percentage"));
            user.setJobProfile(request.getParameter("jobprofile"));
            user.setJobSkills(request.getParameter("jobskills"));
            user.setHobbies(request.getParameter("hobbies"));
            user.setAddress(request.getParameter("address"));
            int i=ResumeOperation.AddResume(user);
            if(i>0)
            {
                HttpSession session = request.getSession(false);
                session.setAttribute("message","Resume Added Successfully");
                response.sendRedirect("userdashboard.jsp");
            }
            else
            {
                HttpSession session=request.getSession(false);
                session.setAttribute("message","resume Not Added");
                response.sendRedirect("#");
            }
            
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

       public String getServletInfo() {
        return "Short description";
    }

}

    


