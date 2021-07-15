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
public class Producto {
    private int producto;
    private String nombre;
    private String precio;
    private String stock;
    private int idcategoria;    

    public Producto() {
    }

    public Producto(int producto, String nombre, String precio, String stock, int idcategoria) {
        this.producto = producto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.idcategoria = idcategoria;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }
    
    
}
