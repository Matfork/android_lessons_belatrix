package com.main;

/**
 * Created by matt on 04/01/17.
 */
public class Triangulo extends Forma{

    public Triangulo(double ancho, double alto) {
        super(ancho, alto);
    }

    @Override
    public double calcularArea() {
        return (this.alto * this.ancho)/2;
    }
}
