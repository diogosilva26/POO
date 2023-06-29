package atividade5;

public enum Setor {

	ENGENHARIA("Engenharia"),
	SAUDE("Saúde"),
	JURIDICO("Juridico"),
	RECURSOS_HUMANOS("Recursos humanos"),
	MARKETING("Marketing"),
	OPERACOES("Operações");
	
	protected String nome;

	private Setor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
}
