/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import project.dao.SignupDao;
import project.db.DbConnection;

/**
 *
 * @author HP
 */
public class SignupOperation {
      static PreparedStatement stmt=null;
    static Connection con=null;
    static ResultSet rs=null;
     public static int Signup(SignupDao user)
    {
        int i=0;
        try
        {
            con=DbConnection.getCon();
            stmt=con.prepareStatement("insert into signup(FirstName,LastName,Gender,Username,Phone,Password,UserType) values(?,?,?,?,?,?,?)");
            stmt.setString(1,user.getFirstName());
            stmt.setString(2,user.getLastName());
            stmt.setString(3,user.getGender());
            stmt.setString(4,user.getUsername());
            stmt.setString(5,user.getPhone());
            stmt.setString(6,user.getPassword());
            stmt.setString(7,user.getUsertype());
            i=stmt.executeUpdate();
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                }
        return i;
}
       public static SignupDao login(SignupDao user)
    {
        try{
             con=DbConnection.getCon();
            stmt=con.prepareStatement("select * from signup where Username=? and Password=?");
            stmt.setString(1,user.getUsername());
            stmt.setString(2,user.getPassword());
            rs=stmt.executeQuery();
            
            if(rs.next()){
               // System.out.println(rs.getString("first_name")+" "+rs.getString("last_name"));
               user.setFirstName(rs.getString("firstname"));
               user.setLastName(rs.getString("lastname"));
               user.setUsername(rs.getString("username"));
               user.setUsertype(rs.getString("usertype"));
               return user;
            }
            else
            {
                user=null;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return user;
    }
}
