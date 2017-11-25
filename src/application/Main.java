package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Arvore arvore = null;
		
		while (true) {
			if (arvore == null) {
				arvore = crieArvore(leitor);
			}

			if (arvore != null) {
				System.out.println("Lista de Opções\n");
				System.out.println("1 - inserir elemento na arvore.");
				System.out.println("2 - remover elemento da arvore.");
				System.out.println("3 - imprimir em ordem a arvore.");
				System.out.println("4 - imprimir em pre ordem a arvore.");
				System.out.println("5 - imprimir em pos ordem a arvore.");
				System.out.println("6 - ver altura da arvore.");
				System.out.println("\nDigite sua escolha: ");
			}

			String escolha = leitor.nextLine();

			switch (escolha.charAt(0)) {
			
			case '1':
				inserirElemento(arvore, leitor);
				break;
			case '2':
				removerElemento(arvore, leitor);
				break;
			case '3':
				arvore.imprimirEmOrdem();
				break;
			case '4':
				arvore.imprimirPreOrdem();
				break;
			case '5':
				arvore.imprimirPosOrdem();
				break;
			case '6':
				imprimirAltura(arvore);
				break;
			case ' ':
				System.out.println("Informe um opção.");
				break;
			}
		}
	}

	public static Arvore crieArvore(Scanner leitor) {
		System.out.println("Digite um valor para criação da arvore: ");
		String valor = leitor.nextLine();
		return new Arvore(Integer.parseInt(valor));
	}

	public static void inserirElemento(Arvore arvore, Scanner leitor) {
		System.out.println("Digite um valor para inserção: ");
		String valor = leitor.nextLine();
		arvore.inserir(Integer.parseInt(valor));
	}

	public static void removerElemento(Arvore arvore, Scanner leitor) {
		System.out.println("Digite um valor para remoção: ");
		String valor = leitor.nextLine();
		arvore.remover(Integer.parseInt(valor));
	}

	public static void imprimirAltura(Arvore arvore) {
		System.out.println("Altura: " + arvore.altura());
	}
}
