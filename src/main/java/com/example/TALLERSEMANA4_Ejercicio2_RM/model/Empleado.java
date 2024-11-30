package com.example.TALLERSEMANA4_Ejercicio2_RM.model;


public class Empleado {
    private double sueldoBase;
    private int horasExtra;
    private double sueldoTotal;

    // Getters y Setters
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    // Método para calcular el sueldo total
    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBase + (horasExtra * 8); // El pago por hora extra es fijo de 8
    }

}