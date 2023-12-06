package LocadoraDeVeículos_Gabriela_Miranda;

public class Cliente {
	private	String nome;
	private String sobrenome;
	private double cpf;
	private String email;
	private double celular;
	
	public Cliente() {
		
	}
	
	public Cliente(String n, String s, int cpf, String email, int c) {
		this.celular = cpf;
		this.cpf = c;
		this.email = email;
		this.nome = n;
		this.sobrenome = s;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public double getCelular() {
		return celular;
	}
	public void setCelular(double celular) {
		this.celular = celular;
	}
	
	
	
}
