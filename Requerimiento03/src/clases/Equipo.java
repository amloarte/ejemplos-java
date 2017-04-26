package clases;

import java.util.ArrayList;

public class Equipo {

    private ArrayList<Programador> programador;

    public Equipo() {
        ArrayList<Programador> pr = new ArrayList<>();
        this.programador = pr;
    }

    public void Agregar_Programador(Programador p) {
        this.programador.add(p);
    }

    public String get_Programadores() {
        String composicion = "";
        int i = 1;
        for (Programador prog : programador) {
            composicion += "\n\nProgramador " + (i) + prog.toString();
            i += 1;
        }

        return composicion;
    }

    public ArrayList<Programador> getListProgramadores() {
        return programador;
    }

    @Override
    public String toString() {
        return String.format("\nProgramadores: %s "
                + "\n", get_Programadores());

    }

}
