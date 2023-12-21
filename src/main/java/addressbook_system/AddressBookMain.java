package addressbook_system;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    static Scanner scannerObject = new Scanner(System.in);

    static final int ADD_CONTACT = 1;
    static final int EXIT = 2;

    public static ArrayList<Contact> contacts = new ArrayList<Contact>();

    static int displayChoices(){
        
        System.out.println("1.] Add a contact");
        System.out.println("2.] Exit");

        System.out.println("Enter your choice: ");
        
        int choice = 0;
        
        choice = scannerObject.nextInt();
        System.out.println();

        return choice;
    }

    static void setContactInformation(Contact newContact)
    {
            System.out.println("Enter First Name: ");
            newContact.setFirstName(scannerObject.next());
    
            System.out.println("Enter Last Name: ");
            newContact.setLastName(scannerObject.next());
    
            System.out.println("Enter Address: ");
            newContact.setAddress(scannerObject.next());
    
            System.out.println("Enter City: ");
            newContact.setCity(scannerObject.next());
    
            System.out.println("Enter State: ");
            newContact.setState(scannerObject.next());
    
            System.out.println("Enter Zip Code: ");
            newContact.setZipCode(scannerObject.nextInt());
    
            System.out.println("Enter Phone Number: ");
            newContact.setPhoneNumber(scannerObject.nextLong());
    
            System.out.println("Enter Email Id: ");
            newContact.setEmail(scannerObject.next());
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        while(true){
            
            int userChoice = displayChoices();

            switch (userChoice) {
                case ADD_CONTACT:
                    Contact newContact = new Contact();
                    setContactInformation(newContact);
                    contacts.add(newContact);

                    newContact.displayContact();

                    System.out.println("Size of AddressBook is: " + contacts.size());                    
                    System.out.println();
                    break;
                case EXIT:
                    scannerObject.close();
                    return;
            }
        }
    }
}