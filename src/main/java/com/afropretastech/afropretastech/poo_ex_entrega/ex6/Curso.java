package com.afropretastech.afropretastech.poo_ex_entrega.ex6;

public class Curso {

    String nome;
    String tipo;
    String professor;
    String duracaoCurso;
    String quantidadeAula;


    Curso (String nome, String tipo, String professor, String duracaoCurso, String quantidadeAula ){
        this.nome = nome;
        this.tipo = tipo;
        this.professor = professor;
        this.duracaoCurso = duracaoCurso;
        this.quantidadeAula = quantidadeAula;
    }

    public void visualizar (){
        System.out.println("\nNome: "+nome+"\nTipo do curso: "+tipo+"\nProfessor (a): "+professor+"\nDuração do curso: "+duracaoCurso+"" +
                "\nQuantidade de aulas: "+quantidadeAula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getQuantidadeAula() {
        return quantidadeAula;
    }

    public void setQuantidadeAula(String quantidadeAula) {
        this.quantidadeAula = quantidadeAula;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDuracaoCurso() {
        return duracaoCurso;
    }

    public void setDuracaoCurso(String duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }

}
