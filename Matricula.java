import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Matricula{
        private String aluno; //aluno existente
        private String disicplina;//disciplina existente

            public Matricula(String aluno, String disciplina) { //construtor 
                this.aluno = aluno;
                this.disicplina = disciplina;
            }

            public void salvar() { //metodo para salvar a matricula feita em um arquivo
             try {
               
                FileWriter arqTexto = new FileWriter("matricula.txt",true); //arquivo  criado
                PrintWriter gravaTexto = new PrintWriter(arqTexto);
                gravaTexto.println("" + aluno + " || " + disicplina); //como vai imprimir no arquivo
                arqTexto.close();
                JOptionPane.showMessageDialog(null, "Matricula feita com sucesso");//mensagem apos matricula feita
        
            } catch (IOException i) {
                i.printStackTrace();
            }
        }
        public void add(Matricula matricula) {
        }
        }

