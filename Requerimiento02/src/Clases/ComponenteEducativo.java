package Clases;

public class ComponenteEducativo {

    private String Codigo;
    private String Nombre;
    private int NumCreditos;

    public ComponenteEducativo(String Codigo, String Nombre, int NumCreditos) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.NumCreditos = NumCreditos;
    }

    @Override
    public String toString() {
        return "ComponenteEducativo:"
                + "\t\nCodigo:" + Codigo
                + "\t\nNombre:" + Nombre
                + "\t\nNumCreditos:" + NumCreditos;
    }

}
