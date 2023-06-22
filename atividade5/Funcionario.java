/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario implements SalarioFinal{
    
    protected String nome;
    protected LocalDate dataNascimento;
    protected Genero genero;
    protected Setor setor;
    protected double salarioBase;

    public Funcionario(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }
    
    
    @Override
    public abstract double getSalarioFinal();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
                
    }

    @Override
    public String toString() {
        return "\nDados do funcionario: " 
                + "\nNome: " + nome 
                + "\nData de nascimento: " + Util.formatarData(dataNascimento)
                + "\nIdade: " + getIdade()
                + "\nGênero: " + genero.texto 
                + "\nSetor: " + setor.nome
                + "\nSalario base: " + Util.formatarBrl(salarioBase);
    }
    
    
}
