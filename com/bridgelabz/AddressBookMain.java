package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();
        int ch;
       do {
            System.out.println("1.Add AddressBook \t2.Display AddressBook \t3.Edit AddressBook \t4.Delete AddressBook ");
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
                   System.out.println("Enter element to delete : ");
                   String deleteName = scanner.next();
                   if (addressBookHashMap.containsKey(deleteName)){
                       addressBookHashMap.remove(deleteName);
                   }
           }
        }while (ch!=0);

    }
}
