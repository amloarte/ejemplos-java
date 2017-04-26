package clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivos {

    FileWriter flwriter;
    private Scanner entrada;

    public void AbrirArchivo() {

        try {

            flwriter = new FileWriter("Empleados.txt", true);
        } catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void Agregar_Registros(String s) {
        try {

            BufferedWriter bfwriter = new BufferedWriter(flwriter);

            bfwriter.write("ESCENARIO \n\n"
                    + "Maquila de Software\n");
            
            bfwriter.write(s);
            
            System.out.println("\n");
            bfwriter.close();
            
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo.");
        } finally {
            if (flwriter != null) {
                try {
                    flwriter.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public void leerArchivo(String archivo) {
        try {
            entrada = new Scanner(new File(archivo + ".txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                ArrayList<String> linea_partes = new ArrayList<>(Arrays.asList(linea.split("\n")));

              System.out.println("\n");
                System.out.println(linea_partes);
            } 
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } 
    }
}
