package ppackageCheque;

public class Cheque {

    private String nombrecliente;
    private String nombrebanco;
    private double valorcheque;
    private double comisionbanco;

    public Cheque() {
    }

    public Cheque(String nombrecliente, String nombrebanco, double valorcheque) {
        this.nombrecliente = nombrecliente;
        this.nombrebanco = nombrebanco;
        this.valorcheque = valorcheque;
    }

    public void calcularComisionbanco() {
        this.comisionbanco = this.valorcheque * 0.00003;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getNombrebanco() {
        return nombrebanco;
    }

    public void setNombrebanco(String nombrebanco) {
        this.nombrebanco = nombrebanco;
    }

    public double getValorcheque() {
        return valorcheque;
    }

    public void setValorcheque(double valorcheque) {
        this.valorcheque = valorcheque;
    }

    public double getComisionbanco() {
        return comisionbanco;
    }

    public void setComisionbanco(double comisionbanco) {
        this.comisionbanco = comisionbanco;
    }

    @Override
    public String toString() {
        return String.format("""
                             Cheque
                              Nombre del Cliente: %s
                              Nombre del Banco: %s
                              Valor del Cheque: %.2f
                              Comision que Cobra el Banco: %.2f""",
                this.getNombrecliente(), this.getNombrebanco(), this.getValorcheque(), this.getComisionbanco());
    }
}
