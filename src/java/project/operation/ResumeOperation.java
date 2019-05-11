
package project.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import project.dao.ResumeDao;
import project.db.DbConnection;

public class ResumeOperation {
           static PreparedStatement stmt=null;
    static Connection con=null;
    static ResultSet rs=null;
    
     public static int AddResume(ResumeDao user) {
        int i=0;
        try
        {
            con=DbConnection.getCon();
            stmt=con.prepareStatement("insert into resume(FirstName,LastName,Gender,DOB,Email,Phone,Qualification,Percentage,JobProfile,JobSkills,Hobbies,Address) values(?,?,?,?,?,?,?,?,?,?,?,?)");
          
            stmt.setString(1,user.getFirstName());
            stmt.setString(2,user.getLastName());
            stmt.setString(3,user.getGender());
            stmt.setString(4,user.getDOB());
            stmt.setString(5,user.getEmail());
            stmt.setString(6,user.getPhone());
            stmt.setString(7,user.getQualification());
            stmt.setString(8,user.getPercentage());
            stmt.setString(9,user.getJobProfile());
            stmt.setString(10,user.getJobSkills());
            stmt.setString(11,user.getHobbies());
            stmt.setString(12,user.getAddress());
           i=stmt.executeUpdate();
        }
         catch(Exception e)
                {
                    e.printStackTrace();
                }
        return i;
    }
    
     public ResultSet showAllResume()
     {
        try{
             con=DbConnection.getCon();
            stmt=con.prepareStatement("select * from resume");
            
            rs=stmt.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
     public static int UpdateResume(int id,String status)
        {
            int i=0;
            try{
                con=DbConnection.getCon();
                stmt=con.prepareStatement("update resume set status=? where id=?");
                stmt.setString(1,status);
                stmt.setInt(2,id);
                i=stmt.executeUpdate();
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return i;
        }
}
