package org.netzd.recyclercontact;


public class Contact {

    private int id = 0;
    private String name = null;
    private String school = null;
    private String address = null;
    private int age = 0;

    public Contact() {
    }

    public Contact(int id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    public Contact(int id, String name, String school, String address, int age) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}