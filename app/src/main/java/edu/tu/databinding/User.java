package edu.tu.databinding;

public class User {

    private String name;
    private String age;
    private String address;

    public User(){ }

    public User(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Getter and setter for User Object
    public String getName() {
        return name;
    }



    public String getAge() {
        return age;
    }


    public String getAddress() {
        return address;
    }


}
