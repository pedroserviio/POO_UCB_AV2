package entities;

import java.util.ArrayList;
import java.util.List;

public class ProjetosDePesquisa {

	private String nomeProjeto;
	private Double orcamento;
	private Integer tamanhoProjeto;
	private Integer tamanhoProjetoRealizado;
	private List<Professor> professores;
	private List<Estudante> estudantes;

	public ProjetosDePesquisa() {
	}

	public ProjetosDePesquisa(String nomeProjeto, Double orcamento, Integer tamanhoProjeto,
			Integer tamanhoProjetoRealizado) {
		this.nomeProjeto = nomeProjeto;
		this.orcamento = orcamentoIsValid(orcamento);
		this.tamanhoProjeto = tamanhoIsValid(tamanhoProjeto);
		this.tamanhoProjetoRealizado = tamanhoRealizadoIsValid(tamanhoProjetoRealizado);
		this.professores = new ArrayList<Professor>();
		this.estudantes = new ArrayList<Estudante>();
	}

	// Ao adicionar um pesquisador, ele devera fazer um relatorio do projeto
	public void adicionarProfessores(Professor prof) {
		try {
			professores.add(prof);
			System.out.println("\nRelatorio feito por: " + prof + relatorio());
		} catch (Exception e) {
			System.err.println("Erro ao adicionar pesquisador" + e.getMessage());
		}
	}

	public void listarProfessores() {
		try {
			System.out.println("Professores: ");
			for (Professor professores : this.professores) {
				System.out.println(professores);
			}
		} catch (Exception e) {
			System.err.println("Erro ao listar professores: " + e.getMessage());
		}
	}

	public Professor buscarProfessor(String nome) {
		try {
			for (Professor professor : this.professores)
				if (professor.getNome().equals(nome))
					return professor;
		} catch (Exception e) {
			System.err.println("Erro ao buscar professor: " + e.getMessage());
		}
		return null;
	}

	public boolean excluirProfessor(String nome) {
		Professor professor = this.buscarProfessor(nome);
		try {
			if (professor != null)
				this.professores.remove(professor);
			return true;
		} catch (Exception e) {
			System.err.println("Erro ao excluir professor: " + e.getMessage());
			return false;
		}
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	// Ao adicionar um pesquisador, ele devera fazer um relatorio do projeto
	public void adicionarEstudantes(Estudante estudante) {
		try {
			estudantes.add(estudante);
			System.out.println("\nRelatorio feito por: " + estudante.getNome() + relatorio());
		} catch (Exception e) {
			System.err.println("Erro ao adicionar pesquisador" + e.getMessage());
		}
	}

	public void listarEstudantes() {
		try {
			System.out.println("\nEstudantes matriculados: ");
			for (Estudante estudante : this.estudantes) {
				System.out.println(estudante.getNome());
			}
		} catch (Exception e) {
			System.err.println("Erro ao listar estudantes: " + e.getMessage());
		}
	}

	public Estudante buscarEstudante(String nome) {
		try {
			for (Estudante estudante : this.estudantes)
				if (estudante.getNome().equals(nome))
					return estudante;
		} catch (Exception e) {
			System.err.println("Erro ao buscar estudante: " + e.getMessage());
		}
		return null;
	}

	public boolean excluirEstudante(String nome) {
		Estudante estudante = this.buscarEstudante(nome);
		try {
			if (estudante != null)
				this.estudantes.remove(estudante);
			return true;
		} catch (Exception e) {
			System.err.println("Erro ao excluir estudante: " + e.getMessage());
			return false;
		}
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}

	public Double orcamentoIsValid(Double orcamento) {
		if (orcamento < 0) {
			this.orcamento = 0.0;
			throw new IllegalArgumentException("Orcamento nao pode ter valor menor que zero!");
		} else {
			return this.orcamento = orcamento;
		}
	}

	public Integer getTamanhoProjeto() {
		return tamanhoProjeto;
	}

	public void setTamanhoProjeto(Integer tamanhoProjeto) {
		this.tamanhoProjeto = tamanhoProjeto;
	}

	public Integer tamanhoIsValid(Integer tamanhoProjeto) {
		if (tamanhoProjeto < 0) {
			this.tamanhoProjeto = 0;
			throw new IllegalArgumentException("Tamanho do projeto nao pode ser menor que zero!");
		} else {
			return this.tamanhoProjeto = tamanhoProjeto;
		}
	}

	public Integer getTamanhoProjetoRealizado() {
		return tamanhoProjetoRealizado;
	}

	public void setTamanhoProjetoRealizado(Integer tamanhoProjetoRealizado) {
		this.tamanhoProjetoRealizado = tamanhoProjetoRealizado;
	}

	public Integer tamanhoRealizadoIsValid(Integer tamanhoProjetoRealizado) {
		if (tamanhoProjetoRealizado < 0) {
			this.tamanhoProjetoRealizado = 0;
			throw new IllegalArgumentException("Tamanho do projeto realizado nao pode ser menor que zero!");
		} else {
			return this.tamanhoProjetoRealizado = tamanhoProjetoRealizado;
		}
	}

	public Integer percentualRealizado() {
		try {
			return tamanhoProjetoRealizado * 100 / tamanhoProjeto;
		} catch (Exception e) {

			return 0;
		}
	}

	public boolean isEmpty() {
		if (estudantes.isEmpty() && professores.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public String relatorio() {
		try {
			return "\nProjeto: " + nomeProjeto + "\nOrcamento: " + orcamento + "R$" + "\nPercentual Realizado: "
					+ percentualRealizado() + "%";
		} catch (Exception e) {
			return "\nErro ao gerar relatorio: " + e.getMessage();
		}
	}

	@Override
	public String toString() {
		return "\nProjeto: " + nomeProjeto + "\nPesquisadores:\n" + professores + "\n" + estudantes;
	}

}
