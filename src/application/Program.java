package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws Exception {
		/*
		 * Criação de banco;
		 * 
		 * criar contas correntes, contas poupança: salvar em estruturas tipo Lista;
		 * 
		 * RN: clientes podem possuir mais de um tipo de Conta;
		 * 
		 * criar método para somar o saldo de todas as contas;
		 * 
		 * Criar interface Tributavel, nas classes ContaCorrente e ContaSalario;
		 * 
		 * Faça um método que permita transferir valores entre contas, parametros
		 * (quantia, conta);
		 * 
		 * Faça um menu
		 */

		System.out.println("====================================");
		System.out.println("***Banco do Higor***");
		System.out.println("====================================");
		System.out.println();
		System.out.println();

		int option = 0;
		do {
			System.out.println("--------------------------------------------------");
			System.out.println("***Menu de opções***");
			System.out.println();
			System.out.println();
			System.out.println("1- Criar conta:");
			System.out.println();
			System.out.println("2- Sacar:");
			System.out.println();
			System.out.println("3- Depositar:");
			System.out.println();
			System.out.println("4- Criar cliente:");
			System.out.println();
			System.out.println("5- Transferir valores:");
			System.out.println();
			System.out.println("6- Mostrar montante disponivel nas contas:");
			System.out.println();
			System.out.println("7- Sair:");
			System.out.println("--------------------------------------------------");

			Scanner scanner = new Scanner(System.in);

			System.out.println("Escolha a opção desejada: ");
			option = scanner.nextInt();

			process(option);
			option = scanner.nextInt();
		} while (option != 0);
	}

	public static void process(int option) throws Exception {
		switch (option) {
		case 1: {
			System.out.println("Criar conta: ");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Qual tipo de conta o sr(a) quer abrir?: ");
			
		}
			break;
		case 2: {
			System.out.println("opção 2");
		}
			break;
		case 3: {
			System.out.println("opção 3");
		}
			break;
		case 4: {
			System.out.println("opção 4");
		}
			break;
		case 5: {
			System.out.println("opção 5");
		}
			break;
		case 6: {
			System.out.println("opção 6");
		}
			break;
		case 7: {
			System.out.println("opção 7");
		}
			break;
		default:
			break;
		}
	}
}