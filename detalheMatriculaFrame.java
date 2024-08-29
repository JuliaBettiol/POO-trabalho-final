import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class detalheMatriculaFrame extends JFrame {//extende o JFrame

    public detalheMatriculaFrame() { //interface grafica

        setTitle("Detalhe matricula");//titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 200);//tamanho
    
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//layput escolhido para melhor organizacao
        
        JTextArea textAreaMatricula = new JTextArea(10,10);//tamanho de onde vai imprimir os detalhes
        JScrollPane scrollPane = new JScrollPane(textAreaMatricula);//rolagem para vizualizar todos
    
        panel.add(scrollPane);
    
        JButton detalhesButton = new JButton("Detalhes");//botao ao ser clicado vai ver todos detalhes de matricula
        panel.add(detalhesButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//localizacao

        JButton FecharButton = new JButton("Fechar");//botao que ao ser clicado volta para menu principal
        panel.add(FecharButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local
        panel.add(new JLabel());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        detalhesButton.addActionListener(new  ActionListener() {//clicar no botao 
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    FileReader obter = new FileReader("matricula.txt");//vai ler o arquivo texto
                    BufferedReader receber = new BufferedReader(obter);
                    String frase = receber.readLine();
                    while(frase != null) {
                        textAreaMatricula.append(frase + "\n");
                        frase = receber.readLine();
                            
                     }
                } catch (IOException i) {
                    i.printStackTrace();
                }    
            }
        });
        FecharButton.addActionListener(new  ActionListener() {//vai voltar para o menu
            public void actionPerformed(ActionEvent e) {
                    
                        dispose();//volta para menu
            }
        });
    
    }
    }
    
    

