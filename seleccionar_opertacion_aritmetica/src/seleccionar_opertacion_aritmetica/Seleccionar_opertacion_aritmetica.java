/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionar_opertacion_aritmetica;

import java.util.Scanner;

public class Seleccionar_opertacion_aritmetica {


    public static void main(String[] args) {
        Scanner datos;
        int s=0, b=0, op=0;   
        datos = new Scanner(System.in);
        
            System.out.println("--------------DATOS---------------");
            System.out.println("digite el primer numero: ");
            s = datos.nextInt();
            System.out.println("digite el segundo numero: ");
            b = datos.nextInt();
            System.out.println("-------SELECIONE OPERACION--------");
            System.out.println("para suma selecionar 1: ");
            System.out.println("para resta selecionar 2: ");
            System.out.println("para multiplicacion selecionar 3: ");
            System.out.println("para divicion selecionar 4: ");
            System.out.println("que operacion desea realizar: ");
            op = datos.nextInt();
            if(op==1){ 
                System.out.println("-----------OPERACION----------");
                System.out.println("la suma de "+s+" y "+b+" 3es: "+(s+b));
            }else if(op==2){
                System.out.println("-----------OPERACION----------");
                System.out.println("la resta de "+s+" y "+b+" es: "+(s-b));
            }else if(op==3){
                System.out.println("-----------OPERACION----------");
                System.out.println("la multiplicacion de "+s+" y "+b+" es: "+(s*b));
            }else if(op==4){
                System.out.println("-----------OPERACION----------");
                System.out.println("la divicion de "+s+" y "+b+" es: "+(s/b));
            }else{
                System.out.println("SELECIONE UNA OPERACION VALIDA");
            }
        
    }
    
}
