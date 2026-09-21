// AULA 6 GUSTAVO GUANABARA - Tipos Primitivos e Manipulação de Dados: https://youtu.be/JEAQeT7YGs4?si=OEL8ysUoUaVMWaSY

package primeirademonstracao; // PACOTE = PASTA ONDE FICAM ARMAZENADOS OS ARQUIVOS

import java.util.Scanner; // IMPORTAÇÃO DA CLASSE SCANNER PARA PERMITIR ENTRADA DE DADOS PELO TECLADO

public class SegundaDemonstracao { // TODO PROGRAMA PRECISA DE UMA CLASSE
	
	public static void main(String[] args) { // MÉTODO PRINCIPAL "MAIN" - PONTO DE PARTIDA DE UM PROGRAMA 
		
        /* 
         * ==========================================
         * 1. ENTRADA DE DADOS E SAÍDA FORMATADA
         * ==========================================
         */
		Scanner teclado = new Scanner(System.in); // CRIANDO OBJETO SCANNER PARA MONITORAR A ENTRADA PADRÃO
		
		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine(); // LÊ UMA STRING (TEXTO) DIGITADA
		
		System.out.print("Digite a nota do aluno: ");
		Float nota = teclado.nextFloat(); // LÊ UM NÚMERO REAL (FLOAT) DIGITADO
		
		System.out.format("Sua nota de %s é %.4f \n", nome, nota); // %s PARA STRING, %.4f PARA FLOAT COM 4 CASAS DECIMAIS	
		
        /* 
         * ==========================================
         * 2. DECLARANDO VARIÁVEIS (TRÊS FORMAS BÁSICAS)
         * ==========================================
         * FAMÍLIAS: INTEIRO, REAL, CARACTERE E LÓGICO
         */

		// A) FORMA SIMPLES:
		int idade = 3;           // CLASSE INTEIRO - 4 BYTES 
		float sal = 2824.54f;    // CLASSE REAIS - float (4 bytes). Exige a letra 'f' no final.
		char letra = 'B';        // CLASSE LITERAIS - 1 BYTE (Aspas simples para 1 caractere).
		boolean casado = false;  // CLASSE LÓGICO - 1 BIT (true ou false)
		
		// B) USANDO TYPECAST: Força um valor a ser de um tipo específico.
		int dia = (int) 1;
		float acucar  = (float) 2824.54f;
		char vogal = (char) 'C'; 
		boolean casadoTypecast = (boolean) false;
		
		// C) USANDO WRAPPER CLASSES (Classes Invólucro): Cria objetos ao invés de variáveis primitivas e fornece métodos úteis. 
		Integer ano = new Integer(127);              // EXISTE UMA CLASSE INVÓLUCRO (Integer) - 4 BYTES
		Float tempero = new Float(2824.54f);         // EXISTE UMA CLASSE INVÓLUCRO (Float) - 4 BYTES
		Character letraWrapper = new Character('S'); // EXISTE UMA CLASSE INVÓLUCRO (Character) - 1 BYTE
		Boolean casadoWrapper = new Boolean(false);  // EXISTE UMA CLASSE INVÓLUCRO (Boolean) - 1 BIT
		
        /* 
         * OUTROS TIPOS PRIMITIVOS E SUAS CLASSES INVÓLUCRO:
         * byte -> Byte (1 byte)
         * short -> Short (2 bytes)
         * long -> Long (8 bytes)
         * double -> Double (8 bytes)
         * Nota: "String" não é tipo primitivo, é apenas Classe Invólucro (1 byte/caractere).
         */
		
        /* 
         * ==========================================
         * 3. SAÍDA DE DADOS (VARIAÇÕES)
         * ==========================================
         */
		Float notaSaida = 8.5f; 
		String nomeSaida = "Brenda";
		
		System.out.print("Sua nota é " + notaSaida + "\n"); // COM CONCATENAÇÃO (+)
		System.out.printf("Sua nota é %.2f \n", notaSaida); // PRINTF: IMPRESSÃO FORMATADA		
		System.out.printf("Sua nota de %s é %.4f \n", nomeSaida, notaSaida);		
		System.out.format("Sua nota é %.2f \n", notaSaida); // FORMAT: MESMA FUNÇÃO DO PRINTF

        /* 
         * ==========================================
         * 4. INCOMPATIBILIDADE E CONVERSÃO DE TIPOS
         * ==========================================
         */
		String valorStr = "30"; 
		
		// Para converter um número inteiro (int) em String, usa-se o método da Wrapper Class:
		String valorConvertido = Integer.toString(idade);
		
		// Para converter uma String em um número inteiro (int), usa-se o método parse:
		int idadeConvertida = Integer.parseInt(valorStr);
		
	}
}
