package LocadoraDeVeículos_Gabriela_Miranda;

public class Funcionario {
		private String nome;
		private String cargo;
		
		public Funcionario() {
			
		}
		
		
		public Funcionario(String n, String c) {
			this.cargo = c;
			this.nome = n;
		}
		
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
}
