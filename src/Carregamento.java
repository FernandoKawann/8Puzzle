import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Conexao.conexao;

public class Carregamento {
	public static String botao1;
	public static String botao2;
	public static String botao3;
	public static String botao4;
	public static String botao5;
	public static String botao6;
	public static String botao7;
	public static String botao8;
	public static String botao0;
	public static String nroJogadas;
	
	public static void carregarJogo() {
		
		conexao con = new conexao();
		String sql = "SELECT * FROM save WHERE save_id = (SELECT MAX(save_id) FROM save)";
		ResultSet rs = con.executaBusca(sql);
		
		try {
			while(rs.next()) {
				botao1 = (rs.getString("botao1"));
				botao2 = (rs.getString("botao2"));
				botao3 = (rs.getString("botao3"));        //FAZ UM MAPEAMENTO DO ULTIMO REGISTRO ADICIONADO NO BANCO 
				botao4 = (rs.getString("botao4"));
				botao5 = (rs.getString("botao5"));
				botao6 = (rs.getString("botao6"));
				botao7 = (rs.getString("botao7"));
				botao8 = (rs.getString("botao8"));
				botao0 = (rs.getString("botao0"));
				nroJogadas = (String.valueOf(rs.getInt("numero_jogadas")));	
		}JOptionPane.showMessageDialog (null, "Jogo carregado com sucesso!");}
			catch (Exception e) {
			e.printStackTrace();
		}
}
}
