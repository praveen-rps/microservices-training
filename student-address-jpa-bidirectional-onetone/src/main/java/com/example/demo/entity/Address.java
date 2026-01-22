
package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;

    private String street;
    private String zipcode;

    @OneToOne(mappedBy = "address")
    private Student student;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
