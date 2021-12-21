package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Cliente;

public class Prog_banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cli;
		System.out.print("conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.print("nome: ");
		String nome = sc.nextLine();

		System.out.print("Tem deposito inicial? s/n:");
		char resp = sc.next().charAt(0);
		
		if (resp == 's') {
			System.out.print("deposito inicial:");
			double depini = sc.nextDouble();
			cli = new Cliente(conta, nome, depini);
		}
		else 	cli = new Cliente(conta, nome);
		

		System.out.println(cli.toString());

		System.out.print("Informe deposito: ");
		double deposito = sc.nextDouble();
		cli.deposito(deposito);

		System.out.println(cli.toString());

		System.out.print("Informe retirada: ");
		double retirada = sc.nextDouble();
		cli.retirada(retirada);

		System.out.println(cli);

		sc.close();

	}

}
