/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_aritmeticas;
// librerias
import java.util.Scanner;

public class Operaciones_aritmeticas {

    public static void main(String[] args) { 
       //operaciones ligicas 
        Scanner datos;
        int s=0, b=0;
        datos = new Scanner(System.in);
        
            System.out.println("--------------DATOS---------------");
            System.out.println("digite el primer numero: ");
            s = datos.nextInt();
            System.out.println("digite el segundo numero: ");
            b = datos.nextInt();
            
                System.out.println("-----------OPERACIONES------------");
                System.out.println("la suma de es: "+(s+b));
                System.out.println("la resta es: "+(s-b));
                System.out.println("la multiplicacion es: "+(s*b));
                System.out.println("la resta es: "+(s/b));
    }
    
}
