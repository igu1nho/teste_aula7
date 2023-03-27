package br.inatel.cdg;

public class Professor {

    private String nome;
    private String h_atendimento; //qtdvida
    private String periodo; //arma
    private int sala;
    private String[] predio;


    public Professor(String nome, String h_atendimento, String periodo, int sala, String[] predio) {
        this.nome = nome;
        this.h_atendimento = h_atendimento;
        this.periodo = periodo;
        this.sala = sala;
        this.predio = predio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getH_atendimento() {
        return h_atendimento;
    }

    public void setH_atendimento(String h_atendimento) {
        this.h_atendimento = h_atendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String[] getPredio() {
        return predio;
    }

    public void setPredio(String[] predio) {
        this.predio = predio;
    }
}
