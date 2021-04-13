package Main;

import Clases.Comisionado;
import Clases.Fijo;
import Clases.Trabajador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    /**
     * Coisionado c = new Comisionado();
     * Trabajador t = (Trabajador) c;//hacemos casting.
     * t.cobrar(); utilizará el método de la clase Comisionado aunque se haya hecho
     * el cast a Trabajador.
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Cada clase utilizará su propio método sobrescrito de el método abstractop "cobrar()"
         * de la clase Trabajador.
         */
        Trabajador pepe = new Comisionado("Paco", "Mermela", 236, 78);
        Trabajador t2 = new Fijo("María", "Unpajote", 300, 6, false);

        List<Trabajador> trabajadores = new LinkedList<Trabajador>();
        trabajadores.add(pepe);
        trabajadores.add(t2);
        cobros(trabajadores);

    }

    /**
     * Realizamos un "foreach" para recorrer la lista, llamar al método cobrar() de cada objeto
     * (Según la subclase se utilizará un método u otro) y mostrar cada uno por pantalla.
     *
     * @param trabajadores
     */
    private static void cobros(List<Trabajador> trabajadores) {
        for (Trabajador trabajador : trabajadores) {
            System.out.println(trabajador.cobrar());
        }
    }
}
