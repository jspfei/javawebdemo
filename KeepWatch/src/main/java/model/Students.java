package model;

import java.io.Serializable;

/**
 * Created by admin on 2017/5/5.
 */
public class Students implements Serializable{
    private int id;
    private String name;
    private int age;
    private int sex;
    private int moblie;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getMoblie() {
        return moblie;
    }

    public void setMoblie(int moblie) {
        this.moblie = moblie;
    }
}
