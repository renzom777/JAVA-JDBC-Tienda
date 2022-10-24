/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.ejercicio1.servicios;

import jdbc.ejercicio1.persistencia.FabricanteDAO;

/**
 *
 * @author GustM_000
 */
public class FabricanteServicio {

    private FabricanteDAO dao;

    public FabricanteServicio() {
        this.dao = new FabricanteDAO();
    }

    public void ingresarFabricante(String nombre) throws Exception {
        try {
           dao.ingresarFabricante(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

}
