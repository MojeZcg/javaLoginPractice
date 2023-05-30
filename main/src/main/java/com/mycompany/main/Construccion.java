/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Moje
 */
public class Construccion{
    double price;
    double m2;
    String nCalle;

    public Construccion(double price, double m2, String nCalle) {
        this.price = price;
        this.m2 = m2;
        this.nCalle = nCalle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public String getnCalle() {
        return nCalle;
    }

    public void setnCalle(String nCalle) {
        this.nCalle = nCalle;
    }
}


