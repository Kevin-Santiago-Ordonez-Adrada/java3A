// packs de ejecucion
package entrenamiento;

import java.util.Scanner;

public class Entrenamiento {

   
    public static void main(String[] args) {
       //codigo a ejecutar
       Scanner datos;
       int s=7, b =2;
       datos = new Scanner(System.in);
       System.out.println("digite el primer numero: ");
       s = datos.nextInt();
       System.out.println("digite el segundo numero: ");
       b = datos.nextInt();
       System.out.println("respuesta: "+(s+b));
    }
    
}
