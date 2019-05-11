<%-- 
    Document   : addresume
    Created on : 14 Apr, 2019, 6:49:38 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        
        <link type="text/css" rel="stylesheet" href="style.css">
        <style>
            .mid1{
                background-color: #e3e3e3;
            }
        </style>
        
    </head>
    <body>
        
       <div class="header">
             
             <img src="icon.png">
             <p> Recruitment</p>
             <nav style="float:right;margin-right: 20px;margin-top: 50px;">
                 <a href="signup.html">SignUp</a>
                   <a href="login.html">Login</a>
             </nav>
        </div>
        
          
           <div class="navigation"><br><br>
               <nav>
                   <a href="index.html">Home</a>
                   <a href="searchjob.html">Search Job</a>
                   <a href="form.html">Upload Resume</a>
                   <a href="help.html">Help &amp Support</a>
               </nav>
           </div>
           
           <div class="middle">
                <div class="mid1">
               <form action="addresume" style="font-size: 15px;">
                   <fieldset style="font-size: 20px;"><legend style="font-size: 30px;color:rebeccapurple;text-shadow: 1px 1px black;">Resume</legend>
                       <p>First Name</p>
                       <input type="text" name="firstname" required>
                       <p>Last Name</p>
                       <input type="text" name="lastname" required>
                       <br><br>
                       <input type="radio" id="gender" name="gender"  required value="male">Male
                       <input type="radio" id="gender" name="gender"  required value="female">Female
                       <p>Date of Birth</p>
                       <input type="date" name="dob" required>
                       <p>Email</p>
                       <input type="email" name="email" required>
                       <p>Phone No</p>
                       <input type="number" name="phone" required>
                        <p>Qualifications</p>
                       <input type="radio" id="qualification" name="qualification"  required value="matric">Matric
                       <input type="radio" id="qualification" name="qualification"  required value="10+2">10+2
                       <input type="radio" id="qualification" name="qualification"  required value="iti">ITI
                       <input type="radio" id="qualification" name="qualification"  required value="polytechnic">Polytechnic
                       <input type="radio" id="qualification" name="qualification"  required value="btech">B.Tech
                       <input type="radio" id="qualification" name="qualification"  required value="mtech">M.Tech
                       <input type="radio" id="qualification" name="qualification"  required value="barch">B.Arch
                       <input type="radio" id="qualification" name="qualification"  required value="bca">BCA
                       <input type="radio" id="qualification" name="qualification"  required value="bba">BBA
                       <input type="radio" id="qualification" name="qualification"  required value="mba">MBA
                       <p>Percentage/CGPA</p>
                       <input type="number" name="percentage" required>
                       <p>Job Profile</p>
                       <select name="jobprofile">
                        <option selected value="consultant">Consultant</option>
                        <option value="developer">Developer</option>
                        <option value="qualityAssurance">Quality Assurrance</option>
                        <option value="devops">DevOps</option>
                        <option value="juniorEngineer">Junior Engineer</option>
                        <option value="accountingClerk">Accounting Clerk</option>
                        <option value="cceNonTechnical">CCE (Non-Technical)</option>
                        <option value="softwareEngineer">Software Engineer</option>
                        <option value="dataAnalyst">Data Analysis</option>
                        <option value="graphicsDesigner">Graphic Designer</option>
                        <option value="businessAnalyst">Business Analyst</option>
                        <option value="ITConsultant">IT Consultants</option>
                        <option value="financeManager">Finance Manager</option>
                        <option value="buildingTrades">Building Trades</option>
                        <option value="electrician">Electrician</option>
                        <option value="interiorDesigner">Interior Designer</option>
                        <option value="financialAdvisor">Financial Advisor</option>
                        <option value="marineEngineer">Marine Engineer</option>
                        <option value="buildingScience">Building Science &#38; Services</option> 
                    </select>
                       <p>Job-specific skills </p>
                       <textarea rows="4" cols="30" name="jobskills">
                       </textarea>
                       <p>Hobbies</p>
                       <textarea rows="2" cols="30" name="hobbies">
                       </textarea>
                       <p>Address</p>
                       <textarea rows="5" cols="30" name="address">
                       </textarea><br><br>
                       <input  type="submit" style="height: 40px; width: 260px;" value="SUBMIT">
                   </fieldset>
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