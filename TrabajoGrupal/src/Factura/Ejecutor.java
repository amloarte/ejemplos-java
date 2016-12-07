/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String args[]) {
        Factura a = new Factura();
        a.abrir_archivo();
        a.agregar_informacion();
        a.cerrar_archivo();
    }
}
