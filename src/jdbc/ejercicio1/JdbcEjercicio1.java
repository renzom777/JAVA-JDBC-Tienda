/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.ejercicio1;

import java.util.Scanner;
import jdbc.ejercicio1.servicios.FabricanteServicio;
import jdbc.ejercicio1.servicios.ProductoServicio;

/**
 *
 * @author GustM_000
 */
public class JdbcEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductoServicio prodserv = new ProductoServicio();
        FabricanteServicio fabserv = new FabricanteServicio();

        try {
            Scanner leer = new Scanner(System.in);
            int opcion;
            do {
                System.out.println("----------------"
                        + "\nTIENDA"
                        + "\n-----------------"
                        + "\n¿Qué desea hacer?"
                        + "\n1. Ver nombres de todos los productos"
                        + "\n2. Ver nombres y precios de todos los productos"
                        + "\n3. Ver aquellos productos con precio entre 120 y 202"
                        + "\n4. Ver todos los portatiles"
                        + "\n5. Ver nombre y precio del producto mas barato"
                        + "\n6. Ingresar producto a la base de datos"
                        + "\n7. Ingresar fabricante a la base de datos"
                        + "\n8. Salir");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        prodserv.listarNombre();
                        break;
                    case 2:
                        prodserv.listarNombresPrecios();
                        break;
                    case 3:
                        prodserv.listarProductosEntre120y202();
                        break;
                    case 4:
                        prodserv.listarPortatiles();
                        break;
                    case 5:
                        prodserv.listarProductoBarato();
                        break;
                    case 6:
                        prodserv.ingresarProducto();
                        break;
                    case 7:
                        System.out.println("Ingresar nombre del fabricante");
                        String nombre = leer.next();
                        fabserv.ingresarFabricante(nombre);
                        break;
                }
            } while (opcion != 8);
        } catch (Exception e) {
            e.getMessage();
        }

//        try {
//            Scanner leer = new Scanner(System.in);
//            System.out.println("Ingresar nombre del fabricante");
//            String nombre=leer.next();
//            fabserv.ingresarFabricante(nombre);
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        try {
//             prodserv.listarNombre();
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        
//        try {
//             prodserv.listarNombresPrecios();
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        
//        try {
//             prodserv.listarPortatiles();
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        try {
//            prodserv.listarProductoBarato();
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        try {
//            prodserv.ingresarProducto();
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        
//        try {
//             prodserv.listarProductosEntre120y202();
//        } catch (Exception e) {
//            e.getMessage();
//        }
    }

}
