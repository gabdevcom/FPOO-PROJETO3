package LocadoraDeVeículos_Gabriela_Miranda;

public class Veiculo {
	private String placa;
	private String marca;
	private String cor;
	private int ano;
	
	public Veiculo() {
		
	}
	
	public Veiculo( String m, String p, String c, int a) {
		this.ano = a;
		this.cor = c;
		this.marca = m;
		this.placa = p;
	}
	
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

}
