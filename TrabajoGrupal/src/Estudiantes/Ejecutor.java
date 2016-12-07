/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiantes;

/**
 *
 * @author SALAS
 */
public class Ejecutor {
    public static void main( String args[] )
   {
       Estudiantes a= new Estudiantes();
       
       a.abrirArchivo();
       a.leer_informacion();
       a.cerrarArchivo();
   }
}
