package br.edu.utfpr.app.entity;

/**
 * @author Vinicius 
 * vcandrade@utfpr.edu.br
 */

public class Aluno {

    private int ra;
    private String nome;
    private String curso;
    private int periodo;
    private double coeficiente;
    private String situacao;

    public Aluno() {
    
    }
    
    public Aluno(int ra, String nome, String curso, int periodo, double coeficiente, String situacao) {
     
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
        this.coeficiente = coeficiente;
        this.situacao = situacao;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
