package tutosProgra1_Q2_2025.Arrreglos2D.ejemplosTarea;
public class persona {
    private String nombre;
    private coordsAsiento posicion;

    public persona(String nombre) {
        this.nombre = nombre;
    }

    public coordsAsiento getPosicion() {
        return posicion;
    }

    public void setPosicion(coordsAsiento pos){
        this.posicion = pos;
    }

    public String  getNombre(){
        return nombre;
    }

    

}
