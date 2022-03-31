package entities;

import java.util.ArrayList;
import java.util.List;

public class Disciplinas {

	private String nome;
	private List<Estudante> estudantes;
	private Professor professor;

	public Disciplinas() {
	}

	public Disciplinas(String nome, Professor professor) {
		this.nome = nome;
		this.estudantes = new ArrayList<Estudante>();
		this.professor = professor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void adicionarEstudante(Estudante estudante) {
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
	
	public boolean isEmpty() {
		if(estudantes.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return nome;
	}

}
