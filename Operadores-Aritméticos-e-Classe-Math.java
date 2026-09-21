// AULA 7 GUSTAVO GUANABARA - Operadores Aritméticos e uma Classe Math: https://youtu.be/W9V5wtOOZHs?si=V-1EQDHwQ0MpcfQH

package primeirademonstracao; // PACOTE = PASTA ONDE FICAM ARMAZENADOS OS ARQUIVOS

public class TerceiraDemonstracao { // TODO PROGRAMA PRECISA DE UMA CLASSE
	
	public static void main(String[] args) { 
		
        /* 
         * ==========================================
         * 1. OPERADORES ARITMÉTICOS BÁSICOS
         * ==========================================
         */
		int n1 = 3;
		int n2 = 5;
		float m = (n1 + n2) / 2.0f; // Média. O .0f garante que a divisão resulte num float e não num inteiro
		System.out.println("A média é igual a: " + m);
		
        /* 
         * ==========================================
         * 2. OPERADORES UNÁRIOS (INCREMENTO / DECREMENTO)
         * ==========================================
         */
		int numero = 5;
		int valorPosIncremento = 5 + numero++; // Soma 5 + 5, a variável 'valorPosIncremento' vira 10, e DEPOIS 'numero' vira 6
		System.out.println("Pós-incremento: " + valorPosIncremento);
		
		int numero2 = 5;
		int valorPreIncremento = 5 + ++numero2; // Primeiro 'numero2' vira 6, depois soma 5 + 6. Variável 'valorPreIncremento' vira 11
		System.out.println("Pré-incremento: " + valorPreIncremento);

        /* 
         * ==========================================
         * 3. OPERADORES DE ATRIBUIÇÃO
         * ==========================================
         */
		int x = 4;
		x += 2; // O mesmo que: x = x + 2 (x passa a valer 6)
		x *= 2; // O mesmo que: x = x * 2 (x passa a valer 12)
		System.out.println("Valor da atribuição: " + x);
		
        /* 
         * ==========================================
         * 4. CLASSE MATH (CÁLCULOS AVANÇADOS E ARREDONDAMENTOS)
         * ==========================================
         */
		
		// Potência (Exponenciação) -> 5 ao quadrado
		double potencia = Math.pow(5, 2);
		System.out.println("5 elevado a 2 é: " + potencia);
		
		// Raiz Quadrada
		double raiz = Math.sqrt(25);
		System.out.println("A raiz quadrada de 25 é: " + raiz);
		
		// Raiz Cúbica
		double raizCub = Math.cbrt(27);
		System.out.println("A raiz cúbica de 27 é: " + raizCub);
		
		// Valor Absoluto (Tira o sinal negativo)
		int absoluto = Math.abs(-10);
		System.out.println("O valor absoluto de -10 é: " + absoluto);

		// Arredondamentos
		float numArredondar = 8.5f;
		
		int arredondaBaixo = (int) Math.floor(numArredondar); // Arredonda para 8 (Note o typecast (int) para converter double em int)
		int arredondaCima = (int) Math.ceil(numArredondar);   // Arredonda para 9
		int arredondaNormal = (int) Math.round(numArredondar);// Arredonda para 9 (Aritmético)
		
		System.out.println("Arredondar para baixo: " + arredondaBaixo);
		System.out.println("Arredondar para cima: " + arredondaCima);
		System.out.println("Arredondamento normal: " + arredondaNormal);
		
		// Gerador de Números Aleatórios
		double aleatorioDouble = Math.random(); // Gera um número entre 0.0 e 1.0
		System.out.println("Número aleatório puro: " + aleatorioDouble);
		
		// Gerando número aleatório entre 5 e 10 inteiros
		int min = 5;
		int max = 10;
		int nAleatorio = (int) (min + aleatorioDouble * (max - min + 1)); 
		System.out.println("Número aleatório entre 5 e 10: " + nAleatorio);
		
	}
}
