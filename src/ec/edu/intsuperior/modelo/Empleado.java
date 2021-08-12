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
public class Empleado {
    private Double sueldoBruto;

    public Empleado() {
    }

    public Empleado(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    /**
     * @return the sueldoBruto
     */
    public Double getSueldoBruto() {
        return sueldoBruto;
    }

    /**
     * @param sueldoBruto the sueldoBruto to set
     */
    public void setSueldoBruto(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    
}
