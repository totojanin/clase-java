package com;

public class CuentaCorriente {
    private double saldo;
    private int numeroCuenta;

    public CuentaCorriente(double saldo, int numeroCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.saldo = cuentaCorriente.getSaldo();
        this.numeroCuenta = cuentaCorriente.getNumeroCuenta();
    }

    public CuentaCorriente() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    private void ingreso(){

    }

    private void egreso(){

    }

    private void reintegro(){

    }

    private void transferencia(){

    }
}
