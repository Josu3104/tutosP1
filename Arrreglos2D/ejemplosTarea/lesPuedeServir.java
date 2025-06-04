package tutosProgra1_Q2_2025.Arrreglos2D.ejemplosTarea;
import java.util.Scanner;

public class lesPuedeServir {

    public class arreglos {


        public static void printForeach(String[][] data) {
            
            for (String[] row : data) { //Investiguen foreach para entender esta sintaxis
                for (String col : row) {
                    System.out.println(col);
                }
            }
        }

        public static void manageInput(String[][] arrayToFill){
            Scanner lea = new Scanner(System.in);
            
            for(int i=0; i<arrayToFill.length; i++){
                for(int j=0; j<arrayToFill[i].length; j++){
                    System.out.println("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                    arrayToFill[i][j] = lea.nextLine();
                }
            }
            lea.close();
            
        }
    }


}