/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author DIFFAN
 */
public class Persona {
    private String nombre;
    private String edad;

    public Persona() {
    }

    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public static void mostrarPersona(){
        System.out.println("Este es un metodo de la Clase Persona");
    }
    public static String retornarPersona(){
        String x;
        x="retorna Persona";
        return x;
    }
    public void instanciarPersona(){
        System.out.println("instanciar la clase Persona");
    }
    public boolean esverdadPersona(){
        int a;
        int b;
        a=5;
        b=6;
        return a==b;
    }
   
     @Override
    public String toString() {
        return "Nombre: "+getNombre()+ "\n"
                + "Edad: " + getEdad();
    }

}
