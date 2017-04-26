package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class RegistroAcademico {

    private List<Persona> registroAcd = new ArrayList<Persona>();
    private List<ComponenteEducativo> componenteEdc = new ArrayList<ComponenteEducativo>();

    public RegistroAcademico() {
    }

    public void getPersona(Persona a) {
        registroAcd.add(a);
    }

    public void getComponentes(ComponenteEducativo ce) {
        componenteEdc.add(ce);
    }

    public List<ComponenteEducativo> addCompEducativo(ComponenteEducativo compEdu) {
        componenteEdc.add(compEdu);
        return componenteEdc;
    }

    
    @Override
    public String toString() {
        return "RegistroAcademico:"
                + "\t\nregistroAcd=" + registroAcd;
    }
    
}
