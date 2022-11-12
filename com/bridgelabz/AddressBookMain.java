package com.bridgelabz;
import java.util.HashMap;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, AddressBook> addressBookHashMap = new HashMap<>();
        HashMap<String,Contact> contactHashMap = new HashMap<>();
        AddressBook addressBook = new AddressBook();
        int ch;
        do {
            System.out.println("1.Add AddressBook\t2.Display all addressBooks\t3.Search by city 4\t4.Search by state\t5.Add contact in AddressBook ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter address book name to add : ");
                    String name = scanner.next();
                    if (addressBookHashMap.containsKey(name)) {
                        System.out.println("AddressBook already exists.");
                    } else {
                        addressBookHashMap.put(name, addressBook);
                    }
                    break;
                case 2:
                    System.out.println(addressBookHashMap.keySet());
                    break;
                case 3:
                    System.out.println("Enter AddressBook name : ");
                    String addBookName = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName)){
                        System.out.println("Enter city name : ");
                        String cityName = scanner.next();
                        addressBook = addressBookHashMap.get(addBookName);
                        addressBook.viewPersonByCity(cityName);
                    }else {
                        System.out.println("AddressBook not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter AddressBook name : ");
                    String addBookName1 = scanner.next();
                    if (addressBookHashMap.containsKey(addBookName1)){
                        System.out.println("Enter state name : ");
                        String stateName = scanner.next();
                        addressBook = addressBookHashMap.get(addBookName1);
                        addressBook.viewPersonByCity(stateName);
                    }else {
                        System.out.println("AddressBook not found.");
                    }
                case 5:
                    System.out.println("Enter addressBook name to add contact : ");
                   String searchName1 = scanner.next();
                   if (addressBookHashMap.containsKey(searchName1)){
                  addressBook = addressBookHashMap.get(searchName1);
                  addressBook.addContact();
                    }
                   else {
                   System.out.println("AddressBook not exists.");
                     }
                   break;
            }
            }while (ch != 0) ;
    }
}
