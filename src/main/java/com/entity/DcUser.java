package com.entity;

import java.util.Date;

public class DcUser {
    public int id;
    public String name;
    public Date birthday;

    @Override
    public String toString() {
        return "MyUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
