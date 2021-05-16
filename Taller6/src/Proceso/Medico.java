/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

/**
 *
 * @author USUARIO PC
 */
public class Medico {
   private String nombreD;
    private String especialidad;
    private double sueldoM;

    public Medico (String nom, String espe, double suel) {
        nombreD = nom;
        especialidad = espe;
        sueldoM = suel;
    }
    public void establecernombreM (String nom){
        nombreD = nom;
    }
    public void establecerEspec (String espe){
        especialidad = espe;
    }
    public void establecerSueldo (double s){
        sueldoM = s;
    }
    public String obtenerNombreM (){
        return nombreD;
    }
    public String obtenerTipo (){
        return especialidad;
    }
    public double obtenerSueldo (){
        return sueldoM;
    }
    
}
