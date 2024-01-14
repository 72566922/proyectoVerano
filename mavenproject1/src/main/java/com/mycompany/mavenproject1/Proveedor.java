/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Morales
 */
public class Proveedor {
    String proveedor;
    int id;

    public Proveedor(String proveedor, int id) {
        this.proveedor = proveedor;
        this.id = id;

    }

    public String getProveedor() {
        return proveedor;
    }

    public int getId() {
        return id;
    }
    

    @Override
    public String toString() {
        return proveedor + " - " + id;
    }
}
