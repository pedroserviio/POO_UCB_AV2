package entities;

import java.util.ArrayList;
import java.util.List;

public class Cursos {

	private String nome;
	private Integer duracao;
	private Double valor;
	private List<Disciplinas> disciplinas;
	private Coordenador coordenador;

	public Cursos() {
	}

	public Cursos(String nome, Integer duracao, Double valor, Coordenador coordenador) {
		this.nome = nome;
		this.duracao = duracaoIsValid(duracao);
		this.valor = valorIsValid(valor);
		this.disciplinas = new ArrayList<Disciplinas>();
		this.coordenador = coordenador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Integer duracaoIsValid(Integer duracao) {
		if (duracao < 0) {
			throw new IllegalArgumentException("Duracao nao pode ser menor que zero!");
		} else {
			return this.duracao = duracao;
		}
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double valorIsValid(Double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor nao pode ser menor que zero!");
		} else {
			return this.valor = valor;
		}
	}

	public void adicionarDisciplinas(Disciplinas disciplina) {
		try {
			disciplinas.add(disciplina);
		} catch (Exception e) {
			System.err.println("Erro ao adicionar disciplina: " + e.getMessage());
		}
	}

	public void listarDisciplinas() {
		try {
			for (Disciplinas disciplinas : this.disciplinas) {
				System.out.println("Disciplinas:\n" + disciplinas);
			}
		} catch (Exception e) {
			System.err.println("Erro ao listar disciplinas: " + e.getMessage());
		}
	}

	public Disciplinas buscarDisciplina(String nome) {
		try {
			for (Disciplinas disciplinas : this.disciplinas)
				if (disciplinas.getNome().equals(nome))
					return disciplinas;
		} catch (Exception e) {
			System.err.println("Erro na busca pela disciplina: " + e.getMessage());
		}
		return null;
	}

	public boolean excluirDisciplina(String nome) {
		Disciplinas disciplinas = this.buscarDisciplina(nome);
		try {
			if (disciplinas.isEmpty() && disciplinas != null)
				this.disciplinas.remove(disciplinas);
			return true;
		} catch (Exception e) {
			System.err.println("Erro ao excluir disciplina: " + e.getMessage());
			return false;
		}
	}

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}

	@Override
	public String toString() {
		return "Curso: " + nome + "\nDuracao: " + duracao + " anos" + "\nValor (Mensal): " + valor + "R$";
	}

}
