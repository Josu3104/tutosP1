package tutosProgra1_Q2_2025.Arrreglos2D.ejemplosTarea;
public class objetos {

    public int year;
    public double kilometraje;
    public String marca;
    private int codigoPrivado;
    private final int identificador = 545455446;

    public objetos(int year, double kilometraje) {
        //Codigo que se ejecuta al instanciar un objeto a partir de esta clase/plantilla
        
        this.year = year;
        this.kilometraje = kilometraje;

        System.out.println("Soy un carro");
        System.out.println("Mi año de lanzamiento es: " + year);
        System.out.println("Mi kilometraje es: " + kilometraje + "km");
    }

    // funcion

}
