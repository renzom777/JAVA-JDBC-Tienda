/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.ejercicio1.persistencia;

import java.util.ArrayList;
import java.util.Scanner;
import jdbc.ejercicio1.entidades.Producto;

/**
 *
 * @author GustM_000
 */
public final class ProductoDAO extends DAO {

    public ArrayList<String> listarNombres() throws Exception {

        try {
            String sql = "select nombre from producto group by nombre";
            ArrayList<String> nombres = new ArrayList<>();
            consultarBase(sql);
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                nombres.add(nombre);
            }
            return nombres;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public ArrayList<Producto> listarNombresPrecios() throws Exception {
        try {
            String sql = "select nombre, precio from producto group by nombre";
            ArrayList<Producto> productos = new ArrayList<>();
            consultarBase(sql);
            while (resultado.next()) {
                Producto prod = new Producto();
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                productos.add(prod);
            }
            return productos;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public ArrayList<Producto> listarProductosEntre120y202() throws Exception {
        try {
            String sql = "select * from producto where precio between 120 and 202 group by nombre";
            ArrayList<Producto> productos = new ArrayList<>();
            consultarBase(sql);
            while (resultado.next()) {
                Producto prod = new Producto();
                prod.setCodigo(resultado.getInt("codigo"));
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigo_fabricante(resultado.getInt("codigo_fabricante"));
                productos.add(prod);
            }
            return productos;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public ArrayList<Producto> listarPortatiles() throws Exception {
        try {
            String sql = "select * from producto where nombre like '%portatil%' group by nombre";
            ArrayList<Producto> productos = new ArrayList<>();
            consultarBase(sql);
            while (resultado.next()) {
                Producto prod = new Producto();
                prod.setCodigo(resultado.getInt("codigo"));
                prod.setNombre(resultado.getString("nombre"));
                prod.setPrecio(resultado.getDouble("precio"));
                prod.setCodigo_fabricante(resultado.getInt("codigo_fabricante"));
                productos.add(prod);
            }
            return productos;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public ArrayList<Producto> listarProductoBarato() throws Exception {
        try {
            String sql = "select nombre, min(precio) from producto";
            ArrayList<Producto> productos = new ArrayList<>();
            consultarBase(sql);
            while (resultado.next()) {
                Producto prod = new Producto();
                prod.setNombre(resultado.getString(1));
                prod.setPrecio(resultado.getDouble(2));
                productos.add(prod);
            }
            return productos;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void ingresarProducto(Producto producto) throws Exception {
        try {
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + producto.getNombre() + "' , " + producto.getPrecio() + ", "+producto.getCodigo_fabricante()+");";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
