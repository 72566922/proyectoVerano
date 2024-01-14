/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CConexion {
    Connection cx;
    String usuario = "root";
    String contrasenia = "morales";
    String bd = "bodega";
    String url = "jdbc:mysql://localhost:3306/";
    String driver = "com.mysql.cj.jdbc.Driver";

    public CConexion() {
    }

    public Connection conectar() {
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+bd, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conectó a la base de datos " + bd);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se conectó a la base de datos " + bd + "\nError: " + ex.getMessage());
            Logger.getLogger(CConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }

    public void desconectar() {
        try {
            if (cx != null && !cx.isClosed()) {
                cx.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertarDatos(String marca, String proveedor, float precio, String idAbarrote, String idCategoria) {
    try {
            String query = "INSERT INTO abarrote_arroz (nombre, proveedor, precio_unidad, id_Abarrote, id_Categoria) VALUES (?, ?, ?, ?, ?)";

        
        try (PreparedStatement pst = cx.prepareStatement(query)) {
            pst.setString(1, marca);
            pst.setString(2, proveedor);
            pst.setFloat(3, precio);
            pst.setString(4, idAbarrote);
            pst.setString(5, idCategoria);
            
            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo insertar datos");
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(CConexion.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    public static void main(String[] args) {
    System.out.println("Iniciando la aplicación...");
    CConexion conexion = new CConexion();
    try {
        conexion.conectar();
        System.out.println("Datos insertados correctamente");
    } catch (Exception ex) {
        System.err.println("Error al ejecutar la aplicación: " + ex.getMessage());
    } finally {
        conexion.desconectar();
    }
}

}


