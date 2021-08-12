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
public class Cliente {
    private String telefonoContacto;

    public Cliente() {
    }

    public Cliente(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    /**
     * @return the telefonoContacto
     */
    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    /**
     * @param telefonoContacto the telefonoContacto to set
     */
    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    @Override
    public String toString() {
        return "Telefono Contacto: "+getTelefonoContacto(); 
    }
    
    
}
