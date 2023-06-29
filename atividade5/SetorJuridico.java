package atividade5;

public enum SetorJuridico {

	TECNOLOGIA("Tecnologia"),
	MATERIAL_CONSTRUCAO("Material de construção"),
	MATERIA_PRIMA("Matéria prima"),
	ALIMENTACAO("Alimentação");
	
	protected String nome;

	private SetorJuridico(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	
}
