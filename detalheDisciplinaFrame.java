import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class detalheDisciplinaFrame extends JFrame { //extende JFrfame

public detalheDisciplinaFrame() { //inetrafce grafica

    setTitle("Detalhe da Disciplina");//titulo
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 200);//tamanho da interface

    JPanel panel = new JPanel();
    add(panel);
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//layout escolhido

    JTextArea textAreaDisciplina = new JTextArea(10,10);//area onde vai imprimir os detalhes da disciplina
    JScrollPane scrollPane = new JScrollPane(textAreaDisciplina);//via fazer rolar a area para ver todos os detalhes

    panel.add(scrollPane);

    JButton detalhesButton = new JButton("Detalhes"); //botao onde quando clicar vai mostrar os detalhes das disciplinas
    panel.add(detalhesButton);
    panel.add(Box.createRigidArea(new Dimension(0, 5)));//localizacao do botao

    JButton FecharButton = new JButton("Fechar");//botao que quando clicar vai voltar para o menu
    panel.add(FecharButton);
    panel.add(Box.createRigidArea(new Dimension(0, 5)));//local
    panel.add(new JLabel());
    

    //panel.setLayout(new GridLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   
    detalhesButton.addActionListener(new  ActionListener() {//ao clicar vai ler o arquivo
        public void actionPerformed(ActionEvent e) {
            try {
        
                    FileReader obter = new FileReader("disciplina.txt");//ler arquivo ja existente
                    BufferedReader receber = new BufferedReader(obter);
                    String frase = receber.readLine();
                    while(frase != null) {
                        textAreaDisciplina.append(frase + "\n");
                        frase = receber.readLine();
                    }
            } catch (IOException i) {
                i.printStackTrace();
            }    
        }
    });
    FecharButton.addActionListener(new  ActionListener() {//ao clicar no botao
        public void actionPerformed(ActionEvent e) {
        
                    dispose();//vai voltar para o menu principal

        }
    });
}
}
