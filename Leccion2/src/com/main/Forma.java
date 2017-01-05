package com.main;

/**
 * Created by matt on 04/01/17.
 */
public abstract class Forma {

    public Forma(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    protected double ancho;
    protected double alto;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public abstract double calcularArea();
}
