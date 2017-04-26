package clases;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León
 */
public class Nomina {

    private String StrNum_Nomina;

    public Nomina(String StrNum_Nomina) {
        this.StrNum_Nomina = StrNum_Nomina;
    }

    public String getStrNum_Nomina() {
        return StrNum_Nomina;
    }

    @Override
    public String toString() {

        return String.format("\nNumero Nomina: %s", getStrNum_Nomina());
    }
}
