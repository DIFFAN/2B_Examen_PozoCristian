/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;

/**
 *
 * @author DIFFAN
 */
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("Mtodos de la clase Persona");
        
        Persona.mostrarPersona();
        
        System.out.println(Persona.retornarPersona());
        
        Persona p = new Persona();
        p.instanciarPersona();
        
        Persona p1 = new Persona();
        System.out.println(p1.esverdadPersona());
        
        
        Cliente c = new Cliente();
       
        p.setNombre("Marco");
        p.setEdad("28");
        c.setTelefonoContacto("022265496");
        
        System.out.println("Cliente es: "+"\n"
                + p.toString()+"\n"
                + c.toString());
    }
    
}
