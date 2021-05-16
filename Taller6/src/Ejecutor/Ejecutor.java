/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;

import Proceso.Ciudad;
import Proceso.Enfermero;
import Proceso.Hospitalaria;
import Proceso.Medico;
import java.util.Scanner;

/**
 *
 * @author USUARIO PC
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        System.out.println("Ingrese el nombre del Hospital:");
        String nombreH = entrada.nextLine();
        System.out.println("Ingrese el número de especialidades");
        int especialidades = entrada.nextInt();
        System.out.println("Ingrese la dirección del Hospital");
        entrada.nextLine();
        String direccion = entrada.nextLine();
        System.out.println("Ingrese el nombre de la ciudad en la que se encuentra"
                + " el hospital:");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia de la ciudad en la que se "
                + "se encuentra el hospital:");
        String provincia = entrada.nextLine();
        Ciudad datosC = new Ciudad(ciudad, provincia);

        System.out.println("Ingrese el número de Doctores de los que va a "
                + "querer almacenar los datos");
        int nDoc = entrada.nextInt();
        Medico[] arregloM;
        arregloM = new Medico[nDoc];
        System.out.println("Ingrese el número de enfermeros de los"
                + " que va a querer almacenar los datos");
        int nEnf = entrada.nextInt();
        Enfermero[] arregloE;
        arregloE = new Enfermero[nEnf];
        int datos = entrada.nextInt();
        entrada.nextLine();
        String nombreD;
        String especialidad;
        double suelDoc;
        for (int i = 0; i < nDoc; i++) {
            System.out.println("Ingrese el nombre del Doctor:\n");
            nombreD = entrada.nextLine();
            System.out.printf("Ingrese la especialidad del Doctor %s:\n",
                    nombreD);
            especialidad = entrada.nextLine();
            System.out.printf("Ingrese el sueldo mensual del Doctor %s:\n",
                    nombreD);
            suelDoc = entrada.nextDouble();
            entrada.nextLine();
            Medico doctor = new Medico(nombreD, especialidad,
                    suelDoc);
            arregloM[i] = doctor;
        }
        entrada.nextLine();
        String nombreEn;
        String tipo;
        double suelEnf;
        for (int j = 0; j < nEnf; j++) {
            System.out.println("Ingrese el nombre del Enfemero:\n");
            nombreEn = entrada.nextLine();
            System.out.printf("Ingrese si tiene nombramiento o contrato %s:\n",
                    nombreEn);
            tipo = entrada.nextLine();
            System.out.printf("Ingrese el sueldo mensual del Doctor %s:\n",
                    nombreEn);
            suelEnf = entrada.nextDouble();
            entrada.nextLine();
            Enfermero enfermero = new Enfermero(nombreEn, tipo,
                    suelEnf);
            arregloE[j] = enfermero;
        }
        Hospitalaria hospital = new Hospitalaria(nombreH, datosC, especialidades,
                direccion, arregloM, arregloE);
        hospital.calcularTotal();
        System.out.printf("%s", hospital.toString());

    }
}
