/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Francisco Jesus Mac Cetzal 
 */
public class persona {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    
    public persona(String nombre, String apellidoP, String apellidoM){
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellidoP(String apellidoP){
        this.apellidoP = apellidoP;
    }
    
    public String getApellidoP(){
        return apellidoP;
    }
    
    public void setApellidoM(String apellidoM){
        this.apellidoM = apellidoM;
    }
    
    public String getApellidoM(){
        return apellidoM;
    }
}
