/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author A17016274
 */
public class Maestro extends persona{
    private String claveEmpleado;

    public Maestro(String nombre, String apellidoP, String apellidoM, String claveEmpleado) {
        super(nombre, apellidoP, apellidoM);
        this.claveEmpleado = claveEmpleado;
    }
    
    public void setClaveEmpleado(String claveEmpleado){
        this.claveEmpleado = claveEmpleado;
    }
    
    
}
