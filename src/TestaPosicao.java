
public class TestaPosicao {
public static String botao1;
public static String botao2;
public static String botao3;
public static String botao4;
public static String botao5;
public static String botao6;
public static String botao7;
public static String botao8;
public static String botao0;
public static int nroJogadas;

public static void mapeiaTabuleiro(String bt1,String bt2,String bt3,String bt4,String bt5,String bt6,String bt7,String bt8,String bt0,int nrojogadas) {
	botao1 = bt1;
	botao2 = bt2;
	botao3 = bt3;
	botao4 = bt4;
	botao5 = bt5;
	botao6 = bt6;
	botao7 = bt7;
	botao8 = bt8;
	botao0 = bt0;
	nroJogadas = nrojogadas;
}

public static void incrementaNroJogadas() {          //INCREMENTA A PONTUAÇÃO EM CADA JOGADA.				
	nroJogadas = Integer.valueOf(nroJogadas+1);
}


public static void testaPosicao1() {
	
		if (botao2.isEmpty()) {
			botao2 = botao1; 			
			botao1 = "";                                       	//CADA BOTÃO TEM SEU COMPORTAMENTO
			incrementaNroJogadas();
					
		}else if (botao4.isEmpty()) {
			botao4 = botao1; 			//        OS BOTÕES SÓ REALIZAM A TROCA DE LUGAR SE O BOTÃO VAZIO ESTÁ ADJACENTE.
			botao1 = "";
			incrementaNroJogadas();
		}
		
	}
	
	public static void testaPosicao2() {
		
		if (botao1.isEmpty()) {
			botao1 = botao2;			
			botao2 = "";
			incrementaNroJogadas();
					
		}else if (botao3.isEmpty()) {
			botao3 = botao2;		
			botao2 = "";	
			incrementaNroJogadas();
			
		}else if (botao5.isEmpty()) {
			botao5 = botao2;
			
			botao2 = "";
			
	}
		
		
} public static void testaPosicao3() {
	
	if (botao2.isEmpty()) {
		botao2 = botao3;		
		botao3 = "";
		incrementaNroJogadas();
				
	}else if (botao6.isEmpty()) {
		botao6 = botao3;		
		botao3 = "";
		incrementaNroJogadas();
	}
	}
public static void testaPosicao4() {
	
	if (botao1.isEmpty()) {
		botao1 = botao4;		
		botao4 = "";
		incrementaNroJogadas();	
				
	}else if (botao5.isEmpty()) {
		botao5 = botao4;		
		botao4 = "";
		incrementaNroJogadas();	
		
	}else if (botao7.isEmpty()) {
		botao7 = botao4;		
		botao4 = "";
		incrementaNroJogadas();	
		
	}
	}
public static void testaPosicao5() {
	
	if (botao4.isEmpty()) {
		botao4 = botao5;		
		botao5 = "";	
		incrementaNroJogadas();	
		
	}else if (botao2.isEmpty()) {
		botao2 = botao5;		
		botao5 = "";
		incrementaNroJogadas();	
		
	}else if (botao6.isEmpty()) {
		botao6 = botao5;		
		botao5 = "";		
		incrementaNroJogadas();	
		
	}else if (botao8.isEmpty()) {
		botao8 = botao5;	
		botao5 = "";
		incrementaNroJogadas();	
	}
	}
	
	public static void testaPosicao6() {
		
		if (botao3.isEmpty()) {
			botao3 = botao6;	
			botao6 = "";
			incrementaNroJogadas();	
			
		}else if (botao5.isEmpty()) {
			System.out.println("deu");
			botao5 = botao6;
			botao6 = "";	
			incrementaNroJogadas();	
			
		}else if (botao0.isEmpty()) {
			
			botao0 = botao6;			
			botao6 = "";
			incrementaNroJogadas();		
}
} 
	
	public static void testaPosicao7() {
		
		if (botao4.isEmpty()) {
			botao4 = botao7;
			botao7 = "";	
			incrementaNroJogadas();	
			
		}else if (botao8.isEmpty()) {
			botao8 = botao7;
			botao7 = "";
			incrementaNroJogadas();	
		}
		}
	
	public static void testaPosicao8() {
		
		if (botao7.isEmpty()) {
			botao7 = botao8;
			botao8 = "";			
			incrementaNroJogadas();	
			
		}else if (botao5.isEmpty()) {
			botao5 = botao8;
			botao8 = "";	
			incrementaNroJogadas();	
			
		}else if (botao0.isEmpty()) {
			botao0 = botao8;
			botao8 = "";	
			incrementaNroJogadas();	
			
		}
		}
	public static void testaPosicao0() {
		
		if (botao8.isEmpty()) {			
			botao8 = botao0;
			botao0 = "";
			incrementaNroJogadas();	
			
		}else if (botao6.isEmpty()) {
			botao6 = botao0;			
			botao0 = "";	
			incrementaNroJogadas();	
		}
		}
	
	
	
}
