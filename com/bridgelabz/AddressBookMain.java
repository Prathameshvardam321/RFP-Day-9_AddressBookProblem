package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        ArrayList<AddressBook> bookArrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
      int choice;
        do {
            System.out.println("1.Add \t2.Display \t 3.Update \nPress 0 to EXIT Program !!!.");
            System.out.println("Enter your choice : ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                  AddressBook addressBook = new AddressBook();
                  addressBook.contactDetails();
                  bookArrayList.add(addressBook);
                  break;
                case 2:
                    System.out.println(bookArrayList);
                    break;
                case 3:
                    System.out.println("Enter first name : ");
                    ListIterator<AddressBook> iterator = bookArrayList.listIterator();
                    String name = scan.next();
                    while (iterator.hasNext()){
                         addressBook = iterator.next();
                        if (name.equals(addressBook.contact.getFirstName())){
                            addressBook.contactDetails();
                            iterator.set(addressBook);
                        }else {
                            System.out.println("Enter data not found.");
                        }
                    }
                    break;
                default:
                    if (choice!=0)
                    System.out.println("Enter valid inputs.");
            }
        }while (choice!=0);

    }
}
