package com.ruth.model;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double precio;
   private Clientes clientes;

    public Coche(String matricula, String marca, String modelo, String color, double precio, Clientes clientes) {
        this.setMatricula(matricula);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setColor(color);
        this.setPrecio(precio);
        this.setClientes(clientes);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", clientes=" + clientes +
                '}';
    }
}
