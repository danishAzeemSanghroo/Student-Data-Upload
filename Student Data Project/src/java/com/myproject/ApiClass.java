/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.FileNameMap;
import javax.servlet.http.Part;

/**
 *
 * @author DELL
 */
public class ApiClass {

    public static boolean saveFile(String savePath, String file, Part part) {
        boolean f = false;
        try {
            File fileSaveDir = new File(savePath);
            if (!fileSaveDir.exists()) {
                fileSaveDir.mkdir();
            }
//            for (int i = 0; i < part.getSize(); i++) {
            String fileName = extractFileName(part);
            fileName = new File(fileName).getName();
            part.write(savePath + File.separator + file);
//                filename = part.getSubmittedFileName();
//            }
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
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

//    public static boolean saveFile(String savePath, String fileName, InputStream is) {
//        boolean f = false;
//        try {
//            File fileSaveDir = new File(savePath);
//            if (!fileSaveDir.exists()) {
//                fileSaveDir.mkdir();
//            }
//            byte data[] = new byte[is.available()];
//            is.read(data);
//            FileOutputStream fos = new FileOutputStream(savePath + File.separator + fileName);
//            fos.write(data);
//
//            fos.flush();
//            fos.close();
//            f = true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return f;
//    }
}
