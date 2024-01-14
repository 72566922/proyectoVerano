/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Morales
 */
public class Abar {
    String displayText;
    int value;
    

    // Constructor
    public Abar(String displayText, int value ) {
        this.displayText = displayText;
        this.value = value;
        
    }

    public String getDisplayText() {
        return displayText + "-" + value;
    }

   
}
