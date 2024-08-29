import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class disciplinaInterface extends JFrame{ //estende Jframe
 
    public disciplinaInterface() { //interface grafica
        setTitle("Cadastro disciplina"); //titulo da interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 100); //tamanho da interface

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout()); //layout escolhido para melhor organizacao

        JPanel panel = new JPanel();
        add(panel);

        //definicao dos campos textbox
        JTextField txtNome = new JTextField(10); //nome da disciplina
        JTextField txtHoras = new JTextField(10);//horas semanais da dsiciplina

        panel.add(new JTextField("Nome: "));
        panel.add(txtNome);
        panel.add(new JTextField("Quantidade horas semanais: "));
        panel.add(txtHoras);
    

        JButton continuarButton = new JButton("Cadastrar"); //botao para cadastrar
        panel.add(continuarButton);
        JButton FecharButton = new JButton("Fechar");//botao para fechar e voltar ao menu principal
        panel.add(FecharButton);

        panel.setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        continuarButton.addActionListener(new  ActionListener() { //acao ao clicar no botao cadastrar
            public void actionPerformed(ActionEvent e) {
                
                Disciplina disc = new Disciplina(txtNome.getText());//parametro da classe Disciplina
                
                disc.salvar();//vai salvar no arquivo texto
                dispose();//ao cadastrar volta para o menu priuncipal
            }
        });
        FecharButton.addActionListener(new  ActionListener() { //ao clicar volta para menu
            public void actionPerformed(ActionEvent e) {
            
                        dispose();//acao que faz voltar 
        
            }
        });
    }
}