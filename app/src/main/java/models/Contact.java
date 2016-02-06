package models;

import java.io.Serializable;

/**
 * Created by thiagoorniz on 16-02-06.
 */
public class Contact implements Serializable {

    private String name;
    private String lastName;
    private int age;
    private String tel;


    public Contact(){

    }

    public Contact(String name, String lastName, int age, String tel){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.tel = tel;

    }
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
