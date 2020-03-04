/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrar_pares_for;


public class Mostrar_pares_for {

 
    public static void main(String[] args) {
        int i=0, pares=0;
        
        for(i=1; i<=30;i++){
            if(i%2==0)
            pares++;
            System.out.println(i);
                 
            
        }
       System.out.println("la cantidad de pares es:" +pares); 
    }
    
}
