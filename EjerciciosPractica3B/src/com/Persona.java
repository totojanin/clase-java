package com;

public class Persona implements Precedable<Persona> {
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return this.getNombre() + " - " + this.getDni();
    }

    @Override
    public int precedeA(Persona persona) {
        if (this.dni < persona.dni) {
            return -1;
        }
        else if (this.dni == persona.dni) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
