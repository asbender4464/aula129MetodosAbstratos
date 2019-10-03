package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidadeEnum.CorDaForma;
import entidades.FormasGenericas;
import entidades.Retangulo;
import entidades.Circulo;

public class MetodosAbstratos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Para se usar do POLIMORFISMO, é vital que 'List' aponte para a Super Classe
		 * 'FormasGenericas'. Desse modo, Retangulo e Circulo, subclasses herdeiras,
		 * se valerão do recurso.
		 */
		List<FormasGenericas> lista = new ArrayList<>();
		
		System.out.print("Informe o número de figuras: ");
		int n = sc.nextInt();
		for (int i=1; i <= n; i++) {
			System.out.println("Dados da figura #" + i + ": ");
			System.out.print("A figura é um retângulo (r) ou um círculo (c): ");
			char ch = sc.next().charAt(0);
			System.out.print("Qual é a cor da figura (VERMELHO, AZUL, PRETO): ");
			CorDaForma cor = CorDaForma.valueOf(sc.next()); 
			if (ch == 'r') {
				System.out.println("Largura: ");
				double largura = sc.nextDouble();
				System.out.println("Altura: ");
				double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
			}
			else {
				System.out.println("Raio: ");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println();
		System.out.println("ÁREA DAS FIGURAS:");
		for (FormasGenericas formasGenericas: lista) {
			System.out.println(String.format("%.2f", formasGenericas.area()));
		}
		
		sc.close();
	}

}
