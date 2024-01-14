/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;




public class Item {
    String displayText;
    int value;

    public Item(String displayText, int value) {
        this.displayText = displayText;
        this.value = value;

    }

    public String getDisplayText() {
        return displayText;
    }

    public int getValue() {
        return value;
    }

    

    @Override
    public String toString() {
        return displayText + " - " + value ;
        
    }
}


