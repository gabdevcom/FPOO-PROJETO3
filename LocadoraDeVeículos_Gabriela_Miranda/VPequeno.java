	package LocadoraDeVeículos_Gabriela_Miranda;
	
	public class VPequeno extends Veiculo {
		private int capacidade;
		public VPequeno(String string, String string2, String string3, int i) {
			super();
		}
		
		public VPequeno(String marca, String placa , String cor, int ano, int cc) {
			super.setCor(cor);
			super.setAno(ano);
			super.setMarca(marca);
			super.setPlaca(placa);;
			this.capacidade = cc;
		}
		
		
		public int getCapacidade() {
			return capacidade;
		}

		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}
	
		
	}
