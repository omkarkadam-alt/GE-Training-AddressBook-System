package addressbook_system;

import java.util.Scanner;

public class AddressBookMain {

    static Scanner scannerObject = new Scanner(System.in);

    static final int ADD_CONTACT = 1;
    static final int EXIT = 2;

    static int displayChoices(){
        
        System.out.println("1.] Add a contact");
        System.out.println("2.] Exit");

        System.out.println("Enter your choice: ");
        
        int choice = 0;
        
        choice = scannerObject.nextInt();
        System.out.println();

        return choice;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        while(true){
            
            int userChoice = displayChoices();

            switch (userChoice) {
                case ADD_CONTACT:
                    Contact newContact = new Contact();
                    newContact.getDetails();
                    newContact.displayContact();
                    break;
                case EXIT:
                    scannerObject.close();
                    return;
            }
        }
    }
}