package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.dao.SignupDao;
import java.sql.ResultSet;
import com.mysql.cj.protocol.Resultset;
import project.dao.ResumeDao;

public final class viewresume_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
SignupDao user=(SignupDao)session.getAttribute("user");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("     ");
      project.operation.ResumeOperation c1 = null;
      synchronized (_jspx_page_context) {
        c1 = (project.operation.ResumeOperation) _jspx_page_context.getAttribute("c1", PageContext.PAGE_SCOPE);
        if (c1 == null){
          c1 = new project.operation.ResumeOperation();
          _jspx_page_context.setAttribute("c1", c1, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       <div class=\"header\">\n");
      out.write("             \n");
      out.write("             <img src=\"icon.png\">\n");
      out.write("             <p> Recruitment</p>\n");
      out.write("             <nav style=\"float:right;margin-right: 20px;margin-top: 50px;\">\n");
      out.write("                 \n");
      out.write("                   <form action=\"index.html\" method=\"post\">\n");
      out.write("                       <input type=\"submit\" value=\"Logout\" style=\"font-size: 20px;color:white;background-color:darkviolet;border:none;padding: 10px;\">\n");
      out.write("                    </form>\n");
      out.write("             </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("           <div class=\"navigation\"><br><br>\n");
      out.write("               <nav>\n");
      out.write("                   <a href=\"index.html\">Home</a>\n");
      out.write("                   <a href=\"admindashboard.jsp\">Profile</a>\n");
      out.write("                   <a href=\"help.html\">Help &amp Support</a>\n");
      out.write("                   <button style=\"float: right;margin-right: 60px;font-family:monospace;background-color:darkgoldenrod;color: whitesmoke;border:none;font-size: 30px;margin-top: -20px;border-radius: 10px;\">");
      out.print(user.getFirstName()+" "+user.getLastName());
      out.write("</button>\n");
      out.write("               </nav>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           <div class=\"middle\">\n");
      out.write("            <p style=\"font-size: 25px;color:white;background-color: darkgoldenrod;text-align: center\">All Resumes</p>\n");
      out.write("              <center>\n");
      out.write("                  ");
 ResultSet rs=c1.showAllResume();
                  while (rs.next())
                  {
                      
      out.write("\n");
      out.write("                  \n");
      out.write("              <table id=\"ltb1\" border=\"1px solid black\">\n");
      out.write("                  \n");
      out.write("                    <tr>\n");
      out.write("                        <th style=\"height:20px;width:100px;\">FirstName</th>\n");
      out.write("                        <th>LastName</th> \n");
      out.write("                        <th>Gender</th>\n");
      out.write("                        <th>DOB</th>\n");
      out.write("                        <th>Email</th> \n");
      out.write("                        <th>Phone</th>\n");
      out.write("                        <th>Qualification</th>\n");
      out.write("                        <th>Percentage</th>\n");
      out.write("                        <th>JobProfile</th>\n");
      out.write("                        <th>JobSkills</th>\n");
      out.write("                        <th>Hobbies</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>Status</th>\n");
      out.write("                    </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td>");
      out.print(rs.getString("firstname"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("lastname"));
      out.write("</td> \n");
      out.write("                        <td>");
      out.print(rs.getString("gender"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("dob"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("email"));
      out.write("</td> \n");
      out.write("                        <td>");
      out.print(rs.getString("phone"));
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(rs.getString("qualification"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("percentage"));
      out.write("</td>\n");
      out.write("                           <td>");
      out.print(rs.getString("jobprofile"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("jobskills"));
      out.write("</td>\n");
      out.write("                             <td>");
      out.print(rs.getString("hobbies"));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print(rs.getString("address"));
      out.write("</td>\n");
      out.write("                               <td>");
      out.print(rs.getString("status"));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                  <!--<tr>\n");
      out.write("                        <td>Blog</td>\n");
      out.write("                        <td>Reset Password</td> \n");
      out.write("                        <td>Post Jobs</td>\n");
      out.write("                        <td>Work at </td>\n");
      out.write("                        <td>Instagram</td> \n");
      out.write("                        <td>Privacy Policy</td>\n");
      out.write("                    </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td>Career Insights</td>\n");
      out.write("                        <td>Customer Support</td> \n");
      out.write("                        <td>Recruiting Solutions</td>\n");
      out.write("                        <td>CareerBuilder</td>\n");
      out.write("                        <td>Youtube</td> \n");
      out.write("                        <td>Terms</td>\n");
      out.write("                    </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td>Talent Networks</td>\n");
      out.write("                        <td></td> \n");
      out.write("                        <td>Screening</td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td>Facebook</td> \n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td>Sitemap</td>\n");
      out.write("                        <td></td> \n");
      out.write("                        <td>HCM</td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td>LinkedIn</td> \n");
      out.write("                        <td>Ad Choices</td>\n");
      out.write("                    </tr>\n");
      out.write("                -->\n");
      out.write("                </table>\n");
      out.write("              ");
}
      out.write("\n");
      out.write("                </center> \n");
      out.write("           </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <center>\n");
      out.write("              <table id=\"ltb1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Job Seekers</th>\n");
      out.write("                        <th>Help Center</th> \n");
      out.write("                        <th>Employers</th>\n");
      out.write("                        <th>CareerBuilder</th>\n");
      out.write("                        <th>Stay Connected</th> \n");
      out.write("                        <th>Legal</th>\n");
      out.write("                    </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td>International Jobs</td>\n");
      out.write("                        <td>Manage Email</td> \n");
      out.write("                        <td>Browse Products</td>\n");
      out.write("                        <td>About Us</td>\n");
      out.write("                        <td>Twitter</td> \n");
      out.write("                        <td>Security and Fraud</td>\n");
      out.write("                    </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td>Blog</td>\n");
      out.write("                        <td>Reset Password</td> \n");
      out.write("                        <td>Post Jobs</td>\n");
      out.write("                        <td>Work at </td>\n");
      out.write("                        <td>Instagram</td> \n");
      out.write("                        <td>Privacy Policy</td>\n");
      out.write("                    </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td>Career Insights</td>\n");
      out.write("                        <td>Customer Support</td> \n");
      out.write("                        <td>Recruiting Solutions</td>\n");
      out.write("                        <td>CareerBuilder</td>\n");
      out.write("                        <td>Youtube</td> \n");
      out.write("                        <td>Terms</td>\n");
      out.write("                    </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td>Talent Networks</td>\n");
      out.write("                        <td></td> \n");
      out.write("                        <td>Screening</td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td>Facebook</td> \n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td>Sitemap</td>\n");
      out.write("                        <td></td> \n");
      out.write("                        <td>HCM</td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td>LinkedIn</td> \n");
      out.write("                        <td>Ad Choices</td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                </table>\n");
      out.write("                </center>\n");
      out.write("            \n");
      out.write("            <p style=\"color:whitesmoke;height: 50px;width: 1000px;margin-left: 200px;font-size: 18px;\">Find average salaries, top paying locations and day-to-day responsibilities for hundreds of our most popular jobs. Search through the industries below to find job titles that closely match your field of interest.</p>\n");
      out.write("                        \n");
      out.write("                   \n");
      out.write("                \n");
      out.write("                \n");
      out.write("               <a href=\"https://www.facebook.com/HelloiamManish/\" style=\"position: fixed; top:650px;left:1200px;\"><img src=\"fb.png\"></a>\n");
      out.write("                <a href=\"http://www.twitter.com\" style=\"position: fixed; top:652px;left:1260px;\"><img src=\"twr.png\"></a>\n");
      out.write("               <a href=\"http://www.linkedin.com\" style=\"position: fixed; top:650px;left:1320px;\"><img src=\"lkd.png\"></a>\n");
      out.write("               <p id=\"lastp\" style=\"background-color: white; color:darkblue;text-shadow: 1px 1px black; font-size: 30px;margin-left: 900px;\">Follow Us</p>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
