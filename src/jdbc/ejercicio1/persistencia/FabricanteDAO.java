/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.ejercicio1.persistencia;

/**
 *
 * @author GustM_000
 */
public final class FabricanteDAO extends DAO {

    public void ingresarFabricante(String nombre) throws Exception {
        try {
            String sql = "insert into fabricante (nombre) values ('" + nombre + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
}
