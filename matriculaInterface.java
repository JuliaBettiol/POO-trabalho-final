import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class matriculaInterface extends JFrame{ //estencao do JFrame

    ArrayList<String> lista = new ArrayList();//array list da linha
    
    public matriculaInterface() { //interface grafica

        setTitle("Matricula Disciplina");//titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 200);//tamanho da interface

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//layout escolhido

        JComboBox jComboBox1 = new javax.swing.JComboBox();//combo box 1 que vai armazenar os alunos
        JComboBox jComboBox2 = new javax.swing.JComboBox();//combo box 2 que vai armazenar as disciplinas

        panel.add(new JLabel("Aluno:"));
        panel.add(jComboBox1);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        panel.add(new JLabel("Disciplina:"));
        panel.add(jComboBox2);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        JButton matricularButton = new JButton("Matricular");//botao para se matricular
        panel.add(matricularButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        JButton FecharButton = new JButton("Fechar");//botao para fechar
        panel.add(FecharButton);    
        
        
       try {  //para buscar o arquivo de aluno
             FileReader obter = new FileReader("aluno.txt");//para ler o arquivo aluno
             BufferedReader receber = new BufferedReader(obter);
             String linha = receber.readLine();
               
               while(linha != null){
           
                   jComboBox1.addItem(linha);//e soltar na linha do combo box
                   linha = receber.readLine();

               }  
     
               receber.close();  
                 
           } catch (IOException e) {  
               System.err.printf("Erro na leitura do Arquivo: %s.\n",   //erro
                       e.getMessage());  
           }  

           try {  //para buscar o arquivo de disciplina
            FileReader obter = new FileReader("disciplina.txt");//vai ler o arquivo
            BufferedReader receber = new BufferedReader(obter);
            String linha = receber.readLine();
              
              while(linha != null){
          
                  jComboBox2.addItem(linha);//vai soltar na linha do combo box
                  linha = receber.readLine();

              }  
    
              receber.close();  
                
          } catch (IOException e) {  
              System.err.printf("Erro na leitura do Arquivo: %s.\n",   //erro
                      e.getMessage());  
          }  
          
          matricularButton.addActionListener((ActionListener) new  ActionListener() {//ao clicar vai se matricular
            public void actionPerformed(ActionEvent e) {
                
                Matricula matriculas = new Matricula(jComboBox1.getSelectedItem().toString(), jComboBox2.getSelectedItem().toString());
                //vai salvar no arquivo texto de matricula
                matriculas.salvar();
                dispose();
            }
        });
        FecharButton.addActionListener(new  ActionListener() {//vai voltar para o menu principal
            public void actionPerformed(ActionEvent e) {
            
                        dispose();
        
            }
        });
    }
}