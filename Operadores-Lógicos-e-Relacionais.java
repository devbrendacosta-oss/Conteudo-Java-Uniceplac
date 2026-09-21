// AULA 8 GUSTAVO GUANABARA - Operadores Lógicos e Relacionais: https://youtu.be/xHgnlic7fj8?si=QYmyeOFPpHTLQQrz

package primeirademonstracao; // PACOTE = PASTA ONDE FICAM ARMAZENADOS OS ARQUIVOS

public class QuartaDemonstracao { // TODO PROGRAMA PRECISA DE UMA CLASSE
	
	public static void main(String[] args) { 
		
        /* 
         * ==========================================
         * 1. OPERADOR TERNÁRIO (? :)
         * ==========================================
         * Sintaxe: (condição) ? valorSeVerdadeiro : valorSeFalso;
         */
		int n1 = 14;
		int n2 = 18;
		
		// Atribui o maior valor entre n1 e n2 à variável 'res'
		int res = (n1 > n2) ? n1 : n2;
		System.ex.out.println("O maior número é: " + res); // (Ajuste para System.out.println abaixo)
		System.out.println("O maior número é: " + res);
		
        /* 
         * ==========================================
         * 2. COMPARAÇÃO DE STRINGS (.equals)
         * ==========================================
         * Para objetos (como String), o operador '==' compara a referência de memória,
         * enquanto o método '.equals()' compara o conteúdo real do texto.
         */
		String nome1 = "Gustavo";
		String nome2 = "Gustavo";
		String nome3 = new String("Gustavo"); // Instanciado com 'new', ocupa outro espaço na memória
		
		System.out.println("nome1 é igual a nome2 (conteúdo)? " + nome1.equals(nome2)); // true
		System.out.println("nome1 é igual a nome3 (conteúdo)? " + nome1.equals(nome3)); // true (compara o texto)
		
        /* 
         * ==========================================
         * 3. OPERADORES LÓGICOS (&&, ||, ^, !)
         * ==========================================
         */
		int x = 4;
		int y = 7;
		int z = 12;
		
		// Operador E (&&): Ambas as expressões precisam ser verdadeiras
		boolean r1 = (x < y && y < z); // true && true -> true
		System.out.println("Resultado do operador E (&&): " + r1);
		
		// Operador OU (||): Pelo menos uma expressão precisa ser verdadeira
		boolean r2 = (x < y || y == z); // true || false -> true
		System.out.println("Resultado do operador OU (||): " + r2);
		
		// Operador OU Exclusivo (^): Apenas uma pode ser verdadeira, mas não ambas
		boolean r3 = (x < y ^ y == z); // true ^ false -> true
		System.out.println("Resultado do OU Exclusivo (^): " + r3);
		
		// Operador NÃO (!): Inverte o valor lógico
		boolean r4 = !r1; // Inverte o valor de r1
		System.out.println("Resultado do operador NÃO (!): " + r4);
		
	}
}
