package com.bridgelabz;

import java.util.HashMap;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();
        int ch;
       do {
            System.out.println("1.Add AddressBook \t2.Display AddressBook \t3.Edit AddressBook \t4.Delete AddressBook \t5.Add contact \t6.Display contact\t7.Delete contact \t8.Update contact");
            System.out.println("Enter your choice : " );
            ch = scanner.nextInt();
           switch (ch){
               case 1:
                   System.out.println("Enter address book name to add : ");
                   String name = scanner.next();
                   AddressBook addressBook = new AddressBook();
                   if (addressBookHashMap.containsKey(name)){
                       System.out.println("AddressBook already exists.");
                   }else {
                       addressBookHashMap.put(name,addressBook);
                   }
                   break;
               case 2:
                   System.out.println(addressBookHashMap.keySet());
                   break;
               case 3:
                   System.out.println("Enter addressBook want to edit : ");
                   String nameSearch = scanner.next();
                   if (addressBookHashMap.containsKey(nameSearch)){
                       System.out.println("Enter name you want to set : ");
                       String setName = scanner.next();
                      AddressBook addressBook1 = addressBookHashMap.get(nameSearch);
                      addressBookHashMap.remove(nameSearch);
                       addressBookHashMap.put(setName,addressBook1);
                   }else {
                       System.out.println("AddressBook does not exists.");
                   }
                   break;
               case 4:
                   System.out.println("Enter addressBook name to delete : ");
                   String deleteName = scanner.next();
                   if (addressBookHashMap.containsKey(deleteName)){
                       addressBookHashMap.remove(deleteName);
                   }
                   break;
               case 5:
                   System.out.println("Enter addressBook name to add contact : ");
                   String searchName1 = scanner.next();
                   if (addressBookHashMap.containsKey(searchName1)){
                      AddressBook addressBook1 = addressBookHashMap.get(searchName1);
                      addressBook1.addContact();
                   }else {
                       System.out.println("AddressBook not exists.");
                   }
                   break;
               case 6: System.out.println("Enter addressBook name to display contact : ");
                   String searchName2 = scanner.next();
                   if (addressBookHashMap.containsKey(searchName2)) {
                       AddressBook addressBook1 = addressBookHashMap.get(searchName2);
                       addressBook1.displayContact();
                   }else {
                       System.out.println("AddressBook not exists.");
                   }
                   break;
               case 7:System.out.println("Enter addressBook name to delete contact : ");
                   String searchName3 = scanner.next();
                   if (addressBookHashMap.containsKey(searchName3)) {
                       AddressBook addressBook1 = addressBookHashMap.get(searchName3);
                       addressBook1.deleteContact();
                   }else {
                       System.out.println("AddressBook not exists.");
                   }
                   break;
               case 8:System.out.println("Enter addressBook name to delete contact : ");
                   String searchName4 = scanner.next();
                   if (addressBookHashMap.containsKey(searchName4)) {
                       AddressBook addressBook1 = addressBookHashMap.get(searchName4);
                       addressBook1.editContact();
                   }else {
                       System.out.println("AddressBook not exists.");
                   }
                   break;
               default:
                   System.out.println("Enter valid inputs!!!");
           }
        }while (ch!=0);

    }
}
