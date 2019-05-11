/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dao;

/**
 *
 * @author HP
 */
public class SignupDao {
     private int id;
    private String firstname;
    private String lastname;
    private String gender;
    private String username;
    private String phone;
    private String password;
    private String usertype;
    
     public int getId(){
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getFirstName(){
        return firstname;
    }
    public void setFirstName(String firstname)
    {
        this.firstname=firstname;
    }
    public String getLastName(){
        return lastname;
    }
        public void setLastName(String lastname)
    {
        this.lastname=lastname;
    }
    public String getGender()
        {
            return gender;
        }
    public void setGender(String gender)
        {
            this.gender=gender;
        }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
     public String getPhone() {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getUsertype(){
        return usertype;
    }
    public void setUsertype(String usertype)
    {
        this.usertype=usertype;
    }
}
