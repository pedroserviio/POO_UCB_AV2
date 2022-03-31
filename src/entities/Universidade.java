package entities;

import java.util.ArrayList;
import java.util.List;

public class Universidade {

	private List<Cursos> cursos;
	private List<Professor> professores;
	private List<Estudante> estudantes;
	private List<ProjetosDePesquisa> projetosDePesquisas;

	public Universidade() {
		this.cursos = new ArrayList<Cursos>();
		this.professores = new ArrayList<Professor>();
		this.estudantes = new ArrayList<Estudante>();
		this.projetosDePesquisas = new ArrayList<ProjetosDePesquisa>();
	}

	public void adicionarCursos(Cursos curso) {
		try {
			cursos.add(curso);
		} catch (Exception e) {
			System.err.println("Erro ao adicionar curso: " + e.getMessage());
		}
	}

	public void listarCursos() {
		try {
			System.out.println("\nCursos Disponiveis: ");
			for (Cursos cursos : this.cursos) {
				System.out.println(cursos.getNome());
			}
		} catch (Exception e) {
			System.err.println("Erro ao listar cursos: " + e.getMessage());
		}
	}

	public Cursos buscarCurso(String nome) {
		try {
			for (Cursos curso : this.cursos)
				if (curso.getNome().equals(nome)) {
					return curso;
				}
		} catch (Exception e) {
			System.err.println("Erro ao buscar curso: " + e.getMessage());
		}
		return null;
	}

	public boolean excluirCurso(String nome) {
		Cursos curso = this.buscarCurso(nome);
		try {
			if (curso != null)
				this.cursos.remove(curso);
			return true;
		} catch (Exception e) {
			System.err.println("Erro ao excluir curso: " + e.getMessage());
			return false;
		}
	}

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void adicionarProfessores(Professor prof) {
		try {
			professores.add(prof);
		} catch (Exception e) {
			System.err.println("Erro ao adicionar professor: " + e.getMessage());
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

	public void adicionarEstudantes(Estudante estudante) {
		try {
			estudantes.add(estudante);
		} catch (Exception e) {
			System.err.println("Erro ao adicionar estudante: " + e.getMessage());
		}
	}

	public void listarEstudantes() {
		try {
			System.out.println("Estudantes matriculados: ");
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

	public void adicionarProjetos(ProjetosDePesquisa projetos) {
		try {
			projetosDePesquisas.add(projetos);
		} catch (Exception e) {
			System.err.println("Erro ao adicionar projeto: " + e.getMessage());
		}
	}

	public void listarProjetos() {
		try {
			System.out.println("\nProjetos Ativos: ");
			for (ProjetosDePesquisa projetos : this.projetosDePesquisas) {
				System.out.println(projetos.getNomeProjeto());
			}
		} catch (Exception e) {
			System.err.println("Erro ao listar projetos: " + e.getMessage());
		}
	}

	public ProjetosDePesquisa buscarProjeto(String nome) {
		try {
			for (ProjetosDePesquisa projeto : this.projetosDePesquisas)
				if (projeto.getNomeProjeto().equals(nome))
					return projeto;
		} catch (Exception e) {
			System.err.println("Erro ao buscar projeto: " + e.getMessage());
		}
		return null;
	}

	public boolean excluirProjeto(String nome) {
		ProjetosDePesquisa projeto = this.buscarProjeto(nome);
		try {
			if (projeto.isEmpty() && projeto != null)
				this.projetosDePesquisas.remove(projeto);
			return true;
		} catch (Exception e) {
			System.err.println("Erro ao excluir projeto: " + e.getMessage());
			return false;
		}
	}

	public List<ProjetosDePesquisa> getProjetosDePesquisas() {
		return projetosDePesquisas;
	}

}
