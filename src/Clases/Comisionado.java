package Clases;

public class Comisionado extends Trabajador{

    private int ventas;

    public Comisionado(String nombre, String apellidos, double horasTrabajadas, int ventas) {
        super(nombre, apellidos, horasTrabajadas);
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }


    /**
     * Se sobrescribe el método cobrar y se le da el cuerpo que este necesite
     * para hacer su función.
     * @return
     */
    @Override
    public double cobrar() {
        int sueldo;
        sueldo = SUELDOBASE/2*getVentas();
        return sueldo;
    }
}
