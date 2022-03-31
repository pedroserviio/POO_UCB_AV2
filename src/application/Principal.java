package application;

import entities.Coordenador;
import entities.Cursos;
import entities.Disciplinas;
import entities.Estudante;
import entities.Professor;
import entities.ProjetosDePesquisa;
import entities.Universidade;
import enums.TitulacaoProf;

public class Principal {

	public static void main(String[] args) {

		Universidade universidade = new Universidade();

		// Professores / Coordenadores
		Professor professor1 = new Professor("Edson Francisco", "99999999999", TitulacaoProf.MESTRE);
		Professor professor2 = new Professor("Joao", "99999999999", TitulacaoProf.ESPECIALISTA);
		Professor professor3 = new Professor("Jose", "99999999999", TitulacaoProf.GRADUADO);

		universidade.adicionarProfessores(professor1);
		universidade.adicionarProfessores(professor2);
		universidade.adicionarProfessores(professor3);

		universidade.listarProfessores();

		System.out.println();

		// Buscar Professor
		System.out.println(universidade.buscarProfessor("Edson Francisco"));

		System.out.println();

		// Lista apos excluir professor
		universidade.excluirProfessor("Joao");
		universidade.listarProfessores();

		System.out.println();
		Coordenador coordenador = new Coordenador("Weslley", "99999999999", TitulacaoProf.DOUTOR, 10);
		System.out.println(coordenador);

		// Cursos / Disciplinas
		Cursos engSoftware = new Cursos("Eng. Software", 4, 1200.0, coordenador);
		Cursos cienciaComputacao = new Cursos("Ciencia da Computacao", 4, 1300.0, coordenador);

		universidade.adicionarCursos(engSoftware);
		universidade.adicionarCursos(cienciaComputacao);

		universidade.listarCursos();

		Disciplinas disciplinaEngSoftware = new Disciplinas("Programacao Orientada a Objetos", professor1);
		engSoftware.adicionarDisciplinas(disciplinaEngSoftware);
		Disciplinas disciplinaBCC = new Disciplinas("Logica de Programacao", professor2);
		cienciaComputacao.adicionarDisciplinas(disciplinaBCC);

		System.out.println();

		Estudante estudante1 = new Estudante("Pedro", "99999999999", "UC9999", engSoftware);
		Estudante estudante2 = new Estudante("Maria", "99999999999", "UC0000", cienciaComputacao);

		universidade.adicionarEstudantes(estudante1);
		universidade.adicionarEstudantes(estudante2);

		// Buscar Curso
		System.out.println(universidade.buscarCurso("Eng. Software"));
		engSoftware.listarDisciplinas();
		System.out.println();
		System.out.println(universidade.buscarCurso("Ciencia da Computacao"));
		cienciaComputacao.listarDisciplinas();

		disciplinaEngSoftware.adicionarEstudante(estudante1);
		disciplinaBCC.adicionarEstudante(estudante2);

		// Lista apos excluir disciplina
		disciplinaBCC.excluirEstudante("Maria");
		cienciaComputacao.excluirDisciplina("Logica de Programacao");
		System.out.println("\nDisciplinas: ");
		cienciaComputacao.listarDisciplinas();

		System.out.println("\nEstudantes cursando: " + disciplinaEngSoftware.getNome() + "\n"
				+ disciplinaEngSoftware.buscarEstudante("Pedro"));

		System.out.println();

		// Estudantes
		universidade.listarEstudantes();

		System.out.println();

		// Buscar Estudante
		System.out.println(universidade.buscarEstudante("Pedro") + "\n");
		System.out.println(universidade.buscarEstudante("Maria"));

		System.out.println();

		// Lista apos excluir estudante
		universidade.excluirEstudante("Maria");
		universidade.listarEstudantes();

		// Lista de cursos apos excluir curso
		universidade.excluirCurso("Ciencia da Computacao");
		universidade.listarCursos();

		// Projetos de Pesquisa
		ProjetosDePesquisa projetoDePesquisa = new ProjetosDePesquisa("Projeto E-commerce", 5000.0, 20, 2);
		ProjetosDePesquisa projetoDePesquisa2 = new ProjetosDePesquisa("Projeto Cadastro Escolar", 7500.0, 30, 9);

		universidade.adicionarProjetos(projetoDePesquisa);
		universidade.adicionarProjetos(projetoDePesquisa2);

		projetoDePesquisa.adicionarEstudantes(estudante1);
		projetoDePesquisa.adicionarEstudantes(estudante2);
		projetoDePesquisa.adicionarProfessores(professor3);

		projetoDePesquisa2.adicionarEstudantes(estudante1);
		projetoDePesquisa2.adicionarProfessores(professor1);

		universidade.listarProjetos();

		// Buscar Projeto
		System.out.println(universidade.buscarProjeto("Projeto E-commerce"));

		// Lista apos excluir projeto
		projetoDePesquisa.excluirEstudante("Pedro");
		projetoDePesquisa.excluirEstudante("Maria");
		projetoDePesquisa.excluirProfessor("Joao");
		universidade.excluirProjeto("Projeto E-commerce");

		universidade.listarProjetos();
	}

}
