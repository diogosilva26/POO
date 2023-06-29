package atividade5;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
	
	private String carteiraDeHabilitacao;
	
	

	
	public Motoboy(String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor,
			double salario, String carteiraDeHabilitacao) {
		super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
		this.carteiraDeHabilitacao = carteiraDeHabilitacao;
	}

	public String getCarteiraDeHabilitacao() {
		return carteiraDeHabilitacao;
	}

	public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
		this.carteiraDeHabilitacao = carteiraDeHabilitacao;
	}

	@Override
	public double getSalarioFinal() {
		return super.salario;
	}

	@Override
	public String toString() {
		return super.toString()  
				+ "\nCargo: Motoboy "
				+ "\nCarteira de habilitação: " + carteiraDeHabilitacao
				+ "\nSalário final: " + Util.formatarBrl(getSalarioFinal());
	}
	
	
	
	

}
