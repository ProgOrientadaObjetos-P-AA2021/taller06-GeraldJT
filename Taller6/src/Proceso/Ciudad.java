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
public class Ciudad {
 
    private String nombreC;
    private String provinciaDC;
    
    public Ciudad ( String nom, String prov){
        nombreC = nom;
        provinciaDC = prov;
    }
    public void establecerNombreC (String nom){
        nombreC = nom;
    }
    public void establecerProvinciaC (String prov){
        provinciaDC = prov;
    }
    public String obtenerNombreC (){
        return nombreC;   
    }
    public String obtenerProvinciaC (){
        return provinciaDC;
        
    }
}
