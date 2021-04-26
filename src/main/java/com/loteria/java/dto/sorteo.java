/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loteria.java.dto;

import java.util.Date;
import javafx.scene.chart.PieChart;

/**
 *
 * @author adri
 */
public class sorteo {
    private int sorteo;
    private   Date fecha_sorteo;
    private  String nombre_sorteo;

    public int getSorteo() {
        return sorteo;
    }

    public void setSorteo(int sorteo) {
        this.sorteo = sorteo;
    }

    public Date getFecha_sorteo() {
        return fecha_sorteo;
    }

    public void setFecha_sorteo(Date fecha_sorteo) {
        this.fecha_sorteo = fecha_sorteo;
    }

    public String getNombre_sorteo() {
        return nombre_sorteo;
    }

    public void setNombre_sorteo(String nombre_sorteo) {
        this.nombre_sorteo = nombre_sorteo;
    }
    
    
}
