package Clases;

public class Persona {

    private String identificacion;
    private String Nombres;
    private String Email;

    public Persona(String identificacion, String Nombres, String Email) {
        this.identificacion = identificacion;
        this.Nombres = Nombres;
        this.Email = Email;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "\n" + 
                "\n\tidentificacion:" + identificacion + 
                "\n\tNombres:" + Nombres + 
                "\n\tEmail:" + Email ;
    }

}
