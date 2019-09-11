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
public class alumno extends persona{
    private String matricula;
    //lic representa a la Licenciatura
    private String lic;
    private asignaturas[] listaDMaterias;
    
    public alumno(String nombre, String apellidoP, String apellidoM, String matricula, String lic) {
        super(nombre, apellidoP, apellidoM);
        this.matricula = matricula;
        this.lic = lic;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setLicenciatura(String lic){
        this.lic = lic;
    }
    
    public String getLicenciatura(){
        return lic;
    }
    
}
