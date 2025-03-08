package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		String tentarDeNovo = "s";
		int parametroUm = 0;
		int parametroDois = 0;
		
		do {
			try {
				System.out.println();
				System.out.print("Digite o primeiro parâmetro: ");
				parametroUm = terminal.nextInt();
				
				System.out.print("Digite o segundo parâmetro: ");
				parametroDois = terminal.nextInt();
				
				contar(parametroUm, parametroDois);
			} catch (InputMismatchException e) {
				System.out.println("Parâmetro inválido. Digite um número inteiro");
			}catch (ParametrosInvalidosException exception) {
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				System.out.println("## O segundo parâmetro deve ser maior que o primeiro. ##");
			}
			
			System.out.print("Deseja tentar novamente(S/N)? ");
			tentarDeNovo = terminal.next();
		}while(tentarDeNovo.equals("s") || tentarDeNovo.equals("S"));
		
		terminal.close();
		System.out.println("------Terminou------");
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}else if(parametroUm == parametroDois) {
			System.out.println("Zero");
		}
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
		
		System.out.println("---------------------");
	}
}