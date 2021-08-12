/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author DIFFAN
 */
public class Empresa {
    private String nombreEmpres;

    public Empresa() {
    }

    public Empresa(String nombreEmpres) {
        this.nombreEmpres = nombreEmpres;
    }

    /**
     * @return the nombreEmpres
     */
    public String getNombreEmpres() {
        return nombreEmpres;
    }

    /**
     * @param nombreEmpres the nombreEmpres to set
     */
    public void setNombreEmpres(String nombreEmpres) {
        this.nombreEmpres = nombreEmpres;
    }

    @Override
    public String toString() {
        return "Nombre de la Empresa:"+getNombreEmpres();
    }
    
    
    
}
