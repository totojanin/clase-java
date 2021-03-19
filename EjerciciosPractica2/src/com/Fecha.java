package com;

import java.time.LocalDate;

public class Fecha {
    private LocalDate localDate;

    public Fecha() {
        this.localDate = LocalDate.now();
    }

    public Fecha(int year, int month, int day) {
        this.localDate = LocalDate.of(year, month, day);
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void sumarUnDia() {
        this.localDate = localDate.plusDays(1);
    }

    public static boolean esCorrecta(int year, int month, int day) {
        try {
            LocalDate.of(year, month, day);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "calendar=" + localDate +
                '}';
    }
}
