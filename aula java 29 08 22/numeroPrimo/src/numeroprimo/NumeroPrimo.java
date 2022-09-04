package numeroprimo;

import java.util.Random;

public class NumeroPrimo {
    public static void main(String[] args) {
        Random random = new Random();
        int numeros[] = new int[10];
         for (int i=0; i<numeros.length; i++) {
             numeros[i] = 10 + random.nextInt(40);
             for(int j = 2; j < numeros[i]; j++ ){
                 if(numeros[i]% j ==0){
                     System.out.println(numeros[i]+ " nao é primo");
                 }     
                 else {System.out.println(numeros[i]+ " é primo");
                 }
                 }                
             }          
        }
    }
