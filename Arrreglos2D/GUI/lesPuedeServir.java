package tutosProgra1_Q2_2025.Arrreglos2D.GUI;

import java.util.Scanner;

public class lesPuedeServir {
    String[] frutas = { "Manzana", "Banana", "Uva", "Mango" };

    String[][] tablero = 
    { {"X", "O", "X"}, {"O", "X", "O"}, {"X", "X", "O"} };


    public void imprimir1D() {
        for (String palabra : frutas) {
            System.out.println("Fruta: "+palabra);
        }
    }

    public void imprimir2D(){
        for(String[] currrentArray: tablero){
            for(String currentCol: currrentArray){
                System.out.print(currentCol+" ");
            
            }
            System.out.println("");
        }
    }

}