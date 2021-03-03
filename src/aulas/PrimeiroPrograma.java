package aulas;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		/*Programinha de média, para funcionar perfeitamente importe as bibliotecas abaixo
			import java.util.Locale;
			import java.util.Scanner;
		*/
		
		//Como está em pt-BR para utilizamos a formataçaõ padrão dos números reais com ","
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(new Locale("pt","BR"));
		
		//Só mudar o tamanho do vetor para a quantidade de numeros que você precisa da média
		
		System.out.println("\t{Olá, esse programa foi feito com o objetivo de calcular a\n\t média de qualquer quantidade de numeros que você declarar}\n");
		System.out.println("--> Digite a quantidade de total de números que você deseja calcular a média:");
		int quantidade;
		quantidade = leitor.nextInt();
		double[] a = new double[quantidade]; 
		//double[] a = new double[10]; 
		double b = 0;
		int i;
		
		
		System.out.println("Digite os números que você deseja calcular:");
		
		//Lê os números
		
		for(i = 0; i < a.length; i++) {
			a[i] = leitor.nextDouble();
		}
		
		//Soma
		
		for(i = 0; i < a.length; i++) {
			b += a[i];
		}
		
		//Divide e mostra a média
		System.out.println("A média é: " + b/i);
	}

}
