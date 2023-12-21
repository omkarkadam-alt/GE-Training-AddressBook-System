package addressbook_system;

import java.util.Scanner;

class Contact {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    long phoneNumber;
    String email;

    static Scanner scannerObject = new Scanner(System.in);

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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void getDetails(){

        System.out.println("Enter First Name: ");
        setFirstName(scannerObject.next());

        System.out.println("Enter Last Name: ");
        setLastName(scannerObject.next());

        System.out.println("Enter Address: ");
        setAddress(scannerObject.next());

        System.out.println("Enter City: ");
        setCity(scannerObject.next());

        System.out.println("Enter State: ");
        setState(scannerObject.next());

        System.out.println("Enter Zip Code: ");
        setZipCode(scannerObject.nextInt());

        System.out.println("Enter Phone Number: ");
        setPhoneNumber(scannerObject.nextLong());

        System.out.println("Enter Email Id: ");
        setEmail(scannerObject.next());
    }

    public void displayContact(){

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("CONTACT INFORMATION: ");
        System.out.println();
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Address: " + this.address);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Zip Code: " + this.zipCode);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Email Id: " + this.email);
        System.out.println("----------------------------------------");
        System.out.println();
    }
}
