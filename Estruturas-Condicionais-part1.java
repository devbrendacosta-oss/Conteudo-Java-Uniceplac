// AULA 9 GUSTAVO GUANABARA - Estruturas Condicionais (Parte 1): https://youtu.be/wW3eve4vTMc

package primeirademonstracao; // PACOTE = PASTA ONDE FICAM ARMAZENADOS OS ARQUIVOS

import java.util.Scanner; // IMPORTAÇÃO DA CLASSE SCANNER PARA ENTRADA DE DADOS

public class QuintaDemonstracao { // TODO PROGRAMA PRECISA DE UMA CLASSE
	
	public static void main(String[] args) { 
		
        /* 
         * ==========================================
         * 1. ESTRUTURA CONDICIONAL SIMPLES (IF)
         * ==========================================
         * Exemplo: Cálculo de média escolar. Se a média for maior que 9, 
         * o programa exibe uma mensagem de parabéns. Caso contrário, segue o fluxo normal.
         */
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Primeira nota: ");
		float n1 = teclado.nextFloat();
		
		System.out.print("Segunda nota: ");
		float n2 = teclado.nextFloat();
		
		float m = (n1 + n2) / 2; // Cálculo da média
		System.out.println("A sua média foi: " + m);
		
		// Condicional Simples
		if (m > 9) {
			System.out.println("Parabéns, pequeno gafanhoto!"); // Executado apenas se a condição for verdadeira
		}
		
        /* 
         * ==========================================
         * 2. ESTRUTURA CONDICIONAL COMPOSTA (IF-ELSE)
         * ==========================================
         * Exemplo: Verificar se um número digitado é PAR ou ÍMPAR.
         * Se o resto da divisão por 2 for igual a 0, é par; senão, é ímpar.
         */
		System.out.print("Digite um número inteiro: ");
		int valor = teclado.nextInt();
		
		// Condicional Composta (Se / Senão)
		if (valor % 2 == 0) {
			System.out.println("O número " + valor + " é PAR.");
		} else {
			System.out.println("O número " + valor + " é ÍMPAR.");
		}
		
	}
}
