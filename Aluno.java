import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

class Aluno extends Pessoa  {
    private int semestre; 
    private String curso;

    public Aluno(String nome, int identificador, String curso, int semestre) { //construtor
        super(nome, identificador); //da classe Pessoa
        this.curso = curso;
        this.semestre = semestre;
    }
    public String getCurso() { //get curso
        return curso;
    }
    
    public int getSemesntre() { //get semestre
        return semestre;
    }
    
    public void salvar() { //metodo para salvar o aluno criado no arquivo
        try {
          
            FileWriter arqTexto = new FileWriter("aluno.txt",true); //arquivo que vai ser criado
            PrintWriter gravaTexto = new PrintWriter(arqTexto);
            gravaTexto.println("Aluno|" + "nome: " + this.nome + " , Identificador:" + this.identificador + ", Curso: " + this.curso + ", Semestre: " + this.semestre); //como vai imprimir no arquivo
            arqTexto.close();
            JOptionPane.showMessageDialog(null, "Aluno cadastrado."); //mensagem que vai aparecer 
    
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public void add(Aluno aluno) {
    }
    }
    