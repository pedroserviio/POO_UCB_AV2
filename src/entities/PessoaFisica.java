package entities;

public abstract class PessoaFisica {

	private String nome;
	private String cpf;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, String cpf) {
		this.nome = nomeIsValid(nome);
		this.cpf = cpfIsValid(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String nomeIsValid(String nome) {
		if(nome.length() <= 3) {
			throw new IllegalArgumentException("Nome deve ter mais de 3 letras");
		} else {
			return this.nome = nome;
		}
	}

	public String cpfIsValid(String cpf) {
		if (cpf.length() != 11) {
			throw new IllegalArgumentException("CPF deve ter 11 digitos");
		} else {
			return this.cpf = cpf;
		}
	}
}
