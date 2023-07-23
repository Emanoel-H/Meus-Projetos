package Cambio.Domain;

import java.lang.Math;
import java.util.Scanner;
public class Cambio {
	private String moeda;

	public void displayMenu(){
		System.out.println("=======================================================");
		System.out.println("             Bem-vindo ao Conversor de Moeda           ");
		System.out.println("   Digite o tipo de conversão que você quer executar:  ");
		System.out.println("\n 1-Real para Moeda Estrangeira \n 2-Moeda Estrangeira para Real \n 9-Sair do Programa");
		System.out.println("=======================================================");
	}

	public String conversao(double amount, double taxa, String tipo) {
		try {
			double conversor = amount / taxa;
			switch (tipo) {
				case "1":
					System.out.println("O valor convertido será de U$ " + Math.round(conversor));
					break;
				case "2":
					System.out.println("O valor convertido será de € " + Math.round(conversor));
					break;
				case "3":
					System.out.println("O valor convertido será de £ " + Math.round(conversor));
					break;
				case "4":
					System.out.println("O valor convertido será de $ " + Math.round(conversor));
					break;
				case "5":
					System.out.println("O valor convertido será de $ " + Math.round(conversor));
					break;
				default:
					System.out.println("Selecione o tipo de moeda que você quer converter");
					break;
			}
		} catch (Exception e) {
            /*String msg = ex.getMessage();
			System.out.println("ArithmeticException" + msg);*/
			System.out.println("Erro na conversão, o valor da taxa é nulo");
			e.printStackTrace();
		}

		return tipo;
	}

	public String conversaoEstrangeira(double amount, double taxa, String tipo) {
		double conversor = taxa * amount;
		switch (tipo) {
			case "1":
				System.out.println("O valor convertido será de R$ " + conversor);
				break;
			case "2":
				System.out.println("O valor convertido será de R$ " + conversor);
				break;
			case "3":
				System.out.println("O valor convertido será de R$ " + conversor);
				break;
			case "4":
				System.out.println("O valor convertido será de R$ " + conversor);
				break;
			case "5":
				System.out.println("O valor convertido será de R$ " + conversor);
				break;
			default:
				System.out.println("Selecione o tipo de moeda que você quer converter");
				break;
		}
		return tipo;
	}

	public void start (int a, Cambio b) {
		Scanner sc = new Scanner(System.in);
		double taxa;
		switch (a) {
			case 1:
				System.out.println("Para qual moeda você quer converter o Real? " + "\n 1-Dólar \n 2-Euro \n 3-Libras Esterlinas"
						+ " \n 4-Peso Argentino \n 5-Peso Chileno");
				String moeda = sc.nextLine();
				b.setMoeda(moeda);
				System.out.println("Qual a taxa do " + b.getMoeda() + " em relação ao real hoje? ");
				taxa = sc.nextDouble();
				System.out.println("Quantos reais você quer converter? ");
				double reais = sc.nextDouble();

				b.conversao(reais, taxa, moeda);
				break;

			case 2:
				System.out.println("De qual moeda você quer converter para Real? " + "\n 1-Dólar \n 2-Euro \n 3-Libras Esterlinas"
						+ " \n 4-Peso Argentino \n 5-Peso Chileno");

				String moeda2 = sc.nextLine();
				b.setMoeda(moeda2);

				System.out.println("Qual a taxa do " + b.getMoeda() + " em relação ao real hoje? ");
				taxa = sc.nextDouble();
				System.out.println("Informe a quantidade de " + b.getMoeda() + " que deseja converter? ");
				double amount = sc.nextDouble();

				b.conversaoEstrangeira(amount, taxa, moeda2);
				break;
			case 9:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Você inseriu um valor errado, tente de novo.");
		}
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public String getMoeda() {
		switch (this.moeda) {
			case "1":
				this.moeda = "Dólar";
				break;
			case "2":
				this.moeda = "Euro";
				break;
			case "3":
				this.moeda = "Libras Esterlinas";
				break;
			case "4":
				this.moeda = "Peso Argentino";
				break;
			case "5":
				this.moeda = "Peso Chileno";
				break;
			default:
				System.out.println("Selecione o tipo de moeda que você quer converter");
				break;
		}
		return moeda;
	}
}
