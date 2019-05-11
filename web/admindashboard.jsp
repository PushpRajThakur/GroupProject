<%-- 
    Document   : admindashboard
    Created on : 14 Apr, 2019, 2:01:11 PM
    Author     : HP
--%>

<%@page import="project.dao.SignupDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%SignupDao user=(SignupDao)session.getAttribute("user");%>
<html>
    <head>
        
        <link type="text/css" rel="stylesheet" href="style.css">
        
        
    </head>
    <body>
        
       <div class="header">
             
             <img src="icon.png">
             <p> Recruitment</p>
             <nav style="float:right;margin-right: 20px;margin-top: 50px;">
                 
                   <form action="index.html" method="get">
                       <input type="submit" value="Logout" style="font-size: 20px;color:white;background-color:darkviolet;border:none;padding: 10px;">
                    </form>
             </nav>
        </div>
        
          
           <div class="navigation"><br><br>
               <nav>
                   <a href="index.html">Home</a>
                   <a href="viewresume.jsp">View Resume</a>
                   <a href="help.html">Help &amp Support</a>
                   <button style="float: right;margin-right: 60px;font-family:monospace;background-color:darkgoldenrod;color: whitesmoke;border:none;font-size: 30px;margin-top: -20px;border-radius: 10px;"><%=user.getFirstName()+" "+user.getLastName()%></button>
               </nav>
           </div>
           
           <div class="middle">
            <p style="font-size: 25px;color:white;background-color: darkgoldenrod;text-align: center">Dashboard</p>
              <center>
              <table id="ltb1" border="1px solid black">
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