/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;



/**
 *
 * @author Sandali
 */
public class User {
       private int userId;
       private String firstName;
       private String lastName;
       private String password;
       private String gradeId;
       private String email;
       private String userType;

    public User(){
        userId=00;
        firstName="Not available";
        lastName="Not available";
        password="Not available";
        gradeId="Not available";
        email="Not available";
        userType="Not available";
                  
    }
    
    public User(int userId,String firstName,String lastName,String password,String gradeId,String email,String userType){
        this.userId=userId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.password=password;
        this.gradeId=gradeId;
        this.email=email;
        this.userType=userType;
                  
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    
   
}
