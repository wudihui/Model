package com.fanchen.pojo;

/**
 * Created by Administrator on 2017/8/29.
 */
public class Teacher {
    private int id;
    private String name;
    private String photo;

    public int getId() {
        return id;
    }
    public String getPhoto() {
        return photo;
    }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
