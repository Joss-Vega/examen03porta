/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.edu.examen03.dao;

import java.util.List;
import com.upeu.edu.examen03.model.Categoria;
/**
 *
 * @author NITRO5
 */
public interface CategoriaDao {
        int create(CategoriaDao r);
	int update(CategoriaDao r);
	int delete(int id);
	CategoriaDao read(int id);
	List<CategoriaDao> readAll();
}
