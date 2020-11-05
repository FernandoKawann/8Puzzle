import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Conexao.conexao;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
/*                    
 
                                                                            J O G O    D O   O I T O
          
           
                                -FERNANDO KAWANN SILVEIRA 
                                -ATIVIDADES PRÁTICAS SUPERVISIONADAS 
                                -4 SEMESTRE 
                                -LINGUAGEM DE PROGRAMAÇÃO ORIENTADA A OBJETOS      
                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                
                                                                                                                                                      */
public class JogoDoOito  {
	
/*                             -CRIAÇÃO DOS BOTÕES PRO TABULEIRO;
	                           -MENU DE LOAD/SAVE/;
	                           -VARIÁVEL PRA GUARDAR A PONTUAÇÃO                                                                                      */
	private JFrame frmJOG; 
	private JTextField txtNroJogadas;
	JButton Btn1 = new JButton("1");         
	JButton Btn2 = new JButton("2");
	JButton Btn3 = new JButton("3");
	JButton Btn4 = new JButton("4");
	JButton Btn5 = new JButton("5");
	JButton Btn6 = new JButton("6");
	JButton Btn7 = new JButton("7");
	JButton Btn8 = new JButton("8");
	JButton Btn0 = new JButton("");	
	private final JButton btnOpcoes = new JButton("Op\u00E7\u00F5es");
	JButton BtnTestaVitoria = new JButton("Game Over?");
	JButton BtnNovoJogo = new JButton("Novo Jogo");
	JButton BtnSalvar = new JButton("Salvar Jogo");
	private final JButton btnCarregar = new JButton("Carregar Jogo");
	
