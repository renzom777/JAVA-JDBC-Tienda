/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.ejercicio1.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import jdbc.ejercicio1.entidades.Producto;
import jdbc.ejercicio1.persistencia.ProductoDAO;

/**
 *
 * @author GustM_000
 */
public class ProductoServicio {

    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public void listarNombre() throws Exception {

        try {
            ArrayList<String> nombres = dao.listarNombres();
            for (String var : nombres) {
                System.out.println(var);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarNombresPrecios() throws Exception {
        try {
            ArrayList<Producto> productos = dao.listarNombresPrecios();
            for (Producto producto : productos) {
                System.out.println(producto.getNombre() + " ; " + producto.getPrecio());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarProductosEntre120y202() throws Exception {
        try {
            ArrayList<Producto> productos = dao.listarProductosEntre120y202();
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        } catch (Exception e) {
            throw e;
        }

    public void listarPortatiles() throws Exception {
        try {
            ArrayList<Producto> productos = dao.listarPortatiles();
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listarProductoBarato() throws Exception {
        try {
            ArrayList<Producto> productos = dao.listarProductoBarato();
            for (Producto producto : productos) {
                System.out.println(producto.getNombre() + " ; " + producto.getPrecio());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarProducto() throws Exception {
        try {
            Scanner leer = new Scanner(System.in);
            Producto producto=new Producto();
            System.out.println("Ingresar nombre del producto");
            String nombre=leer.next();
            producto.setNombre(nombre);
            System.out.println("Ingrese codigo del fabricante");
            int cod_fab=leer.nextInt();
            producto.setCodigo_fabricante(cod_fab);
            System.out.println("Ingrese precio del producto");
            double precio=leer.nextDouble();
            producto.setPrecio(precio);
            dao.ingresarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

}
