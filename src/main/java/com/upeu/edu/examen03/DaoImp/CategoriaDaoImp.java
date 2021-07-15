/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.edu.examen03.DaoImp;
import com.upeu.edu.examen03.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.upeu.edu.examen03.dao.CategoriaDao;
import com.upeu.edu.examen03.model.Categoria;
import com.upeu.edu.examen03.DaoImp.CategoriaDaoImp;

/**
 *
 * @author NITRO5
 */
public class CategoriaDaoImp implements CategoriaDao{
    private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Categoria r) {
		int x = 0;
		String SQL = "insert into categoria (idcategoria, nomrol) values(null, ?)";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, r.getCategoria_idcategoria());
			x = ps.executeUpdate();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int update(Categoria r) {
		// TODO Auto-generated method stub
		int x = 0;
		String SQL = "update categoria set nombre = ? where categoria_idcategoria = ?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, r.getNombre());
			ps.setInt(2, r.getCategoria_idcategoria());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public Categoria read(int id) {
		// TODO Auto-generated method stub
		Categoria a = new Categoria();
		String SQL = "select *from rol where categoria_idcategoria=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {				
				a.setCategoria_idcategoria(rs.getInt("categoria_idcategoria"));
				a.setNombre(rs.getString("nombre"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return a;
	}

	@Override
	public int delete(int id) {
		int x = 0;
		String SQL = "delete from rol where categoria_idcategoria=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		List<Categoria> lista = new ArrayList<>();
		String SQL = "select *from categoria";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
			while(rs.next()) {
				Categoria r = new Categoria();
				r.setCategoria_idcategoria(rs.getInt("CATEGORIA_IDCATEGORIA"));
				r.setNombre(rs.getString("NOMBRE"));
				lista.add(r);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return lista;
	}
}
