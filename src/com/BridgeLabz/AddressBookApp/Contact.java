package com.BridgeLabz.AddressBookApp;

public class Contact {
        String firstName;
        String lastName;
        String address;
        String city;
        String state;
        int zipcode;
        long phoneNo;
        String email;

        Contact(String firstName,String lastName,String address,String city,String state,int zipcode,long phoneNo,String email){
            this.firstName=firstName;
            this.lastName=lastName;
            this.address=address;
            this.city=city;
            this.state=state;
            this.zipcode=zipcode;
            this.phoneNo=phoneNo;
            this.email=email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getZipcode() {
            return zipcode;
        }

        public void setZipcode(int zipcode) {
            this.zipcode = zipcode;
        }

        public long getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(long phoneNo) {
            this.phoneNo = phoneNo;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "com.BridgeLabz.AddressBook.Contacts{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", zipcode=" + zipcode +
                    ", phoneNo=" + phoneNo +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

