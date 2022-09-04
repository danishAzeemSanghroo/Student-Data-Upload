/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject;

/**
 *
 * @author DELL
 */
public class User {

    private int stdId;
    private String name;
    private String fname;
    private String surname;
    private String birthDate;
    private String birthPlace;
    private String address;
    private String cnic;

    private String sscYear;
    private String sscSeatNo;
    private String sscGrade;
    private String sscBoard;

    private String hscYear;
    private String hscseatNo;
    private String hscgrade;
    private String hscBoard;

    private String hecYear;
    private String hecSeatNo;
    private String hecGrade;
    private String hecUni;

    private String stdPic;
    private String birthCerti;
    private String cnicPic;
    private String sscDoc;
    private String hscDoc;
    private String hecDoc;

    public User() {
    }

    public User(String name, String fname, String surname, String birthDate, String birthPlace, String address, String cnic, String sscYear, String sscSeatNo, String sscGrade, String sscBoard, String hscYear, String hscseatNo, String hscgrade, String hscBoard, String hecYear, String hecSeatNo, String hecGrade, String hecUni, String stdPic, String birthCerti, String cnicPic, String sscDoc, String hscDoc, String hecDoc) {
        this.name = name;
        this.fname = fname;
        this.surname = surname;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.address = address;
        this.cnic = cnic;
        this.sscYear = sscYear;
        this.sscSeatNo = sscSeatNo;
        this.sscGrade = sscGrade;
        this.sscBoard = sscBoard;
        this.hscYear = hscYear;
        this.hscseatNo = hscseatNo;
        this.hscgrade = hscgrade;
        this.hscBoard = hscBoard;
        this.hecYear = hecYear;
        this.hecSeatNo = hecSeatNo;
        this.hecGrade = hecGrade;
        this.hecUni = hecUni;
        this.stdPic = stdPic;
        this.birthCerti = birthCerti;
        this.cnicPic = cnicPic;
        this.sscDoc = sscDoc;
        this.hscDoc = hscDoc;
        this.hecDoc = hecDoc;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getSscYear() {
        return sscYear;
    }

    public void setSscYear(String sscYear) {
        this.sscYear = sscYear;
    }

    public String getSscSeatNo() {
        return sscSeatNo;
    }

    public void setSscSeatNo(String sscSeatNo) {
        this.sscSeatNo = sscSeatNo;
    }

    public String getSscGrade() {
        return sscGrade;
    }

    public void setSscGrade(String sscGrade) {
        this.sscGrade = sscGrade;
    }

    public String getSscBoard() {
        return sscBoard;
    }

    public void setSscBoard(String sscBoard) {
        this.sscBoard = sscBoard;
    }

    public String getHscYear() {
        return hscYear;
    }

    public void setHscYear(String hscYear) {
        this.hscYear = hscYear;
    }

    public String getHscseatNo() {
        return hscseatNo;
    }

    public void setHscseatNo(String hscseatNo) {
        this.hscseatNo = hscseatNo;
    }

    public String getHscgrade() {
        return hscgrade;
    }

    public void setHscgrade(String hscgrade) {
        this.hscgrade = hscgrade;
    }

    public String getHscBoard() {
        return hscBoard;
    }

    public void setHscBoard(String hscBoard) {
        this.hscBoard = hscBoard;
    }

    public String getHecYear() {
        return hecYear;
    }

    public void setHecYear(String hecYear) {
        this.hecYear = hecYear;
    }

    public String getHecSeatNo() {
        return hecSeatNo;
    }

    public void setHecSeatNo(String hecSeatNo) {
        this.hecSeatNo = hecSeatNo;
    }

    public String getHecGrade() {
        return hecGrade;
    }

    public void setHecGrade(String hecGrade) {
        this.hecGrade = hecGrade;
    }

    public String getHecUni() {
        return hecUni;
    }

    public void setHecUni(String hecUni) {
        this.hecUni = hecUni;
    }

    public String getStdPic() {
        return stdPic;
    }

    public void setStdPic(String stdPic) {
        this.stdPic = stdPic;
    }

    public String getBirthCerti() {
        return birthCerti;
    }

    public void setBirthCerti(String birthCerti) {
        this.birthCerti = birthCerti;
    }

    public String getCnicPic() {
        return cnicPic;
    }

    public void setCnicPic(String cnicPic) {
        this.cnicPic = cnicPic;
    }

    public String getSscDoc() {
        return sscDoc;
    }

    public void setSscDoc(String sscDoc) {
        this.sscDoc = sscDoc;
    }

    public String getHscDoc() {
        return hscDoc;
    }

    public void setHscDoc(String hscDoc) {
        this.hscDoc = hscDoc;
    }

    public String getHecDoc() {
        return hecDoc;
    }

    public void setHecDoc(String hecDoc) {
        this.hecDoc = hecDoc;
    }

}
