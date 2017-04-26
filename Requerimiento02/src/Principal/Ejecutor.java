package Principal;

import Clases.Archivo;

public class Ejecutor {

    public static void main(String[] args) {

        Archivo aplicacion = new Archivo();

        aplicacion.abrir_archivo();
        aplicacion.agregar_informacion();
        aplicacion.cerrar_archivo();

    }
}
