package tutosProgra1_Q2_2025.Arrreglos2D.ejemplosTarea;
import java.util.Scanner;

public class bus {
    public persona[][] asientos;

    public bus() {
        this.asientos = new persona[3][3];
    }

    public void rellenarAsientos() {
        Scanner sc = new Scanner(System.in);
        for (int fila = 0; fila < asientos.length; fila++) {




            for (int columna = 0; columna < asientos[fila].length; columna++) {

                System.out.println("Asignando automaticamente: Fila #" + fila + " Columna #" + columna);

                System.out.println("Ingresa tu nombre");
                String nombre = sc.nextLine();

                persona pasajero = new persona(nombre);

                coordsAsiento posicion = new coordsAsiento(fila, columna);

                asientos[fila][columna] = pasajero;

                pasajero.setPosicion(posicion);

            }



        }
        sc.close();
    }

    public void imprimirBus() {
        System.out.print("\nLISTADO DE PASAJEROS\n");
        for (persona[] filas : asientos) {
            for (persona columna : filas) {
                persona persona = columna;
                System.out.println("Fila #" + persona.getPosicion().fila + " Columna #" + persona.getPosicion().columna
                        + " Nombre: " + persona.getNombre()+"\n");

            }
        }

    }

}
