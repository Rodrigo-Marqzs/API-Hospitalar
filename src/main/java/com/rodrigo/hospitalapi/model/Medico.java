package com.rodrigo.hospitalapi.model;

public class Medico {
    private int id;
    private String nome;
    private String especialidade;
    private String crm;

    public Medico  (int id, String nome, String especialidade, String crm) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;

}

    public String getNome() {return nome;}
    public String getCrm() {return crm;}
    public String getEspecialidade() {return especialidade;}

    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}


}
