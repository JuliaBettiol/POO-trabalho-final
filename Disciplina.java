import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

class Disciplina {
    private String nome; //nome da disciplina
    private int cargaHoraria; //carga horaria semanal da disciplina
    private List<Professor> professoresDisponiveis; //lista de professores
    private int maximoAlunosTurma; //maxima de alunos por turma
    private List<Turma> turmas; //lista de turmas

    public Disciplina(String nome) { //construtor
        this.cargaHoraria = cargaHoraria;
        this.professoresDisponiveis = new ArrayList<>();
        this.maximoAlunosTurma = 25; //maxima de 25 alunos por turma 
        this.turmas = new ArrayList<>();
        this.nome = nome;
    }
     
    public String getNome() {//chama o valor nome
        return nome;
    }
    
    public int getCargaHoraria() { //chama a carga horaria
        return cargaHoraria;
    }
    
    public List<Professor> getProfessoresDisponiveis() { //chama lista de professores
        return professoresDisponiveis;
    }
    public void adicionarProfessor(Professor professor) { //adiciona um professor
        professoresDisponiveis.add(professor);
    }
    public int getMaximoAlunosTurma() { //maxima de alunos na turma
        return maximoAlunosTurma;
    }
    public List<Turma> getTurmas() { //lista de turmas
        return turmas;
    }
    public void adicionarTurma(Turma turma) { //adiciona turma
        turmas.add(turma);
    }

public void salvar() { //metodo para salvar disciplina criada no arquivo
    try {
        FileWriter arqTexto = new FileWriter("disciplina.txt",true); //arquivo criado
        PrintWriter gravaTexto = new PrintWriter(arqTexto);
        gravaTexto.println("Disciplina:" + this.nome + ", Carga Horaria: " + cargaHoraria); //como vai imprimir
        arqTexto.close();
        JOptionPane.showMessageDialog(null, "Disciplina cadastrada."); //mensagem que aparece para usuario

    } catch (IOException i) {
        i.printStackTrace();
    }
}
public void add(Disciplina aluno) {
}
}
