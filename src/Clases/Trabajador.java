package Clases;

/**
 * En esta clase declaramos un método abstracto para que sus subclases deban
 * implementarlo y sobrescribirlo. Esta clase no se puede instanciar, pero
 * su constructor será utilizado en los de las subclases.
 */
public abstract class Trabajador {
    private String nombre;
    private String apellidos;
    private static int cont = 0;
    private int id;
    public static final int SUELDOBASE = 600;
    private double horasTrabajadas;
    private boolean contento;

    public boolean isContento() {
        return contento;
    }

    public void setContento(boolean contento) {
        this.contento = contento;
    }

    public Trabajador(String nombre, String apellidos, double horasTrabajadas) {
        cont++;
        id=cont;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.horasTrabajadas = horasTrabajadas;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Método abstracto cobrar().
     * Se pueden definir con parámetros o no según se quiera.
     * No puede llevar llaves, solo paréntesis
     *
     * @return
     */
    public abstract double cobrar();
}
