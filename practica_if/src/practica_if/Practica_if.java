/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_if;

import java.util.Scanner;

/**
 *
 * @author Aula1
 */
public class Practica_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner datos;
        int n1 =0, n2=0, op=0, res=0;
        datos = new Scanner(System.in);
        
            System.out.println("--------------DATOS---------------");
            System.out.println("digite el primer numero: ");
            n1 = datos.nextInt();
            System.out.println("digite el segundo numero: ");
            n2 = datos.nextInt();
            
                System.out.println("-------SELECIONE OPERACION--------");
                System.out.println("para suma selecionar 1: ");
                System.out.println("para resta selecionar 2: ");
                System.out.println("para multiplicacion selecionar 3: ");
                System.out.println("para divicion selecionar 4: ");
                System.out.println("que operacion desea realizar: ");
                op = datos.nextInt();
                
                    switch (op){
                        case 1:
                            res= n1+n2;
                            break;
                        case 2:
                            res= n1-n2;
                            break;
                        case 3:
                            res= n1*n2;
                            break;
                        case 4:
                            res= n1/n2;
                            break;  
                        default:
                            System.out.println("SELECIONE UNA OPERACION VALIDA");
                            break;
                    }
        if (op<=4){
        System.out.println("-------- RESULTADO--------");
        System.out.println("la operacion es "+ res);
        }

    }
    
}

