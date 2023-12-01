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


    public void updateContacts() {
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Name:");

        String firstName = sc.nextLine();


        for (Contact contacts1 : cc) {
            if (contacts1.getFirstName().equals(contacts1.firstName)) {
                System.out.println("Enter the new First Name:");
                String firstName1 = sc.nextLine();

                System.out.println("Enter the new Last Name:");
                String lastName = sc.nextLine();

                System.out.println("Enter the new Address:");
                String address = sc.nextLine();

                System.out.println("Enter the new City Name:");
                String city = sc.nextLine();

                System.out.println("Enter the new State:");
                String state = sc.nextLine();

                System.out.println("Enter the new zipcode:");
                int zipcode = sc.nextInt();

                System.out.println("Enter the new Phone Number:");
                long phoneNo = sc.nextLong();

                System.out.println("Enter the new email:");
                String email = sc.nextLine();

                contacts1.setFirstName(firstName1);
                contacts1.setLastName(lastName);
                contacts1.setAddress(address);
                contacts1.setCity(city);
                contacts1.setState(state);
                contacts1.setZipcode(zipcode);
                contacts1.setPhoneNo(phoneNo);
                contacts1.setEmail(email);

                System.out.println(contacts1);
                System.out.println("Contacts updated");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact details is not present in the directory");
        } else {
            System.out.println("Contacts details updated  successfully");
        }
    }


    static boolean flow=true;
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Welcome to the Address Book Program"
                    + "\n1. Add Contact Details"
                    + "\n2. Update Contact Details.");

            System.out.println("Enter the choice:");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Add Contacts:");
                    addressBook.addContact();
                    break;

                case 2:
                    System.out.println("Update Contacts");
                    addressBook.updateContacts();


            }
        }while (flow) ;
    }
}

