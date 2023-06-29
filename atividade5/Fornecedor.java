package atividade5;

public class Fornecedor extends Juridica {

	private SetorJuridico setor;
	private Produto produto;
	
	public Fornecedor(String nome, String telefone, String email, Endereco endereco, String cnpj,
			String inscricaoEstadual, SetorJuridico setor, Produto produto) {
		super(nome, telefone, email, endereco, cnpj, inscricaoEstadual);
		this.setor = setor;
		this.produto = produto;
	}

	public SetorJuridico getSetor() {
		return setor;
	}

	public void setSetor(SetorJuridico setor) {
		this.setor = setor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return super.toString()
				+ "\nCargo: Fornecedor "
				+ "\nSetor: " + setor.nome 
				+ produto.toString();
	}
}
