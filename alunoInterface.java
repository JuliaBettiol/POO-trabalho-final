import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class alunoInterface extends JFrame { //extencao do JFrame

    public alunoInterface() { //interface grafica
        setTitle("Cadastro Aluno"); //titulo da interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 100);//tamanho da interface

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());//layout da interface

        JPanel panel = new JPanel();
        add(panel); //para aparecer no apinel

        JTextField txtNome = new JTextField(10); //espaço onde a pessoa vai escrever seu nome e tamanho do espaço
        JTextField txtIdentificador = new JTextField(10);//espaço onde vai escrever o identificador e tamanho do espaço
        JTextField txtCurso = new JTextField(10);//espaço onde vai escrever o curso e o tamanho do seu espaço
        JTextField txtSemestre = new JTextField(10);//espaó onde vai escrever o semestre e tamanho do seu espaço 

        panel.add(new JTextField("Nome: ")); //Vai imprimir na tela para a pessoa identificador onde tem que escrever o nome
        panel.add(txtNome);
        panel.add(new JTextField("Identificador: "));//onde escreve o identificador
        panel.add(txtIdentificador);
        panel.add(new JTextField("Curso: "));//onde escreve o curso
        panel.add(txtCurso);
        panel.add(new JTextField("Semestre: "));//onde escreve o semestre
        panel.add(txtSemestre);
       
        JButton continuarButton = new JButton("Cadastrar");//botao criado para clicar e cadastrar
        panel.add(continuarButton);
        JButton FecharButton = new JButton("Fechar");//botao criado para voltar ao menu principal
        panel.add(FecharButton);

        panel.setLayout(new FlowLayout());//layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        continuarButton.addActionListener(new  ActionListener() { //acao que vai ocorrer quando o botao continuar for clicado
            public void actionPerformed(ActionEvent e) {

            //vai chamar a classe aluno e chamar o metodo para salvar no arquivo
            Aluno alun = new Aluno(txtNome.getText(), Integer.parseInt(txtIdentificador.getText()),txtCurso.getText(), Integer.parseInt(txtSemestre.getText()));//parametros 
            alun.salvar(); //vai salvar
            dispose(); //apos salvar vai para o menu principal
            }
        });
        FecharButton.addActionListener(new  ActionListener() { //acao que vai ocorrer quando boato fechar for acionado
            public void actionPerformed(ActionEvent e) {
            
                        dispose(); //vai voltar para o menu principal
        
            }
        });
    }
}