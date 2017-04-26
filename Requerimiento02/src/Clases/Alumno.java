package Clases;

public class Alumno extends Persona {

    private String IdAlumno;

    public Alumno(String IdAlumno, String identificacion, String Nombres, String Email) {
        super(identificacion, Nombres, Email);
        this.IdAlumno = IdAlumno;
    }

    public String getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(String IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    @Override
    public String toString() {
        return "Alumno" + super.toString()
                + "\n\tIdAlumno: " + IdAlumno;

    }

}
