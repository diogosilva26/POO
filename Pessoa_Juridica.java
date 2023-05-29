package atividade1;

public class Pessoa_Juridica extends Pessoa {
	
	private String cnpj;
	private String inscricaoEstadual;
	public Pessoa_Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone) {
		super(nome, telefone);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	@Override
	public String toString() {
		return "Dados da pessoa juridica: " +
				"\nCNPJ: "  + cnpj + 
				"\nInscrição estadual: " + inscricaoEstadual +
				"\nNome: " + nome + 
				"\nTelefone: " + telefone;
	}
	
}
