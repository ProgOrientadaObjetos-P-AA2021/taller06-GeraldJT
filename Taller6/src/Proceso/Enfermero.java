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
public class Enfermero {

    private String nombreE;
    private String tipo;
    private double sueldoM;

    public Enfermero(String nom, String tip, double suel) {
        nombreE = nom;
        tipo = tip;
        sueldoM = suel;
    }
    public void establecernombreE (String nom){
        nombreE = nom;
    }
    public void establecerTipo (String ti){
        tipo = ti;
    }
    public void establecerSueldo (double s){
        sueldoM = s;
    }
    public String obtenerNombreE (){
        return nombreE;
    }
    public String obtenerTipo (){
        return tipo;
    }
    public double obtenerSueldo (){
        return sueldoM;
    }
}
