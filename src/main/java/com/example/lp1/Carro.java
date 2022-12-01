package com.example.lp1;

public class Carro {
    private static String marca;
    private static String modelo;
    private static String cor;
    private static String placa;
    private static Integer tanque = 3;

    public static Integer getTanque() {
        return tanque;
    }

    public static void setTanque(Integer tanque) {
        Carro.tanque = tanque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
