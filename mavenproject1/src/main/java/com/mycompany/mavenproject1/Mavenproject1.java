/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.sql.Connection;
import javax.swing.JFrame;




public class Mavenproject1 {

    public static void main(String[] args) {
        CConexion conexion = new CConexion();
        Aba Aba = new Aba();
        Abarrotes Abarrotes = new Abarrotes();
        bodega bodega = new bodega();
        Abarrotes.setVisible(true);
        bodega.setVisible(true);

        
    }
}

