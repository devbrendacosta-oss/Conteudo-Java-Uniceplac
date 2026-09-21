// AULA 11 GUSTAVO GUANABARA - Estruturas de Repetição (Parte 1): https://youtu.be/2fawKjR8d4c

package cursemvideo;

import java.util.Scanner;

public class AulaOnze {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        /* 
         * ==========================================
         * 1. ESTRUTURA DE REPETIÇÃO WHILE (Enquanto)
         * ==========================================
         * Exemplo: Contagem simples de 1 até 10 usando o teste lógico no início.
         */
        int cc = 0; // Declaração e inicialização do contador
        
        System.out.println("Iniciando a contagem de cambalhotas:");
        while (cc < 10) {
            cc++; // Incrementa o contador (equivalente a cc = cc + 1)
            System.out.println("Cambalhota " + cc);
        }
        
        /* 
         * ==========================================
         * 2. MODIFICADORES DE FLUXO (continue e break)
         * ==========================================
         * Exemplo utilizando o while com restrições de fluxo.
         */
        System.out.println("\nContagem com modificadores (continue e break):");
        int contador = 0;
        
        while (contador < 10) {
            contador++;
            
            // Se o contador for 2, pula a exibição atual (continue)
            if (contador == 2) {
                continue; 
            }
            
            // Se o contador for 8, interrompe o laço totalmente (break)
            if (contador == 8) {
                break; 
            }
            
            System.out.println("Número: " + contador);
        }
        
        teclado.close();
    }
}