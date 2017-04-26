package Clases;

public class Docente extends Persona {

    private String IdDoncente;

    public Docente(String identificacion, String Nombres, String Email,String IdDoncente) {
        super(identificacion, Nombres, Email);
        getIdDoncente();
    }

    public String getIdDoncente() {
        return IdDoncente;
    }

    public void setIdDoncente(String IdDoncente) {
        this.IdDoncente = IdDoncente;
    }

    @Override
    public String toString() {
        return "" + super.toString() +
                "\n\tIdDoncente:" + IdDoncente ;
    }

}
