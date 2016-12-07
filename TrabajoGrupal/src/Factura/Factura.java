/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Factura {

    private Formatter salida; // objeto usado para enviar texto al archivo

    // permite al usuario abrir el archivo
    public void abrir_archivo() {
        try {
            salida = new Formatter("factura.txt");
        } // fin de try
        catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrir_archivo

    // agrega registros al archivo
    public void agregar_informacion() {
        // el archivo permite el ingreso
        Scanner entrada = new Scanner(System.in);

        //Declaracion de variables
        boolean archivo = true;
        int numPro = 0;
        int op = 0;
        double valPro = 0;
        double subT = 0;
        double iva;
        double valTotal;
        String prod = "";

        try // envía valores al archivo
        {
            // obtiene los datos que se van a enviar
            System.out.println("Ingrese el nombre del Cliente:"); //El usuario ingresa el nombre
            String nombre = entrada.nextLine(); //Lee el nombre que se ingreso 
            System.out.println("Ingrese la Ciudad:"); // El usuario ingresa la ciudad
            String ciudad = entrada.next(); // Lee la ciudad que se ingreso

            //Presentar la factura
            salida.format("\t\t\t\t\t\t\tComercial de Ventas y Reventas\t\t\n\nNombre: %s\nCiudad: %s\n-------------------------------\nProducto\t\t\tCantidad\t\tPrecio\n", nombre, ciudad);

            while (archivo) {
                //Opciones del menu
                
                System.out.println("\t\t\tMenu");
                System.out.println("\t 1. Arroz; Costo = $2.50 por kilo");
                System.out.println("\t 2. Azucar; Costo = $1.50 por kilo");
                System.out.println("\t 3. Aceite; Costo = $1.30 por unidad");
                System.out.println("\t 4. Tallarines; Costo = $1.50 por unidad");
                System.out.println("\t 5. Sal; Costo = $1.00 por kilo");
                
                System.out.println("\nQue producto desea"); //Debe elegir una opcion del menu
                op = entrada.nextInt(); //Lee la opcion ingresada
                System.out.println("Cuantos productos desea"); //Debe ingresar la cantidad de productos que desea 
                numPro = entrada.nextInt(); //Lee cuantos productos

                //Casos segun la opcion que se eliga
                switch (op) {
                    case 1://Si desea comprar Arroz
                        valPro = (2.5 * numPro); //se calcula el valor del arroz por la cantidad deseada
                        prod = "Arroz  ";
                        break;
                    case 2://Si desea comprar azucar
                        valPro = (1.5 * numPro); //se calcula el valor del azucar por la cantidad deseada//Calcula el valor de la azucar
                        prod = "Azucar  ";
                        break;
                    case 3://Si desea comprar Aceite
                        valPro = (1.3 * numPro); //se calcula el valor del aceite por la cantidad deseada//Calcula el valor del aceite
                        prod = "Aceite  ";
                        break;
                    case 4://Si desea comprar Tallarines
                        valPro = (1.5 * numPro); //se calcula el valor de los tallarines por la cantidad deseada
                        prod = "Tallarines  ";
                        break;
                    case 5://Si desea comprar Sal
                        valPro = (1 * numPro); //se calcula el valor de la sal por la cantidad deseada
                        prod = "Sal  ";
                        break;
                }
                //Formato imprime los productos, la cantidad de producto y el valor total de la factura
                salida.format("\t\t%s\t\t\t%d\t\t\t\t%.2f\n", prod, numPro, valPro); 

                subT = subT + valPro;//calcula el subtotal 

                System.out.println("\nDesea mas productos: 1.-Si/2.-N0");//Se pregunta si desea comprar mas productos
                int valor = entrada.nextInt();
                if (valor == 2) {
                    archivo = false;
                }

            }
            iva = subT * 0.14; //Se calcula el subtotal con el iva
            valTotal = subT + iva;//Se calcula el valor total a pagar

            //Formato que presenta el subtotal, el iva y el valor total a pagar de la factura
            salida.format("------------------------------\n\n\t\t\t\t\tSubtotal: %.2f\n\t\t\t\t\t\tIva: %.2f\n\t\t\t\t\t"
                    + "TOTAL: %.2f\n", subT, iva, valTotal);

        } // fin de try
        catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error al escribir en el archivo.");
            return;
        } // fin de catch
        catch (NoSuchElementException elementException) {
            System.err.println("Entrada invalida. Intente de nuevo.");
            entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
        } // fin de catch

        // fin de while
    } // fin del método agregarRegistros

    // cierra el arrchivo
    public void cerrar_archivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del método cerrarArchivo
} // fin de la clase ArchivoTexto