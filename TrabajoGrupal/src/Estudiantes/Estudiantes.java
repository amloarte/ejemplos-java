/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiantes;

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
public class Estudiantes {

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

    // lee registro del archivo
    public void leer_informacion() {
        //Declaracion de variables
        String e;
        boolean p = false;

        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                
                for (int i = 0; i < linea_partes.size(); i++) {//Ciclo for para recorrer el array list
                    
                    e = linea_partes.get(0).substring(0, 1);
                    if (e.contains("A") && i < 1) {//Condicion para que imprima con la letra asignada
                        System.out.println("Con apellido A: " +linea_partes);//imprime todos los elementos que cumplen con la condicion
                    }
                    if (e.contains("B") && i < 1) {//Condicion para que imprima con la letra asignada
                        System.out.println("Con apellido B:" +linea_partes);
                    }
                    if (e.contains("C") && i < 1) {//Condicion para que imprima con la letra asignada
                        System.out.println("Con apellido C:" +linea_partes);
                    }
                    if (e.contains("E") && i < 1) {//Condicion para que imprima con la letra asignada
                        System.out.println("Con apellido E:" +linea_partes);
                    }
                    if (e.contains("U") && i < 1) {//Condicion para que imprima con la letra asignada
                        System.out.println("Con apellido U:" +linea_partes);
                    }
                }
            }
            // fin de while
         }catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
            catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
            // fin de catch
        } // fin del metodo leerRegistros
        // cierra el archivo y termina la aplicación

    

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo

    public void sumar() {

    }
} // fin de la clase LeerArchivoTexto

