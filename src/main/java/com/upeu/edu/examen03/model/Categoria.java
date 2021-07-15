/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.edu.examen03.model;

/**
 *
 * @author NITRO5
 */
public class Categoria {
    private int categoria_idcategoria;
    private String nombre;

    public Categoria() {
    }

    public Categoria(int categoria_idcategoria, String nombre) {
        this.categoria_idcategoria = categoria_idcategoria;
        this.nombre = nombre;
    }

    public int getCategoria_idcategoria() {
        return categoria_idcategoria;
    }

    public void setCategoria_idcategoria(int categoria_idcategoria) {
        this.categoria_idcategoria = categoria_idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
