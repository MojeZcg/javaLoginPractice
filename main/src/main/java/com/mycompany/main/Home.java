/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Moje
 */
public class Home extends Construccion{
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