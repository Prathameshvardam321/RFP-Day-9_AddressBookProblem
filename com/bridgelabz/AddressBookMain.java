package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {

      ArrayList<AddressBook> bookArrayList = new ArrayList<>();
      Scanner scan = new Scanner(System.in);
      int choice;
        do {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("0 to EXIT Program !!!.");
            System.out.println("-----------");
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
                default:
                    if (choice!=0)
                    System.out.println("Enter valid inputs.");
            }

        }while (choice!=0);

    }
}
