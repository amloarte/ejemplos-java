package Clases;

public class DocenteTitular extends Docente {

    private String horaTutoria;

    public DocenteTitular(String horaTutoria, String identificacion, String Nombres, String Email, String IdDoncente) {
        super(identificacion, Nombres, Email, IdDoncente);
        this.horaTutoria = horaTutoria;
    }

   

    @Override
    public String toString() {
        return "\nDocente Titular" + super.toString()
                + "\n\tHora Tutoria:" + horaTutoria ;
    }

}