	//                                       -                        -                            -MAIN-                                    -                                -
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoDoOito window = new JogoDoOito();                   //INICIAMOS A JANELA
					window.frmJOG.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JogoDoOito() {                                              
		initialize();                                  
	}

	
	private void initialize() {                                    //INSERIMOS OS COMPONENTES NA JANELA
		frmJOG = new JFrame();
		frmJOG.setTitle("J O G O   D O    O I T O");
		frmJOG.setBounds(100, 100, 450, 322);
		frmJOG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJOG.getContentPane().setLayout(null);
		frmJOG.getContentPane().add(Btn1);
		frmJOG.getContentPane().add(Btn2);
		frmJOG.getContentPane().add(Btn3);	
		frmJOG.getContentPane().add(Btn4);	
		frmJOG.getContentPane().add(Btn5);	
		frmJOG.getContentPane().add(Btn6);	
		frmJOG.getContentPane().add(Btn7);	
		frmJOG.getContentPane().add(Btn8);	
		frmJOG.getContentPane().add(Btn0);
		frmJOG.getContentPane().add(BtnTestaVitoria);
		frmJOG.getContentPane().add(btnOpcoes);
		
		
		Btn1.setBounds(1, 33, 144, 84);
		Btn1.addActionListener(new ActionListener() {              //CADA BOTÃO APLICA A FUNÇÃO DE MAPEAMENTO DO TABULEIRO, QUE ENVIA PRA CLASSE DE TESTE DE POSIÇÃO
			public void actionPerformed(ActionEvent e) {
				TestaPosicao.mapeiaTabuleiro(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),Btn5.getText(),Btn6.getText(),
						Btn7.getText(),Btn8.getText(),Btn0.getText(),Integer.valueOf(txtNroJogadas.getText()));
				
				TestaPosicao.testaPosicao1();     //COMO CADA BOTÃO DO TABULEIRO POSSUI UM COMPORTAMENTO, ENTÃO CADA UM TEM A SUA FUNÇÃO DE TESTE DE POSIÇÃO. 
				pintaTabuleiro();                 //FUNÇÃO PARA RETORNAR OS DADOS DA CLASSE TestaPosicao E APLICAR NOS BOTÕES DA TELA. 
				          
			} } );
		
			
		Btn2.setBounds(145, 33, 144, 84);
		Btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestaPosicao.mapeiaTabuleiro(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),Btn5.getText(),Btn6.getText(),
						Btn7.getText(),Btn8.getText(),Btn0.getText(),Integer.valueOf(txtNroJogadas.getText()));
				TestaPosicao.testaPosicao2();
				pintaTabuleiro();
				
			}});
		
				
		
		Btn3.setBounds(289, 33, 144, 84);
		Btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestaPosicao.mapeiaTabuleiro(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),Btn5.getText(),Btn6.getText(),
						Btn7.getText(),Btn8.getText(),Btn0.getText(),Integer.valueOf(txtNroJogadas.getText()));
				TestaPosicao.testaPosicao3();
				pintaTabuleiro();
				
			}});
		
		
		Btn4.setBounds(1, 117, 144, 84);
		Btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestaPosicao.mapeiaTabuleiro(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),Btn5.getText(),Btn6.getText(),
						Btn7.getText(),Btn8.getText(),Btn0.getText(),Integer.valueOf(txtNroJogadas.getText()));
				TestaPosicao.testaPosicao4();
				pintaTabuleiro();
				
			}});
		
		
		Btn5.setBounds(145, 117, 144, 84);
		Btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestaPosicao.mapeiaTabuleiro(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),Btn5.getText(),Btn6.getText(),
						Btn7.getText(),Btn8.getText(),Btn0.getText(),Integer.valueOf(txtNroJogadas.getText()));
				TestaPosicao.testaPosicao5();
				pintaTabuleiro();
				
			}});
			
		Btn6.setBounds(289, 117, 144, 84);
		Btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestaPosicao.mapeiaTabuleiro(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),Btn5.getText(),Btn6.getText(),
						Btn7.getText(),Btn8.getText(),Btn0.getText(),Integer.valueOf(txtNroJogadas.getText()));
				TestaPosicao.testaPosicao6();
				pintaTabuleiro();
				
			}});
				
		Btn7.setBounds(1, 199, 144, 84);
		Btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestaPosicao.mapeiaTabuleiro(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),Btn5.getText(),Btn6.getText(),
						Btn7.getText(),Btn8.getText(),Btn0.getText(),Integer.valueOf(txtNroJogadas.getText()));
				TestaPosicao.testaPosicao7();
				pintaTabuleiro();
				
			}});
					
		Btn8.setBounds(145, 199, 144, 84);
		Btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestaPosicao.mapeiaTabuleiro(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),Btn5.getText(),Btn6.getText(),
						Btn7.getText(),Btn8.getText(),Btn0.getText(),Integer.valueOf(txtNroJogadas.getText()));
				TestaPosicao.testaPosicao8();
				pintaTabuleiro();
				
			}});
					
		Btn0.setBounds(289, 199, 144, 84);
		Btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestaPosicao.mapeiaTabuleiro(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),Btn5.getText(),Btn6.getText(),
						Btn7.getText(),Btn8.getText(),Btn0.getText(),Integer.valueOf(txtNroJogadas.getText()));
				TestaPosicao.testaPosicao0();
				pintaTabuleiro();
				
			}});
				
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(frmJOG.getContentPane(), popupMenu_1);                
		popupMenu_1.add(BtnSalvar);
		popupMenu_1.add(btnCarregar);
		popupMenu_1.setBounds(1, -1, 54, 16);		
		popupMenu_1.add(BtnNovoJogo); 
		
		btnOpcoes.setBounds(1, -1, 89, 23);
		btnOpcoes.addActionListener(new ActionListener() {                      //BOTÃO PARA EXIBIR AS OPÇÕES DO MENU DE LOAD/SAVE
			public void actionPerformed(ActionEvent e) {
				popupMenu_1.show(btnOpcoes,btnOpcoes.getWidth()/2, btnOpcoes.getHeight()/2);
			}
		});
		
		
		
		
		                                                      //BOTÕES DO MENU DE LOAD/SAVE
		BtnNovoJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		//      O BOTÃO DE NOVO JOGO EXECUTA A FUNÇÃO novoJogo, QUE EMBARALHA UM ARRAY NA CLASSE NovoJogo.				                                                    
				novoJogo();                                     //         ESSE ARRAY É RETORNADO PRA CÁ, ONDE DEFINE O TEXTO DE CADA BOTÃO NO TABULEIRO;  			
				}});	
				
		btnCarregar.addActionListener(new ActionListener() {        
			public void actionPerformed(ActionEvent e) {	//             O BOTÃO DE CARREGAR EXECUTA A FUNÇÃO carregarTabuleiro,
				carregarTabuleiro();         //             QUE REALIZA UMA CONEXÃO COM O BANCO DE DADOS, RETORNANDO OS DADOS DO ÚLTIMO SAVE REGISTRADO.						                       					
			}});
				
		BtnSalvar.addActionListener(new ActionListener() {//              O BOTÃO SALVAR COLETA O ESTADO DE CADA PEÇA DO TABULEIRO, 
			public void actionPerformed(ActionEvent e) {	
				Salvamento.salvarJogo(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),Btn5.getText(),Btn6.getText(),Btn7.getText(),
						              Btn8.getText(), Btn0.getText(),txtNroJogadas.getText());				
			}});
		
		
		
		                                                                          //BOTÃO PARA TESTAR A VITÓRIA/GAME OVER
		BtnTestaVitoria.setBounds(145, -1, 144, 23);
		BtnTestaVitoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if	(TestaVitoria.testa_vitoria(Btn1.getText(),Btn2.getText(),Btn3.getText(),Btn4.getText(),        
					Btn5.getText(),Btn6.getText(),Btn7.getText(),Btn8.getText(),Btn0.getText())) {
				JOptionPane.showMessageDialog (null, "Parabéns, você venceu o jogo!");
				txtNroJogadas.setText("0");
			}
			else { JOptionPane.showMessageDialog (null, "O jogo ainda não acabou!");
			}
			
			
			}
		});
		
				                          //          CAMPO E LABEL DA PONTUAÇÃO 
		txtNroJogadas = new JTextField();
		frmJOG.getContentPane().add(txtNroJogadas);
		txtNroJogadas.setText("0");
		txtNroJogadas.setEditable(false);
		txtNroJogadas.setBounds(402, 0, 31, 20);		
		txtNroJogadas.setColumns(10);
				
		JLabel lblNroJogadas = new JLabel("N\u00B0 de jogadas:");
		lblNroJogadas.setBounds(299, 3, 104, 14);
		frmJOG.getContentPane().add(lblNroJogadas);	
	}

	
	

		

	                                                // FUNÇÕES DO PROGRAMA //
	
	
	
	public void pintaTabuleiro() { //FUNÇÃO PARA RETORNAR OS DADOS DA CLASSE TestaPosicao E APLICAR NOS BOTÕES DA TELA. 
		Btn1.setText(TestaPosicao.botao1);		
		Btn2.setText(TestaPosicao.botao2);
		Btn3.setText(TestaPosicao.botao3);
		Btn4.setText(TestaPosicao.botao4);
		Btn5.setText(TestaPosicao.botao5);
		Btn6.setText(TestaPosicao.botao6);
		Btn7.setText(TestaPosicao.botao7);
		Btn8.setText(TestaPosicao.botao8);
		Btn0.setText(TestaPosicao.botao0);
		txtNroJogadas.setText(String.valueOf(TestaPosicao.nroJogadas));
	}
	
	
	
	public void novoJogo() {//EXECUTA A FUNÇÃO novoJogo, QUE EMBARALHA UM ARRAY NA CLASSE NovoJogo.		                                                    
		                   // ESSE ARRAY É RETORNADO PRA CÁ, ONDE DEFINE O TEXTO DE CADA BOTÃO NO TABULEIRO;  
		NovoJogo.embaralhaArray();
		Btn1.setText(String.valueOf(NovoJogo.array[1]));		
		Btn2.setText(String.valueOf(NovoJogo.array[2]));
		Btn3.setText(String.valueOf(NovoJogo.array[3]));
		Btn4.setText(String.valueOf(NovoJogo.array[4]));
		Btn5.setText(String.valueOf(NovoJogo.array[5]));
		Btn6.setText(String.valueOf(NovoJogo.array[6]));
		Btn7.setText(String.valueOf(NovoJogo.array[7]));
		Btn8.setText(String.valueOf(NovoJogo.array[8]));
		Btn0.setText("");
		txtNroJogadas.setText("0");
		JOptionPane.showMessageDialog (null, "Novo jogo iniciado, boa sorte!");
		
	}
	public void carregarTabuleiro() {// O BOTÃO DE CARREGAR EXECUTA A FUNÇÃO carregarTabuleiro,
		                            //  QUE REALIZA UMA CONEXÃO COM O BANCO DE DADOS, RETORNANDO OS DADOS DO ÚLTIMO SAVE REGISTRADO
		Carregamento.carregarJogo();    
		Btn1.setText(Carregamento.botao1);		
		Btn2.setText(Carregamento.botao2);
		Btn3.setText(Carregamento.botao3);
		Btn4.setText(Carregamento.botao4);
		Btn5.setText(Carregamento.botao5);
		Btn6.setText(Carregamento.botao6);
		Btn7.setText(Carregamento.botao7);
		Btn8.setText(Carregamento.botao8);
		Btn0.setText(Carregamento.botao0);
		txtNroJogadas.setText(Carregamento.nroJogadas);
	}
	
	
	
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
