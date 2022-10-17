package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    Scanner scan = new Scanner(System.in);
    Contact contact = new Contact();
    void contactDetails(){
        System.out.println("Enter person details : ");
        contact.getPersonDetails();
    }
void updateContactDetails(){
    System.out.println("Enter first name to update data : ");
    String name = scan.next();

    if (name ==  contact.getFirstName() ){
       contact.getPersonDetails();
    }else {
        System.out.println("First name not found.");
    }
}
    @Override
    public String toString() {
        return "AddressBook{" +
                "contact=" + contact +
                '}';
    }

}
