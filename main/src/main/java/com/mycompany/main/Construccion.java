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

class Build extends Construccion{
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
    
}

class Home extends Construccion{
    int bh;
    int hab;
    boolean p;
    boolean zCen;

    public Home(int bh, int hab, boolean p, boolean zCen, double price, double m2, String nCalle) {
        super(price, m2, nCalle);
        this.bh = bh;
        this.hab = hab;
        this.p = p;
        this.zCen = zCen;
    }

    public int getBh() {
        return bh;
    }

    public void setBh(int bh) {
        this.bh = bh;
    }

    public int getHab() {
        return hab;
    }

    public void setHab(int hab) {
        this.hab = hab;
    }

    public boolean isP() {
        return p;
    }

    public void setP(boolean p) {
        this.p = p;
    }

    public boolean iszCen() {
        return zCen;
    }

    public void setzCen(boolean zCen) {
        this.zCen = zCen;
    }
    
}