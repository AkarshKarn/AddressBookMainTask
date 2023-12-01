package com.BridgeLabz.AddressBookApp;

import java.util.Scanner;



public class AddressBookMainMethod {

    static boolean flow=true;
    static boolean flow1=true;

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Program");
        System.out.println();

        AddressBook1 addressBook1 = new AddressBook1();
        AddressBook2 addressBook2 = new AddressBook2();


        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Following are the various Address Book available:");

            System.out.println("\n1.AddressBook1" + "\n2.AddressBook2");

            System.out.println("Enter the input to access different Address Books:");

            int ab = sc.nextInt();

            switch (ab) {
                case 1:
                    System.out.println("Address Book 1:");

                    do {
                        System.out.println("\n1. Add Contact Details"
                                + "\n2. View Contact Details"
                                + "\n3. Update Contact Details."
                                + "\n4. Delete Contact Details."
                                + "\n5. Add Multiple Contact Details."
                                + "\n6. Search Contact Details by City or State Name");

                        System.out.println("Enter the choice:");
                        int option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Add Contacts:");
                                if (addressBook1.equals(addressBook2)){
                                    System.out.println("Duplicate Contact Found");
                                }else {
                                    addressBook1.addContact();
                                }
                                break;

                            case 2:
                                System.out.println("View Contacts:");
                                addressBook1.viewContact();

                            case 3:
                                System.out.println("Update Contacts:");
                                addressBook1.updateContacts();

                            case 4:
                                System.out.println("Delete Contacts:");
                                addressBook1.deleteContact();

                            case 5:
                                System.out.println("Add Multiple Contacts:");
                                addressBook1.addMultipleContacts();

                            case 6:
                                System.out.println("Search Contact Details by City or State Name");
                                addressBook1.searchContactDetails();
                                System.out.println("Contacts Details successfully searched.");


                        }
                    } while (flow);


                case 2:
                    System.out.println("Address Book 2");

                    do {
                        System.out.println("\n1. Add Contact Details"
                                + "\n2. View Contact Details"
                                + "\n3. Update Contact Details."
                                + "\n4. Delete Contact Details."
                                + "\n5. Add Multiple Contact Details."
                                + "\n6. Search Contact Details by City or State Name");

                        System.out.println("Enter the choice:");
                        int option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Add Contacts:");
                                if (addressBook2.equals(addressBook1)){
                                    System.out.println("Duplicate Contact Found");
                                }else {
                                    addressBook2.addContact();
                                }
                                break;

                            case 2:
                                System.out.println("View Contacts:");
                                addressBook2.viewContact();
                                System.out.println("Successfully Displayed the Contact Details.");

                            case 3:
                                System.out.println("Update Contacts:");
                                addressBook2.updateContacts();

                            case 4:
                                System.out.println("Delete Contacts:");
                                addressBook2.deleteContact();

                            case 5:
                                System.out.println("Add Multiple Contacts:");
                                addressBook2.addMultipleContacts();

                            case 6:
                                System.out.println("Search Contact Details by City or State Name");
                                addressBook2.searchContactDetails();
                                System.out.println("Contacts Details successfully searched.");

                        }
                    } while (flow);

            }

        }while (flow1);



    }

            }






