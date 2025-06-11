package tutosProgra1_Q2_2025.Arrreglos2D.GUI;

import javax.swing.JButton;
import java.awt.event.ActionListener;


public class main {
    public static void main(String[] args) {
        

        JButton miBoton = new JButton();


            ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Boton presionado");
                miBoton.setText("Nuevo Texto");
            }
        };

        miBoton.addActionListener(listener);

        

        























        /* 
        //String names[][] = new String[3][3];
        
        
        
        char letras[] = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'
        };


        for(int i=0 ;i<letras.length;i++){
            char letra = letras[i];

            System.out.println("letra: "+letra);
        }


        //for each
        for(char taco : letras){
            System.out.println("letra: "+taco);
        }
            */









        /*

        F1 [1,2,3,4]
        F3 [5,6,7,8]
        

        lesPuedeServir funcionesForEach = new lesPuedeServir();

       // funcionesForEach.imprimir1D();
        funcionesForEach.imprimir2D();
        */
    }
}
