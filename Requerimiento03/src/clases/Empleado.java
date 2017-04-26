package clases;


public class Empleado {

    private Nomina nonima;

    public Empleado(Nomina nonima) {
        this.nonima = nonima;
    }

    public String getNumero_nonima() {

        return nonima.getStrNum_Nomina();
    }

    public double Incremeto_Sueldo(double s) {
        double incremento = s;
        incremento = ((incremento * 20) / 100);
        return incremento;
    }

    @Override
    public String toString() {

        return String.format("\tNumero de Nomina: %s", getNumero_nonima());
    }
}
