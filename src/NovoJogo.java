import java.lang.reflect.Array;
import java.util.Random;

public class NovoJogo {
public static int[] array = new int[9];

	
	
	public static void embaralhaArray() {
		array[1]=1;
		array[2]=2;
		array[3]=3;
		array[4]=4;
		array[5]=5;
		array[6]=6;
		array[7]=7;
		array[8]=8;
		array[0]=0;
		
		Random aleatorio = new Random();

		 	int i = 0;
		    while (i < array.length) {
		    	array[i] = aleatorio.nextInt(9);
		    	boolean colide = false;         // CRIA UM ARRAY DE NÚMEROS NÃO REPETIDOS
		    	for (int j = 0; j < i; j++){	
		    		if (array[i] == array[j]) {
		    			colide = true;
		    			break;
		    		}		    				    		
		    	}
		    	if (!colide){
		            i++;
		        }		    			
	}
		    for (int x=0; x<9;  x++) { 
	               if(array[x] == 0){       //SELECIONA 0 COMO O ÚLTIMO ELEMENTO DO ARRAY
	            	 array[x] = array[0];
	            	 array[0] = 0; 
	            	 
	               } 	               
		    }
		    
		   
		
		
		
		}}
