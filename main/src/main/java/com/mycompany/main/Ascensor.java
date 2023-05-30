/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Moje
 */
public class Ascensor {

    String str = "";
    
    
    public String irAPiso(int piso , int pisoActual) throws InterruptedException {

        if (piso > pisoActual) {
            for (int i = pisoActual + 1; i <= piso; i++) {
                str = str +  i + "... ";
            }
        } else if (piso < pisoActual) {
            for (int i = pisoActual - 1; i >= piso; i--) {
                str = str +  i + "... ";
            }
        }
        
        pisoActual = piso;
        str = str + "  Llegaste al piso " + pisoActual;
        return str;
    }

    
}

