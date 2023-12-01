package com.BridgeLabz.AddressBookApp;

import java.util.HashSet;
import java.util.Scanner;

public class AddressBook {

    HashSet<Contact> cc = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    void addContact() {
        System.out.println("Add Details:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        System.out.println("Enter City:");
        String city = scanner.nextLine();

        System.out.println("Enter State:");
        String state = scanner.nextLine();

        System.out.println("Enter Zipcode:");
        int zipcode = sc.nextInt();

        System.out.println("Enter Phone Number:");
        long phoneNo = sc.nextLong();

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        Contact contacts1 = new Contact(firstName, lastName, address, city, state, zipcode, phoneNo, email);
        cc.add(contacts1);
        System.out.println("Contacts added successfully........" + cc);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program:");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        addressBook.addContact();


    }
}
