/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;

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
public class Paises {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("paises.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {
        String c = "u"; //Declaracion de variables
        String d = "U";
        boolean a = false;
        boolean b = false;
        
        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(",")));
                //System.out.println(linea_partes);

                for (int i = 0; i < linea_partes.size(); i++) {//Ciclo for para recorrer el arraylist

                    if (a = linea_partes.get(0).contains(d) && i < 1) {//sentencia if para evalue si el arreglo tiene la letra U
                        System.out.println("Español:" + linea_partes.get(1) + "\tIngles: " + linea_partes.get(2));//Imprime en pantalla el arreglo si se cumple la condicion Mayusculas    
                    }else if(b = linea_partes.get(0).contains(c) && i < 1){
                        System.out.println("Español:" + linea_partes.get(1) + "\tIngles: " + linea_partes.get(2));//Imprime en pantalla el arreglo si se cumple la condicion Minusculas
                    }         
                }
            }
            // fin de while
        } catch (NoSuchElementException elementException) {
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
