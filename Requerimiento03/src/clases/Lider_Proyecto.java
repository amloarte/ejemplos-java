package clases;

public  class Lider_Proyecto extends Empleado {

    private  Programador programador;
    private  Equipo equipo;

    public Lider_Proyecto(Programador pr, Nomina nomin, Equipo e) {
        super(nomin);
      
        Programador p = new Programador(pr.getNombre(), pr.getSalario_Mensual(), nomin);
        this.programador = p;
        setLenguaje(pr.get_Lenguaje());
        
        this.equipo = e;
    }
   
    String a;

    public void setLenguaje(String le) {
        this.a = le;
    }

    public String getLenguaje() {
        return a;
    }

    public double Calculo_Salario() {
        double salario;
        int cantidad;
       
        cantidad = equipo.getListProgramadores().size();
        
        salario = ((programador.getSalario_Mensual() * 10) / 100) * cantidad;
        salario = salario + programador.getSalario_Mensual();
        return salario;
    }

    public Programador getProgramador() {
        return programador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return String.format("Lider: %s%s "
                + "\n\tSalario Por Cargo: %.2f \n"
                + "%s\n",
                getProgramador(), getLenguaje(), Calculo_Salario(),getEquipo());
    }
}
