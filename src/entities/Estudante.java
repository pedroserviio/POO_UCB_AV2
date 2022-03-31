package entities;

public class Estudante extends PessoaFisica {

	private String matricula;
	private Cursos curso;

	public Estudante() {
		super();
	}

	public Estudante(String nome, String cpf, String matricula, Cursos curso) {
		super(nome, cpf);
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Cursos getCurso() {
		return curso;
	}

	public void setCurso(Cursos curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudante: " + getNome() + "\nMatricula: " + matricula + "\nCurso: " + curso.getNome();
	}
	
}
