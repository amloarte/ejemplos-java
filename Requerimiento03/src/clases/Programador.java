package clases;

import java.util.ArrayList;

public class Programador extends Empleado {

    private String Nombre;
    private double Salario_Mesual;
    private final ArrayList<LenguajeProgramacion> len;

    public Programador(String Nombre, double Salario_Mesual, Nomina nomin) {
        super(nomin);
        this.Nombre = Nombre;
        this.Salario_Mesual = Salario_Mesual;
        ArrayList<LenguajeProgramacion> leng = new ArrayList<>();
        this.len = leng;
    }

    public void agregar_Lenguaje(LenguajeProgramacion le) {
        this.len.add(le);
    }

    public String get_Lenguaje() {
        String composici = "";
        for (LenguajeProgramacion le : len) {
            composici += le.toString();
        }

        return composici;
    }

    private double Bono() {
        String compara;
        double aumento, bono = this.Salario_Mesual;
        for (LenguajeProgramacion le : len) {
            compara = le.toString();

            if ("Java".equals(compara)) {
                aumento = (this.Salario_Mesual * 20) / 100;
                bono += aumento;
            }
        }
        return bono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void Registar_Nombre(String n) {
        this.Nombre = n;
    }

    public double getSalario_Mensual() {

        return Bono();
    }

    public void RegistrarSalario_Mesual(double sa) {
        this.Salario_Mesual = sa;
    }

    @Override
    public String toString() {
        return String.format("\n%s "
                + "\n\tNombre: %s "
                + "\n\tSalario Base: %.2f "
                + "\n\tLenguajes de Programacion: %s"
                + "", super.toString(), getNombre(), getSalario_Mensual(), get_Lenguaje());
    }

}
