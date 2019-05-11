/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dao;

public class ResumeDao {
     private int id;
    private String firstname;
    private String lastname;
    private String gender;
    private String dob;
    private String email;
    private String phone;
    private String qualification;
    private String percentage;
    private String jobprofile;
    private String jobskills;
    private String hobbies;
    private String address;
    private String status;
    
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
    public String getDOB() {
        return dob;
    }
    public void setDOB(String dob)
    {
        this.dob=dob;
    }
     public String getEmail() {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification)
    {
        this.qualification=qualification;
    }
      public String getPercentage(){
        return percentage;
    }
    public void setPercentage(String percentage)
    {
        this.percentage=percentage;
    }
      public String getJobProfile(){
        return jobprofile;
    }
    public void setJobProfile(String jobprofile)
    {
        this.jobprofile=jobprofile;
    }
    
      public String getJobSkills(){
        return jobskills;
    }
    public void setJobSkills(String jobskills)
    {
        this.jobskills=jobskills;
    }
      public String getHobbies(){
        return hobbies;
    }
    public void setHobbies(String hobbies)
    {
        this.hobbies=hobbies;
    }
      public String getAddress(){
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
        public String getStatus(){
        return status;
    }
    public void setStatus(String status)
    {
        this.status=status;
    }
}


