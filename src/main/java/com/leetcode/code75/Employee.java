package com.leetcode.code75;

import java.util.List;

public class Employee {

    private Integer id;

    List<Address> addresses;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", addresses=" + addresses +
                '}';
    }

    public Employee(){

    }

    public Employee(Integer id, List<Address> addresses) {
        this.id = id;
        this.addresses = addresses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
