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
public class asignaturas {
    private String claveAsig;
    private String nombreAsig;
    private String licenciatura;
    
    public asignaturas(String claveAsig, String nombreAsig, String licenciatura){
        this.claveAsig = claveAsig;
        this.nombreAsig = nombreAsig;
        this.licenciatura = licenciatura;
    }
    
    public void setClaveAsig(String claveAsig){
        this.claveAsig = claveAsig;
    }
    
    public String getClaveAsig(){
        return claveAsig;
    }
    
    public void setNombreAsig(String nombreAsig){
        this.nombreAsig = nombreAsig;
    }
    
    public String getNombreAsig(){
        return nombreAsig;
    }
    
    public void setLicenciatura(String licenciatura){
        this.licenciatura = licenciatura;
    }
    
    public String getLicenciatura(){
        return licenciatura;
    }
    
}
