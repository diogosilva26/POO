package atividade5;

public abstract class Juridica extends Pessoa {

	protected String cnpj;
	protected String inscricaoEstadual;

	public Juridica(String nome, String telefone, String email, Endereco endereco, String cnpj,
			String inscricaoEstadual) {
		super(nome, telefone, email, endereco);
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
		return "-----Pessoa juridica-----" 
				+ super.toString()
				+ "\nCNPJ: " + cnpj 
				+ "\nInscrição estadual: " + inscricaoEstadual;
	}
	
	

}
