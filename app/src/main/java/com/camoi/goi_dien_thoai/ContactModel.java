package com.camoi.goi_dien_thoai;

public class ContactModel {

    private int id;
    private String name;
    private String phone;

    public ContactModel(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public ContactModel() {

    }

    @Override
    public String toString() {
        return "ContactModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

