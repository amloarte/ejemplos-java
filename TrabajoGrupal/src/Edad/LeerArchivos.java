/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class LeerArchivos {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("estudiantes.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // Lee registro del archivo
    public void leer_informacion() {

        try // lee registros del archivo, usando el Scanner
        {
            EscribirArchivos n = new EscribirArchivos();
            n.abrir_archivo();//Se crea un nuevo objeto para agregar los nuevos datos del archivo
            
            boolean archivo = false;
            
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split("\\|")));
                
                String nombre = linea_partes.get(0);//Imprime el arreglo en la posicion 0(nombre)
                String apellido = linea_partes.get(1);//Imprime el arreglo en la posicion 1(apellido)
                int anioN = Integer.parseInt(linea_partes.get(2));//Devuelve la edad en entero para calcular la edad
                int edad = 2016 - anioN;//Calculo de la edad
                n.agregar_informacion(nombre, apellido, edad);//Con el objeto agrega y se imprime el nombre, apellido y la edad
            } // fin de while
            n.cerrar_archivo();
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
}
