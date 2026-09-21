// AULA 13 GUSTAVO GUANABARA - Estruturas de Repetição (Parte 3): https://youtu.be/XLqPZh6n8IA

package cursemvideo;

public class AulaTreze {

    public static void main(String[] args) {
        
        /* 
         * ==========================================
         * 1. ESTRUTURA FOR (Variável de Controlo)
         * ==========================================
         * Exemplo: Contagem de 1 até 4 com incremento unitário automático.
         */
        System.out.println("Contagem normal de 1 até 4:");
        for (int cc = 1; cc <= 4; cc++) {
            System.out.println("Cambalhota " + cc);
        }
        
        /* 
         * ==========================================
         * 2. EXEMPLOS DE VARIAÇÕES NO FOR
         * ==========================================
         */
        // Contagem de 5 até 15, pulando de 2 em 2
        System.out.println("\nContagem de 5 a 15 (passo 2):");
        for (int i = 5; i <= 15; i += 2) {
            System.out.println("Valor: " + i);
        }
        
        // Contagem decrescente de 15 até 5, tirando de 2 em 2
        System.out.println("\nContagem decrescente (15 até 5):");
        for (int i = 15; i >= 5; i -= 2) {
            System.out.println("Valor decrescente: " + i);
        }
        
        /* 
         * ==========================================
         * 3. LAÇOS ANINHADOS (Loops Aninhados)
         * ==========================================
         */
        System.out.println("\nExemplo de Laços Aninhados:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 2; j += 2) {
                System.out.println("I = " + i + " | J = " + j);
            }
        }
    }
}