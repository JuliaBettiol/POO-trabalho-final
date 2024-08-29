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

public class detalheAlunoFrame extends JFrame { //que permite ver os alunos cadastrado e seus detalhes

public detalheAlunoFrame() { //interface grafica

    setTitle("Detalhe Aluno"); //titulo para a interface
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 200);//tamanho da interface

    JPanel panel = new JPanel(); //painel que vai aparecer
    add(panel);
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));//layout escolhido foi o Box para melhor organização do conteudo

    JTextArea textAreaAluno = new JTextArea(10,10); //area onde vai imprimir os alunos cadastrados
    JScrollPane scrollPane = new JScrollPane(textAreaAluno);//cria uma rolagem, que ajuda a vizualizar todos os detalhes que imprimir

    panel.add(scrollPane);//

    JButton detalhesButton = new JButton("Detalhes");//botao que ao ser clicado vizualiza os detalhes
    panel.add(detalhesButton);
    panel.add(Box.createRigidArea(new Dimension(0, 5)));//organizacao de local dele

    JButton FecharButton = new JButton("Fechar");//botao que ao ser clicado volta para o menu principal
    panel.add(FecharButton);
    panel.add(Box.createRigidArea(new Dimension(0, 5)));//local dele
    panel.add(new JLabel());

    //panel.setLayout(new GridLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   
    detalhesButton.addActionListener(new  ActionListener() { //acao que vai ocorrer apos o botao ser clicado
        public void actionPerformed(ActionEvent e) {
            try {
                FileReader obter = new FileReader("aluno.txt"); //vai ler o arquivo ja esxistente aluno
                BufferedReader receber = new BufferedReader(obter);
                String frase = receber.readLine();
                while(frase != null) {
                    textAreaAluno.append(frase + "\n");
                    frase = receber.readLine();
                    
                }
        } catch (IOException i) { //caso nao de 
            i.printStackTrace();
        }    
    }
});

FecharButton.addActionListener(new  ActionListener() {//acao que vai ocorrer apos clicar no botao fechar
    public void actionPerformed(ActionEvent e) {
    
                dispose();//volta para o menu principal

    }
});
}
}

