package com.loteria.java.dto;

import java.util.Date;

public class Boleto {
    
    private int identificacion;
    private double valor;
    private int numcifras;
    private Date fechacompra;
    private char estado;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumcifras() {
        return numcifras;
    }

    public void setNumcifras(int numcifras) {
        this.numcifras = numcifras;
    }

    public Date getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
       
    
}
