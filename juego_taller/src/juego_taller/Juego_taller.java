/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_taller;

import java.util.Scanner;


public class Juego_taller {
    

    public static void main(String[] args) {
        
        Scanner datos;
        int player =0, dificultad =0, op=0;
        datos = new Scanner(System.in);
        
        System.out.println("------------------ NUMERO DE JUGADORES ------------------");
        System.out.println("selecione la cantidad de jugadores: ");
        System.out.println("minimo [2] y maximo [4]");
        player = datos.nextInt();
        
        System.out.println("---------------------- DIFICULTAD -----------------------");
        System.out.println("nivel basico     [1]");
        System.out.println("nivel intermedio [2]");
        System.out.println("nivel avanzado   [3]");
        op = datos.nextInt();
        
        //areglar cantidad de jugadores cundo es mayor
        if(player>4 || player<2){
            
            while(player<=4 && player>=2){
               System.out.println("----------------------- EROR ------------------------");
               System.out.println("SELECIONE UN NUMERO DE JUGADORES ENTRE [2] Y {4}");
               System.out.println("selecione la cantidad de jugadores: ");
               System.out.println("minimo [2] y maximo [4]");
               player = datos.nextInt();
            }
        }
        
        
   
    }
    
}
