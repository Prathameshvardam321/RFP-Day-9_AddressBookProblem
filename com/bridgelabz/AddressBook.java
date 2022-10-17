package com.bridgelabz;

public class AddressBook {
    Contact contact = new Contact();
    void contactDetails(){
        contact.getPersonDetails();
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contact=" + contact +
                '}';
    }
}
