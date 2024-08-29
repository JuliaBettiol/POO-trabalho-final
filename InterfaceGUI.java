import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceGUI extends JFrame { //classe principal
    public static void main(String[] args) {

        // Cria a janela principal
        JFrame frame = new JFrame("Sistema Escolar"); //titulo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350); //tamanho

        // Adiciona um painel à janela principal
        JPanel panel = new JPanel();
        //frame.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton matriculaButton = new JButton("Matricular em uma disicplina"); //botao para se matricular em uma disciplina
        panel.add(matriculaButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        JButton detalheMatriculaButton = new JButton("Detalhes matricula");//botao para ver detalhes de matricular 
        panel.add(detalheMatriculaButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        JButton disciplinaButton = new JButton("Cadastrar Disciplina");//botao para se cadastrar em uma disciplina
        panel.add(disciplinaButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        JButton detalheDisciplinaButton = new JButton("Detalhes Disciplina");//botao para ver detalhes de uma disicplina
        panel.add(detalheDisciplinaButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        JButton alunoButton = new JButton("Cadastrar Aluno");//botao para cadastrar um aluno
        panel.add(alunoButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        JButton detalheAlunoButton = new JButton("Detalhes Aluno");//botao para ver detalhes de alunos
        panel.add(detalheAlunoButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        JButton professorButton = new JButton("Cadastrar Professor");//botao para cadastrar um professor
        panel.add(professorButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        JButton detalheProfessorButton = new JButton("Detalhes Professor");//botao para ver detalhes de professor
        panel.add(detalheProfessorButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));//local

        
        
        // Configura 
        frame.getContentPane().add(panel);
        
        matriculaButton.addActionListener(new  ActionListener() { //vai chamar a classe que faz matriculas
            public void actionPerformed(ActionEvent e) {
                matriculaInterface matriculaInterface = new matriculaInterface();
                matriculaInterface.setVisible(true);
            }
        });
        disciplinaButton.addActionListener(new ActionListener() { //chamar classe que matricula uma nova disciplina
            public void actionPerformed(ActionEvent e) {
                disciplinaInterface disciplinaInterface = new disciplinaInterface();
                disciplinaInterface.setVisible(true);
            }
        });
        detalheDisciplinaButton.addActionListener(new  ActionListener() { // chamar classe para ver detalhes da disciplina
            public void actionPerformed(ActionEvent e) {
                detalheDisciplinaFrame detalheDisciplinaFrame = new detalheDisciplinaFrame();
                detalheDisciplinaFrame.setVisible(true);
            }
        });
         alunoButton.addActionListener(new ActionListener() {//vai chamar a classe para cadastrar aluno
            public void actionPerformed(ActionEvent e) {
                alunoInterface alunoInterface = new alunoInterface();
                alunoInterface.setVisible(true);
            }
        });
        detalheAlunoButton.addActionListener(new  ActionListener() {//vai chamar a classe para ver detalhes de alunos
            public void actionPerformed(ActionEvent e) {
                detalheAlunoFrame detalheAlunoFrame = new detalheAlunoFrame();
                detalheAlunoFrame.setVisible(true);
            }
        });
        professorButton.addActionListener(new ActionListener() {//vai chamar a classe para cadastrar professores
            public void actionPerformed(ActionEvent e) {
                professorInterface professorInterface = new professorInterface();
                professorInterface.setVisible(true);
            }
        });
        detalheProfessorButton.addActionListener(new  ActionListener() {//vai chamara classe que ve detalhes de professores
           public void actionPerformed(ActionEvent e) {
                detalheProfessorFrame detalheProfessorFrame = new detalheProfessorFrame();
                detalheProfessorFrame.setVisible(true);
            }
        });
        detalheMatriculaButton.addActionListener(new  ActionListener() { //chamar a classe para ver detalhes de matriculas
            public void actionPerformed(ActionEvent e) {
                detalheMatriculaFrame detalheMatriculaFrame = new detalheMatriculaFrame();
                detalheMatriculaFrame.setVisible(true);
             }
         });
        // Torna a janela principal visível
        frame.setVisible(true);
    }
}