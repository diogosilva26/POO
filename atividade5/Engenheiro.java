package atividade5;

import java.time.LocalDate;

public class Engenheiro extends Funcionario {
	
	private String crea;

	
	

	public Engenheiro(String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor,
			double salario, String crea) {
		super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
		this.crea = crea;
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

	@Override
	public double getSalarioFinal() {		
		return super.salario;
	}

	@Override
	public String toString() {
		return  super.toString()
				+ "\nCargo: engenheiro "
				+ "\nCREA: " + crea
				+ "\nSalário final: " + Util.formatarBrl(getSalarioFinal());
	}
	
	
	
	

}
