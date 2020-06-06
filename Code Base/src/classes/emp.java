/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author bhavyashah
 */
public class emp {
    
    private String firstName;
    private String lastName;
    private String dateAdded;
    private String position;
    private String address;
    private String description;
    private String salary;
    private String leaves;
    private String email;
    private String phonenumber;
    
    public emp(String FirstName,String LastName,String Position,String Address,String Description,String DateAdded,String Salary,String Leaves,String Email,String PhoneNumber)
    {
        this.firstName=FirstName;
        this.lastName=LastName;
        this.position=Position;
        this.address=Address;
        this.description=Description;
        this.dateAdded=DateAdded;
        this.salary = Salary;
        this.leaves = Leaves;
        this.email = Email;
        this.phonenumber = PhoneNumber;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public String getDateAdded()
    {
        return dateAdded;
    }
    
    public String getSalary()
    {
        return salary;
    }
    
    public String getLeaves()
    {
        return leaves;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhoneNumber()
    {
        return phonenumber;
    }
}
