/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.atividadeiii;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Calculo {

    public static Dupla<Double, Double> metodo3(ArrayList<Double> ins,
                                                ArrayList<Double> outs,
                                                Integer e,
                                                Double lr) {
        Double w0 = 0.0;
        Double w1 = 0.0;
        Double p;
        Double diff;
        //teste
        for (int i = 0; i < e; i++) {
            for (int j = 0; j < ins.size(); j++) {
                p = w1 * ins.get(j) + w0;
                diff = outs.get(j) - p;
                w0 += diff * lr;
                w1 += diff * lr * ins.get(j);
            }
//            if (i % 10 == 0) {
//                System.out.println(i + ". " + "w0 = " + w0 + " w1 = " + w1);
//            }
        }

        return new Dupla<>(w0, w1);
    }

    public static Dupla<Double, Double> metodo1(ArrayList<Double> ins,
                                                ArrayList<Double> outs) {

        return metodo3(ins, outs, 2000, 0.025);
    }

    public static Dupla<Double, Double> metodo2(ArrayList<Double> ins,
                                                ArrayList<Double> outs,
                                                Integer e) {
        return metodo3(ins, outs, e, 0.025);
    }

}
