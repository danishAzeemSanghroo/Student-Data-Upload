/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.myproject;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
@MultipartConfig
public class UserServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserServlet</title>");
            out.println("</head>");
            out.println("<body>");

//            String name = request.getParameter("name");
//            Part picPart1 = request.getPart("pic1");
//            Part picPart2 = request.getPart("pic2");
////            String picPart2 = "pic2";
            String SAVE_DIR = "upload";
            String appPath = "d:\\test";
            String savePath = appPath + File.separator + SAVE_DIR;

            File fileSaveDir = new File(savePath);
            if (!fileSaveDir.exists()) {
                fileSaveDir.mkdir();
            }
            for (Part part : request.getParts()) {
                String fileName = extractFileName(part);
                fileName = new File(fileName).getName();
                part.write(savePath + File.separator + fileName);
            }
//////////////////////////////////////////////////////////////////
            String name = request.getParameter("name");
            Part stdPicPart = request.getPart("stdPic");

            String fname = request.getParameter("fatherName");
            String surname = request.getParameter("surName");
            String birthDate = request.getParameter("birthDate");
            Part birthCertiPart = request.getPart("birthCertificate");

            String birthPlace = request.getParameter("birthPlace");
            String addres = request.getParameter("address");
            String cnic = request.getParameter("cnicNo");
            Part cnicPart = request.getPart("cnicCopy");

            String sscYear = request.getParameter("matricYear");
            String sscSeat = request.getParameter("matricSeatNo");
            String sscGrade = request.getParameter("matricGrade");
            String sscBoard = request.getParameter("matricBoard");
            Part sscCertiPart = request.getPart("matricDoc");

            String hscYear = request.getParameter("interYear");
            String hscSeat = request.getParameter("interSeatNo");
            String hscGrade = request.getParameter("interGrade");
            String hscBoard = request.getParameter("interBoard");
            Part hscCertiPart = request.getPart("interDoc");

            String hecYear = request.getParameter("graduatecYear");
            String hecSeat = request.getParameter("graduateSeatNo");
            String hecGrade = request.getParameter("graduateGrade");
            String hecBoard = request.getParameter("graduateUni");
            Part hecCertiPart = request.getPart("graduateDoc");

            int id = 0;
//            List<Part> list = new ArrayList<Part>();
//            list = (List<Part>) request.getParts();

            UserDao dao = new UserDao(ConnectionProvider.getConnection());
            User bean = new User(name, fname, surname, birthDate, birthPlace, addres, cnic, sscYear, sscSeat, sscGrade, sscBoard, hscYear, hscSeat, hscGrade, hscBoard, hecYear, hecSeat, hecGrade, hecBoard, stdPicPart.getSubmittedFileName(), birthCertiPart.getSubmittedFileName(), cnicPart.getSubmittedFileName(), sscCertiPart.getSubmittedFileName(), hscCertiPart.getSubmittedFileName(), hecCertiPart.getSubmittedFileName());

            if (dao.insertUser(bean)) {
                out.println("data saved <br>");
                id = dao.getUserId(name, fname, cnic);

            } else {
                out.println("data not saved");
            }

//            String SAVE_DIR = String.valueOf(id);
            out.println("</body>");
            out.println("</html>");
        }
    }

    private static String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
