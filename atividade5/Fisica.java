package atividade5;

import java.time.LocalDate;
import java.time.Period;

public abstract class Fisica extends Pessoa {

	protected Genero genero;
	protected EstadoCivil estadoCivil;
	protected LocalDate dataNascimento;

	public Fisica(String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil,
			LocalDate dataNascimento) {
		super(nome, telefone, email, endereco);
		this.genero = genero;
		this.estadoCivil = estadoCivil;
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimentoD(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		return Period.between(dataNascimento, LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "\nGenero: " + genero.caractere +" "+ genero.texto 
				+ "\nEstado civil: " + estadoCivil.texto 
				+ "\nData de nascimento: " + Util.formatarData(dataNascimento)
				+"\nIdade: " + getIdade();
	}
	
	

}
