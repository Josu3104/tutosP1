package tutosProgra1_Q2_2025.Arrreglos2D.ejemplosTuto;

public class funcs {

    // modificador acceso - tipo de Retorno - nombre(params){}
    final int edad = 20;

    public void saludar(String nombre) {
        nombre += " Casanova";

        String parte2 = terminarSaludo(nombre);
        System.out.println("Hola, bienvenido " + parte2);

    }

    private String terminarSaludo(String nombre) {

        return nombre + " Mi edad es:" + edad;

    }

}
