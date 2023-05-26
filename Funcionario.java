/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistemafuncionário;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private int id;
    private String nome;
    private double salario;
    private int idade;
    private Genero genero;
    private Setor setor;
    
    //Construtor

    public Funcionario(int id, String nome, double salario, int idade, Genero genero, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.genero = genero;
        this.setor = setor;
    }
    
    //Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    
    
}
