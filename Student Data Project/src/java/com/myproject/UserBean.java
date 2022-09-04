/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject;

/**
 *
 * @author DELL
 */
public class UserBean {

    private String name;
    private String pic1;
    private String pic2;

    public UserBean() {
    }

    public UserBean(String name, String pic1, String pic2) {
        this.name = name;
        this.pic1 = pic1;
        this.pic2 = pic2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

}
