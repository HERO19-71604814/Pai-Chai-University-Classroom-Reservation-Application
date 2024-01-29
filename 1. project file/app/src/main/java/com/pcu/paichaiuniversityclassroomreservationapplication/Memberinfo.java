package com.pcu.paichaiuniversityclassroomreservationapplication;


public class Memberinfo {
    //이름,전화번호,생년월일,주소
    private String name;
    private String phoneNumber;
    private String birthDay;
    private String address;

    public Memberinfo(String name, String phoneNumber, String birthDay, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.address = address;
    }

    //이름
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //전화번호
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //생년월일
    public String getBirthDay() {
        return this.birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    //주소
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
