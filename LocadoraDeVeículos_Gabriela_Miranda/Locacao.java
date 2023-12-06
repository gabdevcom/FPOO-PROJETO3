package LocadoraDeVeículos_Gabriela_Miranda;

import java.time.LocalDate;

public class Locacao {
	private Cliente cliente;
	private LocalDate dataRetirada;
	private LocalDate dataDevolucao;
	private Veiculo veiculo;
	private Funcionario funcionario;

	
	public Locacao(String string) {
		
	}
	
	public Locacao(Cliente c, LocalDate dr, LocalDate dd, Veiculo v) {
		this.cliente = c;
		this.dataDevolucao = dd;
		this.dataRetirada = dr;

		this.veiculo = v;
		
	}
	
	public Locacao(Cliente cliente) {
		this.cliente = cliente;
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(LocalDate dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	
	public void pagamento() {
		System.out.println(
			""	+ "Realizando pagamento.... emitindo recibo......");
	}
	
		
	
	public void recibo() {
		System.out.println("Para retirar o veiculo na locadora apresente o recibo: ");
		System.out.println("Nome do cliente: " + cliente.getNome() + " " + cliente.getSobrenome() 
				+ "\n" + "Data da  Retirada: " + dataRetirada +  " Data da devolucao: "+ dataDevolucao ); 
	}

}
