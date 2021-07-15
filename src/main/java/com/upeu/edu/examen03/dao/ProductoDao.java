/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.edu.examen03.dao;
import com.upeu.edu.examen03.model.Producto;
import java.util.List;

/**
 *
 * @author NITRO5
 */
public interface ProductoDao {
    int create(Producto r);
	int update(Producto r);
	int delete(int id);
	Producto read(int id);
	List<Producto> readAll();
}
