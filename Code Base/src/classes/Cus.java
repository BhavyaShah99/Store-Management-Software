package classes;

/**
 *
 * @author bhavyashah
 */
public class Cus {
    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String ordered;
    private String registeredProgram;
    private String email;
    private String phonenumber;
    
    public Cus(String FirstName, String LastName, String AddressLine1,String AddressLine2, String Ordered, String RegisteredProgram,String Email,String PhoneNumber )
    {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.addressLine1 = AddressLine1;
        this.addressLine2 = AddressLine2;
        this.ordered = Ordered;
        this.registeredProgram = RegisteredProgram;
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
    
    public String getAddressLine1()
    {
        return addressLine1;
    }
    
    public String getAddressLine2()
    {
        return addressLine2;
    }
    
    public String getOrdered()
    {
        return ordered;
    }
    public String getRegisteredProgram()
    {
        return registeredProgram;
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
