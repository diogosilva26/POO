package atividade5;

public enum EstadoCivil {

	SOLTEIRO("Solteiro"),
	CASADO("Casado"),
	SEPARADO("Separado"),
	DIVORCIADO("Divorciado"),
	VIUVO("Viúvo");
	
	protected String texto;

	private EstadoCivil(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
	
	
}
