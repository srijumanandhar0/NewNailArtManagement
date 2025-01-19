/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nailart;


/**
 *
 * @author Sriju Manandhar
 */

public class NailModel {

   

       
     private String firstName;
        private String lastName;
        private String email;
        private String contactNo;
        private String location;
        private String city;
        private String landmark;
        private String department;

        public NailModel(String firstName, String lastName, String email, String contactNo, String location, String city, String landmark, String department) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.contactNo = contactNo;
            this.location = location;
            this.city = city;
            this.landmark = landmark;
            this.department = department;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getContactNo() {
            return contactNo;
        }

        public void setContactNo(String contactNo) {
            this.contactNo = contactNo;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getLandmark() {
            return landmark;
        }

        public void setLandmark(String landmark) {
            this.landmark = landmark;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", contactNo='" + contactNo + '\'' +
                    ", location='" + location + '\'' +
                    ", city='" + city + '\'' +
                    ", landmark='" + landmark + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }
    }






