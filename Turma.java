import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Turma {
    private int numeroTurma; //numero da turma
    private Disciplina disciplina; //disciplina
    private List<Aluno> alunos; //lista de alunos
    private Professor professor; //professor

    public Turma(int numeroTurma, Disciplina disciplina) { //construtor
        this.numeroTurma = numeroTurma;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }
    public Turma(String turma) { //parametros
    }
    public int getNumeroTurma() {  //chama numero turma
        return numeroTurma;
    }
    public Disciplina getDisciplina() {//get disciplina
        return disciplina;
    }
    public List<Aluno> getAlunos() {//chama lista de alunos
        return alunos;
    }
    public void adicionarAluno(Aluno aluno) { //adiciona a turma
        alunos.add(aluno);
    }
    public Professor getProfessor() {//chama professor
        return professor;
    }
    public void destinarProfessor (Professor professor) { //destina professor a turma
        this.professor = professor;
        professor.adicionarCargaHoraria(disciplina.getCargaHoraria());
    }
    public void salvar() { //metodo para salvar turma em um arquivo texto
        try {
            FileOutputStream fileOut = new FileOutputStream("turma.txt"); //arquivo criado
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            System.out.println ("Turma salva");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}