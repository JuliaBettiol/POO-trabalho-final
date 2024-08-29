import java.io.*;
import javax.swing.*;

class Pessoa  {
    static String nome;
    protected int identificador;

    public Pessoa(String nome, int identificador) { //construtor
        this.nome = nome; //nome da pessoa
        this.identificador = identificador; //identificador da pessoa
    }
    public Pessoa(String string, String string2, String string3) {
    }
    public String getNome() { //get nome
        return nome;
    }
    public int getIdentificador() { //get identificador
        return identificador;
    }
    public void salvar() { // public para salvar a pessoa cadastrada no arquivo
        try {
            FileWriter arqTexto = new FileWriter("pessoa.txt",true); //vai criar este arquivo
            PrintWriter gravaTexto = new PrintWriter(arqTexto);
            gravaTexto.println("Nome:" + this.nome + "|Identificador:" + this.identificador); //o arquivo vai imprimir desta forma
            arqTexto.close();
            JOptionPane.showMessageDialog(null, "Pessoa");
    
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public void add(Pessoa pessoa) {
    }
    }