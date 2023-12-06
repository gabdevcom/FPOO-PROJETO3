package LocadoraDeVeículos_Gabriela_Miranda;

import java.util.ArrayList;
import java.time.Period;

import java.util.List;
import java.util.Scanner;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Cliente c1 = new Cliente();
		Funcionario f1 = new Funcionario("Betty" , "Atendente");
		
		VGrande vg1 = new VGrande("Porshe Panamera", "LMO123", "Rosa" , 2022, 4 );
		VGrande vg2 = new VGrande("Mini Van", "BNM654", "Preta", 2017, 15);
		
		VMedio vm1 = new VMedio("Gol G4", "GHI123", "Roxo" , 2012, 5);
		VMedio vm2 = new VMedio("Siena", "JLKM321",  "Branco", 2006, 5);
		
		VPequeno vp1 = new VPequeno("Gol G3", "ABC123", "Prata", 2010, 5);
		VPequeno vp2 = new VPequeno("Fiat Mobi" , "ABC456", "Vermelho", 2020, 5);
		
		
		System.out.println("Seja bem - vindo(a) a Locadora de Veiculos Swifitie!! ");
		System.out.println("Selecionando uma atendente . . . " + "\n Ola me chamo " + f1.getNome() + " em caso de duvidas me contate por esse numero "
				+ "(19) 1319891");
		System.out.println("Realize seu login : ");
		System.out.println("Nome: ");
		c1.setNome(entrada.next());
		System.out.println("Sobrenome: ");
		c1.setSobrenome(entrada.next());
		System.out.println("CPF: ");
		c1.setCpf(entrada.nextInt());
		System.out.println("E-mail: ");
		c1.setEmail(entrada.next());
		System.out.println("Celular: ");
		c1.setCelular(entrada.nextInt());
		
		System.out.println("Logando na sua conta . . .");

		System.out.println("Selecione a categoria de veiculos :   \n 1- Pequeno \n 2- Medio \n 3- Grande"  );
		int opcao = entrada.nextInt();
		switch (opcao) {
		
		case 1:
			System.out.println(" 1-  Pequeno "); {
			List<VPequeno> lista_p = new ArrayList<VPequeno>();
			lista_p.add(vp1);
			lista_p.add(vp2);
				
			for (VPequeno olho : lista_p) {
				System.out.println(olho.getMarca() +
						" "+ olho.getCor());
			} 
			
		System.out.println("Escolha um dos carrs disponiveis: " + "1- Gol G3 2- Fiat Mobi");
		int carro = entrada.nextInt();
		String carrop = null;
		switch (carro) {
		case 1:
			
			carrop = (vp1.getMarca() + " " + vp1.getAno() + " " + vp1.getPlaca() + " " + vp1.getCor())+" " + "Capacidade: " + vp1.getCapacidade();
			break;
			
			case 2:
				
				carrop = (vp2.getMarca() + " " + vp2.getAno() + " " + vp2.getPlaca() + " " + vp2.getCor()) +" " + "Capacidade: " + vp2.getCapacidade();
				
				
			default:
			System.out.println("Voltando a pagina inicial");
			break;
		
} 
		
		System.out.println("Selecione tipo de locacao:  \n 1- Diaria R$200"
			+  "\n 2- Mensal R$800 ");
		int opcao1 = entrada.nextInt();
		double total = 0;
		switch (opcao1) { 
		case 1:
			System.out.println("Locacao diaria selecionada");
			total = 200;
			break;
		case 2:
			System.out.println("Locacao mensal selecionada");
			total = 800;
	
		default:
			System.out.println("Retornando a pagina inicial. . . ");
			break;
	
	}
		LocalDate dataD = null;
		LocalDate dataR = null;
		
		
		
		entrada.nextLine();
		
		
		
		
	
		DateTimeFormatter saida = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		
		System.out.println("Digite a data de retirada: (dd-MM-yyyy):");
		String dataRE = entrada.next();
		LocalDate dataD1 = LocalDate.parse(dataRE, saida);
		
		
		System.out.println("Digite a data de devolução: (dd-MM-yyyy):");
		String dataDE = entrada.next();
		LocalDate dataR1 = LocalDate.parse(dataDE, saida);
		
		
		Period diferenca = Period.between(dataD1, dataR1);
		int mes = diferenca.getMonths();
		int dia = diferenca.getDays();
		
		double valorTotal = 0;
		if (dia < 30) {
		    valorTotal = dia * total;
		} else {
		    valorTotal = mes * total;
		}
	
		
		
		
		
		
	
		 /*
		System.out.println("Digite a data de devolucao (dd-MM-yyyy): ");
		String dataDE = entrada.nextLine();
			
		dataD = LocalDate.parse(dataDE, DateTimeFormatter.ofPattern("dd-MM-yyyy")); 
		
		
		  
		  DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		  String data3;
		  LocalDate data1 = LocalDate.parse(data3 , form);
		  LocalDate data2 = LocalDate.parse( dataD, form);
		  
		  Period diferenca = Period.between(data1, data2);
		  int mes = diferenca.getMonths();
		  
		  System.out.println(" Diferenca mes: " + mes); 
		
		  */
		 
		
		 
		
		Locacao l1 = new Locacao(c1, dataD1, dataR1 , vp1);
		System.out.println("Redirecionando para a pagina de pagamento . . . "); 
		System.out.println("Valor a pagar: R$ " ); //por equanto so pega a diaria
		System.out.println("Escolhadsdsa forma de pagamento: "
				+ "\n"  + "1- Parcelamento" +  " 2- A vista: " );
		int opcao2 = entrada.nextInt();
		switch (opcao2) {
		case 1:
			l1.pagamento();
			l1.recibo();
			System.out.println("Carro: "+ carrop);
			
			break;
		case 2:
			l1.pagamento();
			l1.recibo();
			System.out.println("Carro" + carrop);
			break;
		default:
			System.out.println("Retornando a pagina inicial. . . ");
			break;
	
	} 
		break;
			} 
			
			
			//CATEGORIA PORTE MEDIO
			
			
		case 2:
			System.out.println(" 2- Medio"); {
			List<VMedio> lista_m = new ArrayList<VMedio>();
			lista_m.add(vm1);
			lista_m.add(vm2);
				
			for (VMedio olho : lista_m) {
				System.out.println(olho.getMarca() +
						" "+ olho.getCor());
			}
			
			System.out.println("Escolha um dos carros disponiveis: "
					+ "1- Gol G4 2- Siena");
		int carro1 = entrada.nextInt();
		String carrom = null;
		switch (carro1) {
		case 1:
		
			carrom = (vm1.getMarca() + " " + vm1.getAno() + " " + vm1.getPlaca() + " " + vm1.getCor()) +" " + "Capacidade: " + vm1.getCapacidade();
			
			break;

		case 2:
		
			carrom = (vm2.getMarca() + " " + vm2.getAno() + " " + vm2.getPlaca() + " " + vm2.getCor()) +" " + "Capacidade: " + vm2.getCapacidade();
			
			break;
			
		default:
			System.out.println("Retornando a pagina inicial . . . ");
		break;
	}
		
		System.out.println("Selecione tipo de locacao:  \n 1- Diaria R$200"
				+  "\n 2- Mensal R$800 ");
			int opcao1 = entrada.nextInt();
			double total = 0;
			switch (opcao1) { 
			case 1:
				System.out.println("Locacao diaria selecionada");
				total = 200;
				break;
			case 2:
				System.out.println("Locacao mensal selecionada");
				total = 800;
		
			default:
				System.out.println("Retornando a pagina inicial. . . ");
				break;
		
		}
		
		LocalDate dataD = null;
		LocalDate dataR = null;
		
		
		DateTimeFormatter saida = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		
		System.out.println("digite a data de retirada: (dd-MM-yyyy):") ;
		String dataRE = entrada.next();
		LocalDate data1 = LocalDate.parse(dataRE, saida);
		
		
		System.out.println("digite a data de devolucao: (dd-MM-yyyy):") ;
		String dataDE = entrada.next();
		LocalDate data2 = LocalDate.parse(dataDE, saida);
		
		
		 Period diferenca = Period.between(data1, data2);
		 Period diferenca2 = Period.between(data1, data2);
		 int mes = diferenca.getMonths();
		 int dia = diferenca.getDays();
		
		 double valorTotal = 0;
		  if ( dia < 30) {
				valorTotal = dia * total;
			}else {
				valorTotal = mes * total;
	        
			}
	
		
		
		Locacao l2 = new Locacao(c1, dataD, dataR, vm2);
		System.out.println("Redirecionando para a pagina de pagamento . . . ");
		System.out.println("Valor a pagar: R$ " + valorTotal);
		System.out.println("Escolha a forma de pagamento: "
				+ "\n"  + "1- Parcelamento" +  " 2- A vista: " );
		int opcao2 = entrada.nextInt();
		switch (opcao2) {
		case 1:
			l2.pagamento();
			l2.recibo();
			System.out.println("Carro: "+ carrom);
	
			break;
		case 2:
			l2.pagamento();
			l2.recibo();
			System.out.println("Carro: "+ carrom);
		
			break;
		default:
			System.out.println("Retornando a pagina inicial. . . ");
			break;
		
	} 
		
		//CATEGORIA PORTE GRANDE
		
			}	break;
			case 3:
				System.out.println(" 3- Grande ");
				List<VGrande> lista_g = new ArrayList<VGrande>();
				lista_g.add(vg1);
				lista_g.add(vg2);
					
				for (VGrande olho : lista_g) {
					System.out.println(olho.getMarca() +
							" "+ olho.getCor());
				}
				
				System.out.println("Escolha um dos dois carros disponiveis: "
						+ "1- Mini van  2 - Porsche");
			int carro3 = entrada.nextInt();
			String carrog = null;
			switch (carro3) {
			case 1:
				carrog = (vg1.getMarca() + " " + vg1.getAno() + " " + vg1.getPlaca() + " " + vg1.getCor()) +" " + "Capacidade: " + vg1.getCapacidade();
				
				break;

			case 2:
				carrog = (vg2.getMarca() + " " + vg2.getAno() + " " + vg2.getPlaca() + " " + vg2.getCor()) +" " + "Capacidade: " + vg2.getCapacidade();
				
				break;
				
				
			default:
				System.out.println("Retornando a pagina inicial. . . ");
				break;
		
		}
			
			System.out.println("Selecione tipo de locacao:  \n 1- Diaria R$200"
					+  "\n 2- Mensal R$800 ");
				int opcao1 = entrada.nextInt();
				double total = 0;
				switch (opcao1) { 
				case 1:
					System.out.println("Locacao diaria selecionada");
					total = 200;
					break;
				case 2:
					System.out.println("Locacao mensal selecionada");
					total = 800;
			
				default:
					System.out.println("Retornando a pagina inicial. . . ");
					
			
			}
			
			
				DateTimeFormatter saida = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
				
				System.out.println("digite a data de retirada: (dd-MM-yyyy):") ;
				String dataRE = entrada.next();
				LocalDate data1 = LocalDate.parse(dataRE, saida);
				
				
				System.out.println("digite a data de devolucao: (dd-MM-yyyy):") ;
				String dataDE = entrada.next();
				LocalDate data2 = LocalDate.parse(dataDE, saida);
				
				
				 Period diferenca = Period.between(data1, data2);
				 Period diferenca2 = Period.between(data1, data2);
				 int mes = diferenca.getMonths();
				 int dia = diferenca.getDays();
				
				 double valorTotal = 0;
		
			if ( dia < 30) {
						valorTotal = dia * total;
					}else {
						valorTotal = mes * total;
			        
					}
			
			
			Locacao l3 = new Locacao(c1,data1 ,data2,vg1);
			System.out.println("Redirecionando para a pagina de pagamento . . . ");
			System.out.println("Valor a pagar: R$ " + valorTotal);
			System.out.println("Escolha a forma de pagamento: "
					+ "\n"  + "1- Parcelamento" +  " 2- A vista: " );
			int opcao211 = entrada.nextInt();
			switch (opcao211) {
			case 1:
				System.out.println("Opcao de parcelamento selecionada");
				
				l3.pagamento();
				l3.recibo();
				System.out.println("Carro: "+ carrog);
				
			
				break;
			case 2:
				System.out.println("Opcao a vista selecionada");
				l3.pagamento();
				l3.recibo();
				System.out.println("Carro: "+ carrog);
				
				
				break;
			default:
				System.out.println("Retornando a pagina inicial. . . ");
				break;
			
		}

		}
	
	
	
	
	
}
	

	
		}
	
		
		
		
		
		
		
	
