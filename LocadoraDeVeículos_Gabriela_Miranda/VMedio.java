package LocadoraDeVeículos_Gabriela_Miranda;

public class VMedio extends Veiculo{
	private int capacidade;
	public VMedio() {
		super();
	}
	
	public VMedio(String marca, String placa , String cor, int ano, int cc) {
		super.setCor(cor);
		super.setAno(ano);
		super.setMarca(marca);
		super.setPlaca(placa);;
		this.capacidade = cc;
	}
	
	
	public VMedio(String string, String string2, String string3, int i) {
		// TODO Auto-generated constructor stub
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
}
