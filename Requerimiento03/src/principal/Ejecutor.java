package principal;

import clases.Empleado;
import clases.Equipo;
import clases.LenguajeProgramacion;
import clases.Lider_Proyecto;
import clases.Nomina;
import clases.Archivos;
import clases.Programador;
import java.io.IOException;

public class Ejecutor {

    public static void main(String[] args) throws IOException {
        Archivos n = new Archivos();
        n.AbrirArchivo();

        Nomina nomina1 = new Nomina("1254-kk125");
        Nomina nomina2 = new Nomina("0265-hj552");
        Nomina nomina3 = new Nomina("564dsas-54");

        LenguajeProgramacion lng = new LenguajeProgramacion("Ruby");
        LenguajeProgramacion lng2 = new LenguajeProgramacion("C##");
        LenguajeProgramacion lng3 = new LenguajeProgramacion("C++");

        Programador programador1 = new Programador("JOSE JOSE", 4987, nomina1);
        Programador programador2 = new Programador("ANA MARIA", 1254, nomina2);
        Programador programador3 = new Programador("JOSE MARIA ", 4985, nomina3);

        programador1.agregar_Lenguaje(lng);
        programador2.agregar_Lenguaje(lng2);
        programador3.agregar_Lenguaje(lng3);

        Equipo eq1 = new Equipo();
        Lider_Proyecto lider = new Lider_Proyecto(programador2, nomina1, eq1);

        eq1.Agregar_Programador(programador1);
        eq1.Agregar_Programador(programador3);

        System.out.println("Maquila de Software\n");
        System.out.println(lider.toString());
        n.Agregar_Registros(lider.toString());

    }
}
