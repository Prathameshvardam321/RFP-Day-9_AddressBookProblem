package com.bridgelabz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Predicate;
public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();
    HashMap<String,Contact> contactHashMap = new HashMap<>();
    private ArrayList<Contact> contacts = new ArrayList<>();
    public void addContact() {
        int found = 0;
        Contact contact = new Contact();
        System.out.println("Enter the First Name : ");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name : ");
        contact.setLastName(sc.next());
        System.out.println("Enter the City : ");
        contact.setCity(sc.next());
        System.out.println("Enter the State : ");
        contact.setState(sc.next());
        System.out.println("Enter the Email Id : ");
        contact.setEmail(sc.next());
        System.out.println("Enter zipcode : ");
        contact.setZipCode(sc.nextInt());
        System.out.println("Enter phone number : ");
        contact.setPhoneNumber(sc.nextInt());
        System.out.println("Enter email : ");
        contact.setEmail(sc.next());
        for (Contact contact1 : contacts) {
            if (contact1.equals(contact)) {
                System.out.println("Person already exists.");
                found = 1;
                break;
            }
        }
        if (found == 0) {
            contacts.add(contact);
        }
    }
    public void  displayContact() {
        for (Contact contact:contacts){
            System.out.println(contact);
        }
    }

    public void searchNameByState(){
        System.out.println("Enter name of state : ");
        String stateName = sc.next();
        contacts.stream().filter(c->c.getCity()==stateName).forEach(x-> System.out.println(x));
    }
    public void editContact(){
        System.out.println("Enter person name : ");
        String name = sc.next();
        for(Contact contact : contacts){
            if(contact.getFirstName().equals(name) || contact.getLastName().equals(name)){
                System.out.println("What you want to edit : \n" +
                        "1.first name \t" +
                        "2.last name \t" +
                        "3.city \t" +
                        "4.state \t" +
                        "5.email");
                int ch = sc.nextInt();
                switch (ch){
                    case 1:
                        System.out.println("Enter first name :");
                        contact.setFirstName(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 2:
                        System.out.println("Enter last name :");
                        contact.setLastName(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 3:
                        System.out.println("Enter city :");
                        contact.setCity(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 4:
                        System.out.println("Enter state :");
                        contact.setState(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    case 5:
                        System.out.println("Enter email :");
                        contact.setEmail(sc.next());
                        System.out.println("Contact updated!");
                        break;
                    default:
                        System.out.println("Invalid input.");
                }
                return;
            }
        }
        System.out.println(name + " not found!");

    }

    public void deleteContact(){
        System.out.println("Enter person name : ");
        String name = sc.next();
        for(Contact contact : contacts){
            if(contact.getFirstName().equals(name) || contact.getLastName().equals(name)){
                contacts.remove(contact);
                System.out.println("Contact Deleted Successfully...!");
                return;
            }
        }
        System.out.println(name + " not found!");
    }

    public void viewPersonByCity(String cityName) {
        for (Contact c : contacts){
            if (c.getState().equals(cityName)){
                contactHashMap.put(cityName,c);
            }
        }
        Predicate<Contact> contactPredicate = t -> t.getCity().equals(cityName);
        contacts.stream().filter(contactPredicate).forEach(x -> System.out.println(x));
        System.out.println(contactHashMap.keySet());;

    }
    public void viewPersonByState(String stateName){
        Predicate<Contact> contactPredicate = c->c.getState().equals(stateName);
        contacts.stream().filter(contactPredicate).forEach(x->contactHashMap.put(stateName,x));
        contacts.stream().filter(contactPredicate).forEach(x-> System.out.println(x));
       for (Contact c : contacts){
           if (c.getState().equals(stateName)){
              contactHashMap.put(stateName,c);
           }
       }
        System.out.println(contactHashMap.keySet());;


    }
    void printHashMap(){
        System.out.println(contactHashMap.keySet());;
    }

}
