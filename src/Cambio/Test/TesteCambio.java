package Cambio.Test;

import Cambio.Domain.Cambio;

import java.util.Scanner;
public class TesteCambio {

	public static void main(String[] args) {
		Cambio cambio = new Cambio();
		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		while (escolha != 9){
			cambio.displayMenu();
			escolha = sc.nextInt();

			cambio.start(escolha, cambio);
		}
		System.out.println();
		sc.close();
	}

}
