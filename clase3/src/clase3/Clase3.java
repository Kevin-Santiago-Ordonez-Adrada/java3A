/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

public class Clase3 {


    public static void main(String[] args) {
        
        Scanner datos;
        int s =3, b=3;
        datos = new Scanner(System.in);
        //primero
        System.out.println("digite el primer numero: ");
        s = datos.nextInt();
        //segundo
        System.out.println("digite el segundo numero: ");
        b = datos.nextInt();
        
                
        if (s>b){
           System.out.println("el mayor es: "+s);
        }else if(s<b){
           System.out.println("el mayor es: "+b);
        }else{
           System.out.println("los numeros son iguales");
       }
    }
    
}