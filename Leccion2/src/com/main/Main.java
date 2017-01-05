package com.main;

/**
 * Created by matt on 04/01/17.
 */
public class Main {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(5,7);
        Triangulo t = new Triangulo(50,10);

        System.out.println(r.calcularArea());
        System.out.println(t.calcularArea());

    }
}
