package aulas;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		/*Programinha de m�dia, para funcionar perfeitamente importe as bibliotecas abaixo
			import java.util.Locale;
			import java.util.Scanner;
		*/
		
		//Como est� em pt-BR para utilizamos a formata�a� padr�o dos n�meros reais com ","
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(new Locale("pt","BR"));
		
		//S� mudar o tamanho do vetor para a quantidade de numeros que voc� precisa da m�dia
		
		System.out.println("\t{Ol�, esse programa foi feito com o objetivo de calcular a\n\t m�dia de qualquer quantidade de numeros que voc� declarar}\n");
		System.out.println("--> Digite a quantidade de total de n�meros que voc� deseja calcular a m�dia:");
		int quantidade;
		quantidade = leitor.nextInt();
		double[] a = new double[quantidade]; 
		//double[] a = new double[10]; 
		double b = 0;
		int i;
		
		
		System.out.println("Digite os n�meros que voc� deseja calcular:");
		
		//L� os n�meros
		
		for(i = 0; i < a.length; i++) {
			a[i] = leitor.nextDouble();
		}
		
		//Soma
		
		for(i = 0; i < a.length; i++) {
			b += a[i];
		}
		
		//Divide e mostra a m�dia
		System.out.println("A m�dia �: " + b/i);
	}

}
