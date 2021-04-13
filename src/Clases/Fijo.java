package Clases;

public class Fijo extends Trabajador{
    private int aniosAntiguedad;
    private boolean esDirector;

    public Fijo(String nombre, String apellidos, double horasTrabajadas, int aniosAntiguedad, boolean esDirector) {
        super(nombre, apellidos, horasTrabajadas);
        this.aniosAntiguedad = aniosAntiguedad;
        this.esDirector = esDirector;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public boolean isEsDirector() {
        return esDirector;
    }

    public void setEsDirector(boolean esDirector) {
        this.esDirector = esDirector;
    }


    /*public double cobrar() {
        return ((this.getAniosAntiguedad()/2)*this.getHorasTrabajadas())*SUELDOBASE;
    }

     */

    @Override
    public double cobrar(){
        double salario = getHorasTrabajadas()*SUELDOBASE;
        //OPERADORES TERNARIOS. MIRAR PORQUE PARECE INTERESANTE UTILIZARLO
        return isContento()?salario:salario*2;
    }
}
