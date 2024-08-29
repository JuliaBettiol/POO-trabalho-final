import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

import javax.swing.JOptionPane;

class Professor extends Pessoa { //estende da classe pessoa
    private int cargaHorariaTotal; //carga horaria total na semana 
    private int cargaHorariaMaxima;//carga horaria maxima permitida

    public Professor (String nome, int identificador, int cargaHoraria) { //construtor
        super(nome, identificador);//classe pessoa
        this.cargaHorariaTotal = cargaHoraria;
        this.cargaHorariaMaxima = cargaHorariaMaxima;
    }
    public int getCargaHorariaTotal() { //chama carga horaria total
        return cargaHorariaTotal;
    }
    public int getCargaHorariaMaxima() {//chama carga horaria maxima
        return cargaHorariaMaxima;
    }
    public void adicionarCargaHoraria(int cargaHoraria) {//cara adicionar carga horaria
        if (cargaHorariaTotal <= cargaHorariaMaxima) {
            throw new IllegalArgumentException("Carga horária excedida");
        } else {
            cargaHorariaTotal += cargaHoraria;
        }
    }
    public void salvar() { //metodo para salvar o professor cadastrado
        try {
          
            FileWriter arqTexto = new FileWriter("professor.txt",true);//cria o arquivo texto
            PrintWriter gravaTexto = new PrintWriter(arqTexto);
            gravaTexto.println("Professor|" + "nome: " + this.nome + " , Identificador:" + this.identificador + ", Carga Horaria: " + this.cargaHorariaTotal);//forma que imprimi no arquivo texto
            arqTexto.close();
            JOptionPane.showMessageDialog(null, "Aluno cadastrado.");//mensagem que aparece apos cadastrar
    
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public void add(Aluno aluno) {
    }
    }