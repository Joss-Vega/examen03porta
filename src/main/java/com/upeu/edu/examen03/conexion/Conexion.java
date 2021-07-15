/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.edu.examen03.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alum.fial8
 */
public class Conexion {
    private static final String URL = "jdbc:oracle:thin:@3.236.84.144:1521:ORCL";
    private static final String DRIVER = "oracle.jdbc.OracleDriver";
    private static final String USER = "DBII";
    private static final String PASS = "123456";
    private static Connection cx = null;
    public static Connection getConexion(){
        try {
            Class.forName(DRIVER);
            if(cx == null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: "+e);
        }
        return cx;
    }
   public static void cerrar() throws SQLException {
      if (cx != null) {
         cx.close();
      }
   } 
}

