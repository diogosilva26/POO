package atividade1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa_Fisica extends Pessoa {
	 private String cpf;
	 private String rg;
	 private LocalDate dataNascimento;
	 
	 

	public Pessoa_Fisica(String cpf, String rg, LocalDate dataNascimento, String nome, String telefone) {
		super(telefone, nome);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		 return Period.between(dataNascimento, LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		return "Dados da pessoa física: \nCPF: " + cpf + 
				" \nRG: " + rg + 
				" \nData de nascimento: " + dataNascimento +
				" \nIdade: "+ getIdade();
	}
	
	
	
	
	
	
	 
	 
	 
	 
	 
}
