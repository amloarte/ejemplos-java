package Clases;

public class DocenteAuxiliar extends Docente {

    private String horarioTutoria;

    public DocenteAuxiliar(String horarioTutoria, String identificacion, String Nombres, String Email, String IdDoncente) {
        super(identificacion, Nombres, Email, IdDoncente);
        this.horarioTutoria = horarioTutoria;
    }

    public String getHorarioTutoria() {
        return horarioTutoria;
    }

    public void setHorarioTutoria(String horarioTutoria) {
        this.horarioTutoria = horarioTutoria;
    }

    @Override
    public String toString() {
        return "\nDocenteAuxiliar " + super.toString()
                + "\n\tHorario Tutoria=" + horarioTutoria;
    }

}
