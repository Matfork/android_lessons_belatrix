package com.main;

/**
 * Created by matt on 04/01/17.
 */
public class Rectangulo extends Forma {

    public Rectangulo(double ancho, double alto) {
        super(ancho, alto);
    }

    @Override
    public double calcularArea() {
        return (this.alto * this.ancho);
    }
}
