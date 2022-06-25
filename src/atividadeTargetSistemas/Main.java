package atividadeTargetSistemas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o numero para verificar sua existencia na sequencia fibonacci: ");
		int valor = read.nextInt();
		
		if(verificaFibonacci(valor)) {
			System.out.println("O valor está na sequencia!");
		} else {
			System.out.println("Valor não encontrado na sequencia");
		}
	}
	
	static boolean verificaFibonacci(int valor) {
		int fibo = 0, aux = 5;
		
		if (valor >= 0  && valor <= 3) return true;
		
		while (fibo < valor) {
			fibo = fibonacci(aux);
			if (fibo == valor) return true;
			aux++;
		}
		
		return false;
	}
	
	static int fibonacci(int i){
		if(i==1||i==2) return 1;
		return fibonacci(i-1) + fibonacci (i-2);
	}
}
