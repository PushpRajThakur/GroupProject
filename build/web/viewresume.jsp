

<%@page import="project.dao.SignupDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="project.dao.ResumeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%SignupDao user=(SignupDao)session.getAttribute("user");%>
<!DOCTYPE html>
<html>
    <head>
        
        <link type="text/css" rel="stylesheet" href="style.css">
        
        
    </head>
     <jsp:useBean id="c1" class="project.operation.ResumeOperation"></jsp:useBean>
    <body>
        
       <div class="header">
             
             <img src="icon.png">
             <p> Recruitment</p>
             <nav style="float:right;margin-right: 20px;margin-top: 50px;">
                 
                   <form action="index.html" method="post">
                       <input type="submit" value="Logout" style="font-size: 20px;color:white;background-color:darkviolet;border:none;padding: 10px;">
                    </form>
             </nav>
        </div>
        
          
           <div class="navigation"><br><br>
               <nav>
                   <a href="index.html">Home</a>
                   <a href="admindashboard.jsp">Profile</a>
                   <a href="help.html">Help &amp Support</a>
                   <button style="float: right;margin-right: 60px;font-family:monospace;background-color:darkgoldenrod;color: whitesmoke;border:none;font-size: 30px;margin-top: -20px;border-radius: 10px;"><%=user.getFirstName()+" "+user.getLastName()%></button>
               </nav>
           </div>
           
           <div class="middle">
            <p style="font-size: 25px;color:white;background-color: darkgoldenrod;text-align: center">All Resumes</p>
              <center>
                  <% ResultSet rs=c1.showAllResume();
                  while (rs.next())
                  {
                      %>
                  
              <table id="ltb1" border="1px solid black">
                  
                    <tr>
                        <th>FirstName</th>
                        <th>LastName</th> 
                        <th>Gender</th>
                        <th>DOB</th>
                        <th>Email</th> 
                        <th>Phone</th>
                        <th>Qualification</th>
                        <th>Percentage</th>
                        <th>JobProfile</th>
                        <th>JobSkills</th>
                        <th>Hobbies</th>
                        <th>Address</th>
                        <th>Status</th>
                    </tr>
                  <tr>
                      <td><%=rs.getString("firstname")%></td>
                        <td><%=rs.getString("lastname")%></td> 
                        <td><%=rs.getString("gender")%></td>
                        <td><%=rs.getString("dob")%></td>
                        <td><%=rs.getString("email")%></td> 
                        <td><%=rs.getString("phone")%></td>
                         <td><%=rs.getString("qualification")%></td>
                          <td><%=rs.getString("percentage")%></td>
                           <td><%=rs.getString("jobprofile")%></td>
                            <td><%=rs.getString("jobskills")%></td>
                             <td><%=rs.getString("hobbies")%></td>
                              <td><%=rs.getString("address")%></td>
                               <td><%=rs.getString("status")%></td>
                    </tr>
                  <!--<tr>
                        <td>Blog</td>
                        <td>Reset Password</td> 
                        <td>Post Jobs</td>
                        <td>Work at </td>
                        <td>Instagram</td> 
                        <td>Privacy Policy</td>
                    </tr>
                  <tr>
                        <td>Career Insights</td>
                        <td>Customer Support</td> 
                        <td>Recruiting Solutions</td>
                        <td>CareerBuilder</td>
                        <td>Youtube</td> 
                        <td>Terms</td>
                    </tr>
                  <tr>
                        <td>Talent Networks</td>
                        <td></td> 
                        <td>Screening</td>
                        <td></td>
                        <td>Facebook</td> 
                        <td></td>
                    </tr>
                  <tr>
                        <td>Sitemap</td>
                        <td></td> 
                        <td>HCM</td>
                        <td></td>
                        <td>LinkedIn</td> 
                        <td>Ad Choices</td>
                    </tr>
                -->
                </table>
              <%}%>
                </center> 
           </div>
        
        
        
        <div class="footer">
            <center>
              <table id="ltb1">
                    <tr>
                        <th>Job Seekers</th>
                        <th>Help Center</th> 
                        <th>Employers</th>
                        <th>CareerBuilder</th>
                        <th>Stay Connected</th> 
                        <th>Legal</th>
                    </tr>
                  <tr>
                        <td>International Jobs</td>
                        <td>Manage Email</td> 
                        <td>Browse Products</td>
                        <td>About Us</td>
                        <td>Twitter</td> 
                        <td>Security and Fraud</td>
                    </tr>
                  <tr>
                        <td>Blog</td>
                        <td>Reset Password</td> 
                        <td>Post Jobs</td>
                        <td>Work at </td>
                        <td>Instagram</td> 
                        <td>Privacy Policy</td>
                    </tr>
                  <tr>
                        <td>Career Insights</td>
                        <td>Customer Support</td> 
                        <td>Recruiting Solutions</td>
                        <td>CareerBuilder</td>
                        <td>Youtube</td> 
                        <td>Terms</td>
                    </tr>
                  <tr>
                        <td>Talent Networks</td>
                        <td></td> 
                        <td>Screening</td>
                        <td></td>
                        <td>Facebook</td> 
                        <td></td>
                    </tr>
                  <tr>
                        <td>Sitemap</td>
                        <td></td> 
                        <td>HCM</td>
                        <td></td>
                        <td>LinkedIn</td> 
                        <td>Ad Choices</td>
                    </tr>
                
                </table>
                </center>
            
            <p style="color:whitesmoke;height: 50px;width: 1000px;margin-left: 200px;font-size: 18px;">Find average salaries, top paying locations and day-to-day responsibilities for hundreds of our most popular jobs. Search through the industries below to find job titles that closely match your field of interest.</p>
                        
                   
                
                
               <a href="https://www.facebook.com/HelloiamManish/" style="position: fixed; top:650px;left:1200px;"><img src="fb.png"></a>
                <a href="http://www.twitter.com" style="position: fixed; top:652px;left:1260px;"><img src="twr.png"></a>
               <a href="http://www.linkedin.com" style="position: fixed; top:650px;left:1320px;"><img src="lkd.png"></a>
               <p id="lastp" style="background-color: white; color:darkblue;text-shadow: 1px 1px black; font-size: 30px;margin-left: 900px;">Follow Us</p>
           </div>


           
        
    </body>
</html>
