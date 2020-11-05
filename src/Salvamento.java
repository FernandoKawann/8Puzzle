
import javax.swing.JOptionPane;

import Conexao.conexao;
public class Salvamento {

	public static void salvarJogo(String botao1,String botao2,String botao3,String botao4,String botao5,String botao6,String botao7,String botao8,String botao0,String nrJogadas) {
		
		
		
		//PEGA COMO PARÂMETRO, O ESTADO DE CADA PEÇA DO TABULEIRO E A PONTUAÇÃO, E SALVA NO BANCO DE DADOS.
	conexao con = new conexao();
	String sql = "INSERT INTO save (save_id,botao1,botao2,botao3,botao4,botao5,botao6,botao7,botao8,botao0,numero_jogadas)\r\n" + 
			"VALUES (default,'"+ botao1 +"','"+botao2+"','"+botao3+"','"+botao4+"','"+botao5+"','"+ botao6+"','"+botao7+"','"+botao8+"','"+botao0+"','"+nrJogadas+"');";
	 int res = con.executaSQL(sql);
     if (res >0) {
    	 JOptionPane.showMessageDialog (null, "Jogo salvo com sucesso!");
     }else { 
      System.out.println("Erro");					 	 
            }
		
		
		
	}
	
	
	
	
}
