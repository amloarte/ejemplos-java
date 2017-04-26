package clases;

public class LenguajeProgramacion {

    public String lenguaje;

    public LenguajeProgramacion(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    @Override
    public String toString() {

        return String.format(": %s", getLenguaje());
    }
}
