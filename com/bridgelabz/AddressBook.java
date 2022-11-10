package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);

    private ArrayList<Contact> contacts = new ArrayList<>();
    public void addContact() {
        AddressBook addressBook = new AddressBook();
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
        contacts.add(contact);
    }
    public void  displayContact() {
        for (Contact contact:contacts){
            System.out.println(contact);
        }
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
}
//  while (true){
//          System.out.println("0.Exit \n1.Add Contact \n2.Display Contact \n3.Edit Contact \n4.Delete Contact \n5.Add new Address Book" +
//          "\n6.Display available address books");
//          System.out.println("Enter your choice : " );
//          int ch = sc.nextInt();
//          switch (ch){
//          case 0:
//          System.exit(0);
//          break;
//          case 1:
//          System.out.println("Enter the address book name to add contact in that address book : ");
//          String addressBookName = sc.next();
//          if (!addressBookHashMap.containsKey(addressBookName)){
//          System.out.println("Address book not exists!");
//
//
//          }else {
//          System.out.println("Address book already exists.");
//          AddressBook addressBook = addressBookHashMap.get(addressBookName);
//          addressBook.addContact();
//          }
//          break;
//          case 2:
//          System.out.println("Enter the address book name to display contacts in that address book : ");
//          String addressBookName1 = sc.next();
//          if (!addressBookHashMap.containsKey(addressBookName1)){
//          System.out.println("Address book not exists!");
//          }else {
//          AddressBook addressBook = addressBookHashMap.get(addressBookName1);
//          addressBook.displayContact();
//          }
//          break;
//          case 3:
//          System.out.println("Enter the address book name to edit contacts in that address book : ");
//          String addressBookName2 = sc.next();
//          if (!addressBookHashMap.containsKey(addressBookName2)){
//          System.out.println("Address book not exists!");
//          }else {
//          AddressBook addressBook = addressBookHashMap.get(addressBookName2);
//          addressBook.editContact();
//          }
//          break;
//          case 4:
//          System.out.println("Enter the address book name to edit contacts in that address book : ");
//          String addressBookName3 = sc.next();
//          if (!addressBookHashMap.containsKey(addressBookName3)){
//          System.out.println("Address book not exists!");
//          }else {
//          AddressBook addressBook = addressBookHashMap.get(addressBookName3);
//          addressBook.deleteContact();
//          }
//          break;
//          case 5:
//          System.out.println("Enter the address book name : ");
//          String name = sc.next();
//          if (addressBookHashMap.containsKey(name)){
//          System.out.println("Address book already exists!");
//          }else {
//          AddressBook addressBook = new AddressBook();
//          addressBookHashMap.put(name, addressBook);
//          }
//          break;
//          case 6:
//          if (addressBookHashMap.isEmpty()){
//          System.out.println("There are no address books available.");
//          }else {
//          System.out.println(addressBookHashMap.keySet());
//          }
//          break;
//
//default:
//        System.out.println("Invalid Input");
//        }