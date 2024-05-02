package ppackageAutomotor;

public class TestAutomotor {

    private String cedula;
    private String marcavehiculo;
    private int anofabricacion;
    private double valorvehiculo;
    private double valormatricula;

    public TestAutomotor(String cedula, String marcavehiculo, int anofabricacion, double valorvehiculo) {
        this.cedula = cedula;
        this.marcavehiculo = marcavehiculo;
        this.anofabricacion = anofabricacion;
        this.valorvehiculo = valorvehiculo;
        this.valormatricula = 0.0; // Initialize valormatricula to 0.0
    }

    TestAutomotor(String a_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMarcavehiculo() {
        return marcavehiculo;
    }

    public void setMarcavehiculo(String marcavehiculo) {
        this.marcavehiculo = marcavehiculo;
    }

    public int getAnofabricacion() {
        return anofabricacion;
    }

    public void setAnofabricacion(int anofabricacion) {
        this.anofabricacion = anofabricacion;
    }

    public double getValorvehiculo() {
        return valorvehiculo;
    }

    public void setValorvehiculo(double valorvehiculo) {
        this.valorvehiculo = valorvehiculo;
    }

    public double getValormatricula() {
        return valormatricula;
    }

    public void setValormatricula(double valormatricula) {
        this.valormatricula = valormatricula;
    }
    

    // Other getter and setter methods...
    public void calcularValorMatricula() {
        // Add your logic to calculate valormatricula here...
    }

    @Override
    public String toString() {
        return String.format("""
                             Automotor
                              Cedula: %s
                              Marca del Vehiculo: %s
                              Ano de Fabricacion: %d
                              Valor del Vehiculo: %.2f
                              Valor de la Matricula: %.2f""",
                this.getCedula(), this.getMarcavehiculo(), this.getAnofabricacion(), this.getValorvehiculo(), this.getValormatricula());
    }
}
