<%-- 
    Document   : signup
    Created on : 14 Apr, 2019, 4:40:48 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        
        <link type="text/css" rel="stylesheet" href="style.css">
        
        <style>
            .mid1
            {
               
                border-top-right-radius: 100px;
                background-color:#e3e3e3;
                height: 580px;
                width:400px;
                margin-left: 430px;
                margin-top:10px;
                font-size:20px;
            }
            .mid1 input
            {
                margin-left:30px;
                margin-top:20px;
                padding:10px 80px;
            }

        </style>
    </head>
    <body>
        
       <div class="header">
             
             <img src="icon.png">
             <p> Recruitment</p>
             <nav style="float:right;margin-right: 20px;margin-top: 50px;">
                 
                   <a href="login.html">Login</a>
             </nav>
        </div>
        
          
           <div class="navigation"><br><br>
               <nav>
                   <a href="index.html">Home</a>
                   <a href="searchjob.html">Search Job</a>
                   <a href="uploadresume.html">Upload Resume</a>
                   <a href="help.html">Help &amp Support</a>
               </nav>
           </div>
           
           <div class="middle" style="background-color:whitesmoke;">
                <div class="mid1">
                    <form action="signup" method="post" >
                    <img src="register.png" style="height:80px;width:80px;margin-left:60px;margin-top:10px;float:left">
                    <input type="text" name="firstname" placeholder="First Name" required  onblur="style.background='lightgrey'" onkeyup="up()">
                    <input type="text" name="lastname" placeholder="Last Name" required  onblur="style.background='lightgrey'" onkeyup="up()"><br>
                    <input type="radio" name="gender" style="margin-left:30px;" required>Male<input type="radio" name="gender" required>Female
                    <input type="text" placeholder="Username" name="username" required  onblur="style.background='lightgrey'">
                    <input type="number" name="phone" placeholder="Phone" required  onblur="style.background='lightgrey'">
                    <input type="password" name="password" placeholder="Set Password" required onblur="style.background='lightgrey'">
                    <select name="usertype" style="padding: 10px 80px;margin-top: 10;margin-left: 30">
                        <option selected value="-1">Selected</option>
                        <option value="user">User</option>
                      
                    </select><br>
                      <input type="submit" value="Register" style="border-radius: 5px;border: 1px; color:white;background:grey;padding:16px 130px;font-family:inherit;font-size:20px;">
                    </form>
                </div>

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