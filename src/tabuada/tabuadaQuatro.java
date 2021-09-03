package tabuada;

import java.util.Scanner;

public class tabuadaQuatro {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
          int multiplicando, repeticao = 9, contador = 0;
                    
          System.out.print("Tabuada do: ");
          multiplicando = leitor.nextInt();
          System.out.println();
          
          while (contador <= repeticao) {
        	  
                   contador = contador + 1; 
                   
                       	System.out.println(multiplicando + " x " + contador + " = " + (contador * multiplicando));	  
        		  
       
        	  
        	  
        	  
          }
          
		
		
 }

}	