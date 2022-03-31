package entities;

import enums.TitulacaoProf;

public class Professor extends PessoaFisica {

	private TitulacaoProf titulacao;

	public Professor() {
		super();
	}

	public Professor(String nome, String cpf, TitulacaoProf titulacao) {
		super(nome, cpf);
		this.titulacao = titulacao;
	}

	public TitulacaoProf getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(TitulacaoProf titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return getNome() + "(" + titulacao + ")";
	}

}
