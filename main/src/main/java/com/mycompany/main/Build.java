/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Moje
 */
public class Build extends Construccion{
    int pisos;
    int dep;
    boolean asc;

    public Build(int pisos, int dep, boolean asc, double price, double m2, String nCalle) {
        super(price, m2, nCalle);
        this.pisos = pisos;
        this.dep = dep;
        this.asc = asc;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getDep() {
        return dep;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
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
