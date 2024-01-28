package com.calculadora;

public class Pessoa implements CalculoDeImc {
    private double altura;
    private double peso;
    private double imc;
    
    public Pessoa(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;

    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getImc() {
        return imc;
    }
    
    public void setImc(double imc) {
        this.imc = imc;
    }
    
    @Override
    public double calculaImc() {
        return (this.peso / Math.pow(this.altura, 2));
    }
    
}