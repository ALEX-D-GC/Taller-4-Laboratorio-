package ppackageProfesor;

public class Profesor {

    private String nombre;
    private String apellido;
    private double sueldobasico;
    private double sueldototal;
    private String cedula;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, double sueldobasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldobasico = sueldobasico;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldobasico() {
        return sueldobasico;
    }

    public void setSueldobasico(double sueldobasico) {
        this.sueldobasico = sueldobasico;
    }

    public void calcularSueldoTotal() {
        this.sueldototal = (this.sueldobasico) + (this.sueldobasico * 0.20);
    }

    public double getSueltototal() {
        return sueldototal;
    }

    public void setSueltototal(double sueltototal) {
        this.sueldototal = sueltototal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return sueldobasico + ", sueldototal = " + "Profesor{" + "nombre = " + nombre + ", apellido = " + apellido + ", sueldobasico = " + sueldototal + ", cedula=" + cedula + '}';
    }
}
