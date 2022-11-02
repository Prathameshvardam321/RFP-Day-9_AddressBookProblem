package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();
        while (true){
            System.out.println("0.Exit \n1.Add Contact \n2.Display Contact \n3.Edit Contact \n4.Delete Contact \n5.Add new Address Book" +
                    "\n6.Display available address books");
            System.out.println("Enter your choice : " );
            int ch = sc.nextInt();
            switch (ch){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter the address book name to add contact in that address book : ");
                    String addressBookName = sc.next();
                    if (!addressBookHashMap.containsKey(addressBookName)){
                        System.out.println("Address book not exists!");


                    }else {
                        System.out.println("Address book already exists.");
                        AddressBook addressBook = addressBookHashMap.get(addressBookName);
                        addressBook.addContact();
                    }
                    break;
                case 2:
                    System.out.println("Enter the address book name to display contacts in that address book : ");
                    String addressBookName1 = sc.next();
                    if (!addressBookHashMap.containsKey(addressBookName1)){
                        System.out.println("Address book not exists!");
                    }else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName1);
                        addressBook.displayContact();
                    }
                    break;
                case 3:
                    System.out.println("Enter the address book name to edit contacts in that address book : ");
                    String addressBookName2 = sc.next();
                    if (!addressBookHashMap.containsKey(addressBookName2)){
                        System.out.println("Address book not exists!");
                    }else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName2);
                        addressBook.editContact();
                    }
                    break;
                case 4:
                    System.out.println("Enter the address book name to edit contacts in that address book : ");
                    String addressBookName3 = sc.next();
                    if (!addressBookHashMap.containsKey(addressBookName3)){
                        System.out.println("Address book not exists!");
                    }else {
                        AddressBook addressBook = addressBookHashMap.get(addressBookName3);
                        addressBook.deleteContact();
                    }
                    break;
                case 5:
                    System.out.println("Enter the address book name : ");
                    String name = sc.next();
                    if (addressBookHashMap.containsKey(name)){
                        System.out.println("Address book already exists!");
                    }else {
                        AddressBook addressBook = new AddressBook();
                        addressBookHashMap.put(name, addressBook);
                    }
                    break;
                case 6:
                    if (addressBookHashMap.isEmpty()){
                        System.out.println("There are no addressbooks available.");
                    }else {
                        System.out.println(addressBookHashMap.keySet());
                    }
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }

    }
}