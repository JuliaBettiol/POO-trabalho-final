import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class professorInterface extends JFrame { //estencao JFrame

    public professorInterface() { //interface grafica
        setTitle("Cadastro Professor");//titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 100);//tamanho

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());//layout

        JPanel panel = new JPanel();
        add(panel);

        JTextField txtNome = new JTextField(10);//para escrever nome do professor
        JTextField txtIdentificador = new JTextField(10);//identificador do professor
        JTextField txtCargaHoraria = new JTextField(10);//carga horaria semanal
       

        panel.add(new JTextField("Nome: "));
        panel.add(txtNome);
        panel.add(new JTextField("Identificador: "));
        panel.add(txtIdentificador);
        panel.add(new JTextField("Carga Horária: "));
        panel.add(txtCargaHoraria);
        
       
        JButton continuarButton = new JButton("Cadastrar");//botao para cadastrar
        panel.add(continuarButton);
        JButton FecharButton = new JButton("Fechar");//botao para voltar
        panel.add(FecharButton);

        panel.setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        continuarButton.addActionListener(new  ActionListener() {//ao clicar vai executar isso
            public void actionPerformed(ActionEvent e) {

            //vai salvar no arquivo texto de professor usanso o metodo salvar
            Professor prof = new Professor(txtNome.getText(), Integer.parseInt(txtIdentificador.getText()), Integer.parseInt(txtCargaHoraria.getText()));
            prof.salvar();
            dispose(); 
            }
        });
        FecharButton.addActionListener(new  ActionListener() {//vai voltar para o menu principal, isso possibilita o usuario voltar para o menu e nao precise fechar todo o programa
            public void actionPerformed(ActionEvent e) {
            
                        dispose();//acao que volta para o menu
        
            }
        });
    }
}