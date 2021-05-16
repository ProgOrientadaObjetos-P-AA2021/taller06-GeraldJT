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
public class Hospitalaria {
    private String nombreH;
    private Ciudad ciudadH;
    private int numEs;
    private Medico [] conjM;
    private Enfermero [] conjE;
    private double totalSP;
    private String direccionH;
    
    public Hospitalaria ( String nom, Ciudad c, int nE,String dir, Medico[] cM,
            Enfermero[] cE){
        nombreH = nom;
        ciudadH = c;
        conjM = cM;
        conjE= cE;
        numEs = nE;
        direccionH = dir;
    }
    public String toString(){
        String cadenaF = "";
        
        cadenaF = String.format("%s\n%s\nDirección: %s\nCiudad: %s\nProvincia: %s"
                + "\nNúmero de especialidades: %d\nListado médicos\n"
                , cadenaF, nombreH, direccionH, ciudadH.obtenerNombreC(), 
                ciudadH.obtenerProvinciaC(), numEs);
        for (int i = 0; i < conjM.length; i++) {
            cadenaF = String.format("%s - %s - sueldo: %.2f - "
                    + "%s\n", cadenaF, conjM[i].obtenerNombreM(), 
                    conjM[i].obtenerSueldo(), conjM[i].obtenerTipo());
        }
        cadenaF = String.format("%sListado de enfermeros (as):\n",cadenaF);
        for (int j = 0; j < conjE.length; j++) {
            cadenaF = String.format("%s\n- %s - sueldo"
                    + ": %s - "
                    + "%s\n",cadenaF, conjE[j].obtenerNombreE(), 
                    conjE[j].obtenerSueldo(), conjE[j].obtenerTipo());
        }
        cadenaF = String.format("%s%.2f", cadenaF , totalSP);
        return cadenaF;
        
    }
    public void calcularTotal (){
        double acumulador = 0;
        for (int i = 0; i < conjM.length; i++) {
            acumulador = acumulador + conjM[i].obtenerSueldo();
        }
        for (int j = 0; j < conjE.length; j++) {
            acumulador = acumulador + conjE[j].obtenerSueldo();
        }
        totalSP = acumulador;
    }
    
    public void establecerNombre (String nom){
        nombreH = nom;
    }
    public void establecerCiudad (Ciudad ci){
        ciudadH = ci;
    }
    public void establecerNumEs (int num){
        numEs = num;
    }
    public void establecerConjuntoM ( Medico [] cM){
        conjM = cM;
    }
    public void establecerConjuntoE (Enfermero [] e){
        conjE = e;
    }
    public void establecerDireccion (String di){
        direccionH = di;
    }
     public String obtenerNombre (){
       return nombreH;
    }
    public Ciudad obtenerCiudad (){
        return ciudadH ;
    }
    public int obtenerNumEs (){
        return numEs;
    }
    public Medico [] obtenerConjuntoM (){
        return conjM ;
    }
    public Enfermero [] tablecerConjuntoE (){
        return conjE;
    }
    public String obtenerDireccion (){
        return direccionH;
    }
    public double obtenerTotal (){
        return totalSP;
    }
    
}
