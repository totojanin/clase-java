package com;

public class Celular implements Precedable<Celular> {
    private double numero;
    private String titular;

    public Celular(double numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public String toString() {
        return this.getTitular() + " - " + this.getNumero();
    }

    @Override
    public int precedeA(Celular celular) {
        if (this.numero < celular.numero) {
            return -1;
        }
        else if (this.numero == celular.numero) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
