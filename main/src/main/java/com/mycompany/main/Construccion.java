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
    
    
    public double calcE(boolean elev){
        double r = 0;
        
        //Añade el 135% del valor de el terreno
        r += (135 / 100) * price;

        //Suma la cantidad de departamentos
        if(dep < 15 && dep > 50000){
            r += 10000;
        }else if(dep < 15){
            r += 7500;
        }else if(dep >= 15 && dep < 25){
            r += 25000;
        }else if(dep >= 25 ){
            r += 35000;
        }

        //Suma de cantidad de pisos
        if(pisos == 1 ){
            r += 15000;
        }else if(pisos == 2){
            r += 25000;
        }else if(pisos == 3){
            r += 37500;
        }else if(pisos == 4){
            r += 42500;
        }else if(pisos > 4){
            r+= 60000;
        }

        //Suma si tiene ascensor
        if(elev){
            r += 67000;
        }

        //Retorna resultado
        return r;
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
    
    
    public double calcH(boolean p, boolean zC){
        double r = 0;
        
        //Agrega el 120% al valor del terreno
        r += (120 / 100) * price;
        
        //Suma segun la cantidad de habitaciones
        if(hab == 1){
            r += 15000;
        }else if(hab == 2){
            r += 25000;
        }else if(hab == 3){
            r += 37000;
        }else if(hab == 4 ){
            r += 42500;
        }else if(hab > 4){
            r += 60000;
        }
        
        //Suma segun la cantidad de baños
        if(2 > bh && price > 50000 ){
            r +=10000;
        }else if(2 > bh){
            r += 7500;
        }else if(2 <=bh && 4 > bh){
            r += 25000;
        }else if(bh >= 4){
            r += 35000;
        }
        
        //Tiene pileta?
        if(p){
            r += 35000;
        }
        
        //Esta en una zona centrica?
        if(zC){
            r += 17500;
        }else{
            r -= 2500;
        }
        
        //Retorna resultado
        return r;
    }
}