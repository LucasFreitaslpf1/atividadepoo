/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.atividadeiii;

/**
 *
 * @author Lucas
 */
public class Dupla<T, U> {

    private T e1;
    private U e2;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Dupla() {
    }

    public Dupla(T e1, U e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public T getE1() {
        return e1;
    }

    public void setE1(T e1) {
        this.e1 = e1;
    }

    public U getE2() {
        return e2;
    }

    public void setE2(U e2) {
        this.e2 = e2;
    }
//</editor-fold>
    

}
