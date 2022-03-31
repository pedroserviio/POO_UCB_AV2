package entities;

import enums.TitulacaoProf;

public class Coordenador extends Professor {

	private Integer tempoDeAtuacao;

	public Coordenador() {
		super();
	}

	public Coordenador(String nome, String cpf, TitulacaoProf titulacao, Integer tempoDeAtuacao) {
		super(nome, cpf, titulacao);
		this.tempoDeAtuacao = tempoDeAtuacao;
	}

	public Integer getTempoDeAtuacao() {
		return tempoDeAtuacao;
	}

	public void setTempoDeAtuacao(Integer tempoDeAtuacao) {
		this.tempoDeAtuacao = tempoDeAtuacao;
	}

	@Override
	public String toString() {
		return "Coordenadores: \n" + getNome() + "(" + getTitulacao() + ")" +  "\nTempo de atuacao: " + tempoDeAtuacao + " anos";
	}

}
