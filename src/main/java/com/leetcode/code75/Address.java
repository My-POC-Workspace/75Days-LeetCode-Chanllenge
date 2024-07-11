package com.leetcode.code75;

public class Address {

    int id;
    String streetName;
    String area;
    String district;
    int pinCode;

    public Address(){

    }

    public Address(int id, String streetName, String area, String district, int pinCode) {
        this.id = id;
        this.streetName = streetName;
        this.area = area;
        this.district = district;
        this.pinCode = pinCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetName='" + streetName + '\'' +
                ", area='" + area + '\'' +
                ", district='" + district + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
