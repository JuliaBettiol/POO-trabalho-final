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

public class detalheProfessorFrame extends JFrame { //estencao do JFrame

public detalheProfessorFrame() { //interface grafica

    setTitle("Detalhe Professor");//titulo ta interface
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 200);//tamanho

    JPanel panel = new JPanel();
    add(panel);
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //layout para melhor organizacao

    JTextArea textAreaProfessor = new JTextArea(10,10);//area onde vai imprimior e seu tamanho 
    JScrollPane scrollPane = new JScrollPane(textAreaProfessor);//rolagem para ver tudo que esta na area

    panel.add(scrollPane);

    JButton detalhesButton = new JButton("Detalhes");//botao detalhes para clicar e aparecer todos detalhes na area
    panel.add(detalhesButton);
    panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

    JButton FecharButton = new JButton("Fechar");//botao fechar que ao clicar vai voltar para o menu
    panel.add(FecharButton);
    panel.add(Box.createRigidArea(new Dimension(0, 5)));//menu
    panel.add(new JLabel());

   
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   
    detalhesButton.addActionListener(new  ActionListener() {//acao que faz o botao detalhes
        public void actionPerformed(ActionEvent e) {
            try {

                FileReader obter = new FileReader("professor.txt");//ler o arquivo professor
                BufferedReader receber = new BufferedReader(obter);
                String frase = receber.readLine();
                while(frase != null) {
                    textAreaProfessor.append(frase + "\n");
                    frase = receber.readLine();
                    
                }


        } catch (IOException i) {
            i.printStackTrace();
        }    
    }
});

FecharButton.addActionListener(new  ActionListener() {//acao para o botao fechar
    public void actionPerformed(ActionEvent e) {
            
                dispose();//para voltar ao menu

    }
});

}
}




