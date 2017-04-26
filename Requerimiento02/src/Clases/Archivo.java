package Clases;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Archivo {

    private Formatter salida;

    public void abrir_archivo() {
        try {
            salida = new Formatter("Registro.txt");
        } catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public void agregar_informacion() {

        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            try {
                Clases.Persona objPersona = new Clases.Persona("123653", "Axel", "@utpl.edu.ec");
                Clases.Alumno objAlumno = new Clases.Alumno("123653", "Axel", "@utpl.edu.ec", "1245");
                Clases.Docente objDocente = new Clases.Docente("123653", "Jose", "@utpl.edu.ec", "004-01");
                Clases.DocenteTitular objDocenteTitular = new Clases.DocenteTitular("Miercoles 14:00", "1214", "Jose", "j@utpl.edu.ec", "0124-56");
                Clases.DocenteAuxiliar objDocenteAxuliar = new Clases.DocenteAuxiliar("Jueves 05:00", "12457", "Maria", "m@utpl.edu.ec", "0124-569");
                Clases.ComponenteEducativo objComponenteEducativo = new Clases.ComponenteEducativo("1254", "Axel", 15);

                System.out.println("Sistema Académico");
                salida.format(objAlumno.toString() + "\nComponentes:\n" + objComponenteEducativo);

                System.out.println(objAlumno);
                System.out.println(objDocenteTitular);
                System.out.println(objDocenteAxuliar);

                bandera = false;

            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine();

            }

        }
    }

    public void cerrar_archivo() {
        if (salida != null) {
            salida.close();
        }
    }
}
