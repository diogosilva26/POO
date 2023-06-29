package atividade5;

import java.time.LocalDate;

public class Cliente extends Fisica {
	
	private String protocoloAtendimento;

	public Cliente(String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String protocoloAtendimento) {
		super(nome, telefone, email, endereco, genero, estadoCivil, dataNascimento);
		this.protocoloAtendimento = protocoloAtendimento;
	}

	public String getProtocoloAtendimento() {
		return protocoloAtendimento;
	}

	public void setProtocoloAtendimento(String protocoloAtendimento) {
		this.protocoloAtendimento = protocoloAtendimento;
	}

	@Override
	public String toString() {
		return 
				 "-----Cliente----- "
				+ super.toString()
				+ "\nProtocolo de atendimento: " + protocoloAtendimento;
	}
	
	
	
	

}
