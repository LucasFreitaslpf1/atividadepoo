/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.edu.ifnmg.atividadeiii;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class AtividadeIII {

    public static void main(String[] args) {
        Dupla<Double, Double> D = new Dupla<>();
        ArrayList<Double> a1 = new ArrayList<>();
        ArrayList<Double> a2 = new ArrayList<>();

        // TESTE 1
        a1.add(1.0);
        a1.add(3.0);
        a1.add(5.0);

        a2.add(1.0);
        a2.add(3.0);
        a2.add(5.0);
        D = Calculo.metodo1(a1, a2);
        System.out.println(">> RESULTADOS TESTE 1");
        System.out.println(">> w1 = " + String.format("%.3f", D.getE2()));
        System.out.println(">> w0 = " + String.format("%.3f", D.getE1()));
        a1.clear();
        a2.clear();

        // TESTE 2
        a1.add(1.0);
        a1.add(3.0);
        a1.add(5.0);

        a2.add(2.0);
        a2.add(4.0);
        a2.add(6.0);

        D = Calculo.metodo2(a1, a2, 2000);
        System.out.println(">> RESULTADOS TESTE 2");
        System.out.println(">> w1 = " + String.format("%.3f", D.getE2()));
        System.out.println(">> w0 = " + String.format("%.3f", D.getE1()));
        a1.clear();
        a2.clear();

        // TESTE 3
        a1.add(1.0);
        a1.add(3.0);
        a1.add(5.0);

        a2.add(3.0);
        a2.add(7.0);
        a2.add(11.0);

        D = Calculo.metodo3(a1, a2, 2000, 0.025);
        System.out.println(">> RESULTADOS TESTE 3");
        System.out.println(">> w1 = " + String.format("%.3f", D.getE2()));
        System.out.println(">> w0 = " + String.format("%.3f", D.getE1()));
        a1.clear();
        a2.clear();

        // TESTE 4
        a1.add(1.0);
        a1.add(3.0);
        a1.add(5.0);

        a2.add(4.5);
        a2.add(12.5);
        a2.add(20.5);

        D = Calculo.metodo1(a1, a2);
        System.out.println(">> RESULTADOS TESTE 4");
        System.out.println(">> w1 = " + String.format("%.3f", D.getE2()));
        System.out.println(">> w0 = " + String.format("%.3f", D.getE1()));
        a1.clear();
        a2.clear();

        // TESTE 5
        a1.add(2.900000095);
        a1.add(6.699999809);
        a1.add(4.900000095);
        a1.add(7.900000095);
        a1.add(9.800000191);
        a1.add(6.900000095);
        a1.add(6.099999905);
        a1.add(6.199999809);
        a1.add(6.0);
        a1.add(5.099999905);
        a1.add(4.699999809);
        a1.add(4.400000095);
        a1.add(5.800000191);

        a2.add(4.0);
        a2.add(7.400000095);
        a2.add(5.0);
        a2.add(7.199999809);
        a2.add(7.900000095);
        a2.add(6.099999905);
        a2.add(6.0);
        a2.add(5.800000191);
        a2.add(5.199999809);
        a2.add(4.199999809);
        a2.add(4.0);
        a2.add(4.400000095);
        a2.add(5.199999809);
        D = Calculo.metodo1(a1, a2);
        System.out.println(">> RESULTADOS TESTE 5");
        System.out.println(">> w1 = " + String.format("%.3f", D.getE2()));
        System.out.println(">> w0 = " + String.format("%.3f", D.getE1()));
        a1.clear();
        a2.clear();

    }
}
