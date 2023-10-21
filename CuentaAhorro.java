import java.util.Arrays;

public class CuentaAhorro {
    private double tasaInteresAnual = 0.03;
    private String[] beneficios;

    public CuentaAhorro(double tasaInteresAnual, String[] beneficios) {
        this.tasaInteresAnual = tasaInteresAnual;
        this.beneficios = beneficios;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public String[] getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public String toString() {
        return "CuentaAhorro [Tasa de Interés Anual: " + tasaInteresAnual + ", Beneficios: " + Arrays.toString(beneficios) + "]";
    }
}

