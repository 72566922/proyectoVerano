/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Morales
 */
public class BuscarAbarrote {
    String buscar;
    int valor;

    public BuscarAbarrote(String buscar, int valor) {
        this.buscar = buscar;
        this.valor = valor;
    }

    public String getBuscar() {
        return buscar;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return buscar + " - " + valor;
    }
}
