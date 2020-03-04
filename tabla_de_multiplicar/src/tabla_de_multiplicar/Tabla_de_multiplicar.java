
package tabla_de_multiplicar;

import java.util.Scanner;


public class Tabla_de_multiplicar {


    public static void main(String[] args) {
        Scanner datos;
        int num=0, limI=0, limS=0,i=0;
        datos = new Scanner(System.in);
        
        System.out.println("digite el numero a multiplicar: ");
        num = datos.nextInt();
        System.out.println("digite el limite inferior: ");
        limI = datos.nextInt();
        System.out.println("digite el limite superiot: ");
        limS = datos.nextInt();
                
        if(limI>limS){
            while(limI>limS){
                System.out.println("--------------------------EROR--------------------------");
                System.out.println("EL LIMITE ENFERIOR NO PUEDE SER MAYOR AL LIMITE SUPERIOR");
            
                System.out.println("digite el limite inferior: ");
                limI = datos.nextInt();
                System.out.println("digite el limite superiot: ");
                 limS = datos.nextInt();
            }
        }    
            System.out.println("------ TABLA DEMULTIPLICAR DE " +num+ " -------");
            for(i=limI; i<=limS; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
           

            }           
    }
    
}
