public class CuentaFree {
    private boolean numIlimitadoRetiro;

    public CuentaFree(boolean numIlimitadoRetiro) {
        this.numIlimitadoRetiro = numIlimitadoRetiro;
    }

    public boolean getNumIlimitadoRetiro() {
        return numIlimitadoRetiro;
    }

    public void setNumIlimitadoRetiro(boolean numIlimitado) {
        this.numIlimitadoRetiro = numIlimitado;
    }

    @Override
    public String toString() {
        return "CuentaFree [numIlimitadoRetiro=" + numIlimitadoRetiro + "]";
    }
}
