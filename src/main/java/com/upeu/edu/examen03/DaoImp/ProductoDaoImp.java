/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.edu.examen03.DaoImp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.upeu.edu.examen03.conexion.Conexion;
import com.upeu.edu.examen03.dao.ProductoDao;
import com.upeu.edu.examen03.model.Categoria;
import com.upeu.edu.examen03.model.Producto;

/**
 *
 * @author NITRO5
 */
public class ProductoDaoImp implements ProductoDao{
    private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx = null;
	@Override
	public int create(Producto r) {
		int x = 0;
		String SQL = "INSERT INTO alumno (nombre, telefono, direccion) VALUES (?, ?, ?);";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			r.toString();
			ps.setString(1, r.getNombre());
			ps.setString(2, r.getTelefono());
			ps.setString(3, r.getDireccion());
		
			x = ps.executeUpdate();
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int update(Producto r) {
		// TODO Auto-generated method stub
		int x = 0;
		String SQL = "UPDATE alumno SET nombre = ?, telefono= ? , direccion = ? WHERE idalum = ?;";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setString(1, r.getNombre());
			ps.setString(2, r.getTelefono());
			ps.setString(3, r.getDireccion());
			ps.setInt(4, r.getIdalum());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return x;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int x = 0;
		String SQL = "delete from alumno where idalum=?";
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
	public Alumno read(int id) {
		// TODO Auto-generated method stub
		Alumno a = new Alumno();
		String SQL = "SELECT * FROM alumno WHERE idalum=?";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {				
				a.setIdalum(rs.getInt("idalum"));
				a.setNombre(rs.getString("nombre"));
				a.setTelefono(rs.getString("telefono"));
				a.setDireccion(rs.getString("direccion"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return a;
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		List<Alumno> lista = new ArrayList<>();
		String SQL = "select *from alumno";
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement(SQL);
			rs = ps.executeQuery(SQL);
			while(rs.next()) {
				Alumno r = new Alumno();
				r.setIdalum(rs.getInt("idalum"));
				r.setNombre(rs.getString("nombre"));
				r.setTelefono(rs.getString("telefono"));
				r.setDireccion(rs.getString("direccion"));
				
				lista.add(r);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return lista;
	}

}
