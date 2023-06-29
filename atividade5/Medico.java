package atividade5;

import java.time.LocalDate;

public class Medico extends Funcionario {
	
	private String crm;


	public Medico(String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadoCivil,
			LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario,
			String crm) {
		super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, setor, salario);
		this.crm = crm;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public double getSalarioFinal() {
		return super.salario;
	}

	@Override
	public String toString() {
		return  super.toString()
				+ "\nCargo: médico "
				+ "\nCRM: " + crm
				+ "\nSalário final: " + Util.formatarBrl(getSalarioFinal());
	}
	
	
	
	 
	

	
}
