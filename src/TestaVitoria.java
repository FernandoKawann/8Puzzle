
public class TestaVitoria {
	
	public String botao1;
	public String botao2;
	public String botao3;
	public String botao4;
	public String botao5;
	public String botao6;
	public String botao7;
	public String botao8;
	public String botao9;
	
	
	


                                    // VERIFICA SE O TABULEIRO ESTÁ DEVIDAMENTE ORDENADO. 
public static boolean testa_vitoria(String P1, String P2, String P3, String P4, String P5, String P6, String P7, String P8, String P9) {
	try {
     if (Integer.valueOf(P1) == 1 && Integer.valueOf(P2) == 2 && Integer.valueOf(P3) == 3 && Integer.valueOf(P4) == 4 &&
    	 Integer.valueOf(P5) == 5 && Integer.valueOf(P6) == 6 && Integer.valueOf(P7) == 7 && Integer.valueOf(P8) == 8 && P9.isEmpty()){
    	return true;}	    
	    }
	catch (Exception e) {
		
	}
	return false;
	}			
	




}



