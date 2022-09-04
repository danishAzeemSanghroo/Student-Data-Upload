/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class UserDao {

    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }

    public boolean insertUser(User bean) {
        boolean f = false;
        try {
            String q = "insert into student(name, fname, surname, birth_date, birth_place, address, cnic, ssc_year, ssc_seatno, ssc_grade, ssc_board, hsc_year, hsc_seatno, hsc_grade, hsc_board, hec_year, hec_seatno, hec_grade, hec_uni, std_pic, birth_certi, cnic_pic, ssc_doc, hsc_doc, hec_doc)values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(q);

            pst.setString(1, bean.getName());
            pst.setString(2, bean.getFname());
            pst.setString(3, bean.getSurname());
            pst.setString(4, bean.getBirthDate());
            pst.setString(5, bean.getBirthPlace());
            pst.setString(6, bean.getAddress());
            pst.setString(7, bean.getCnic());

            pst.setString(8, bean.getSscYear());
            pst.setString(9, bean.getSscSeatNo());
            pst.setString(10, bean.getSscGrade());
            pst.setString(11, bean.getSscBoard());

            pst.setString(12, bean.getHscYear());
            pst.setString(13, bean.getHscseatNo());
            pst.setString(14, bean.getHscgrade());
            pst.setString(15, bean.getHscBoard());

            pst.setString(16, bean.getHecYear());
            pst.setString(17, bean.getHecSeatNo());
            pst.setString(18, bean.getHecGrade());
            pst.setString(19, bean.getHecUni());

            pst.setString(20, bean.getStdPic());
            pst.setString(21, bean.getBirthCerti());
            pst.setString(22, bean.getCnicPic());
            pst.setString(23, bean.getSscDoc());
            pst.setString(24, bean.getHscDoc());
            pst.setString(25, bean.getHecDoc());
            pst.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public int getUserId(String name, String fname, String cnic) {
        int userId = 0;
        try {
            String q = "select std_id from student where name = ? and fname = ? and cnic = ? ";
            PreparedStatement pst = con.prepareStatement(q);
            pst.setString(1, name);
            pst.setString(2, fname);
            pst.setString(3, cnic);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                userId = rs.getInt("std_id");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return userId;
    }

//    public boolean insertUser(UserBean bean) {
//        boolean f = false;
//        try {
//            String q = "insert into user(name,pic1,pic2)values(?,?,?)";
//            PreparedStatement pst = con.prepareStatement(q);
//
//            pst.setString(1, bean.getName());
//            pst.setString(2, bean.getPic1());
//            pst.setString(3, bean.getPic2());
//            pst.executeUpdate();
//            f = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return f;
//    }
}
