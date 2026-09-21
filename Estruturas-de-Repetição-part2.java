// AULA 12 GUSTAVO GUANABARA - Estruturas de Repetição (Parte 2): https://youtu.be/ojLALwmvQIU

package cursemvideo;

import java.util.Scanner;

public class AulaDoze {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        /* 
         * ==========================================
         * 1. ESTRUTURA DO-WHILE (Repita... Enquanto)
         * ==========================================
         * Exemplo: Executa pelo menos uma vez antes de validar a condição.
         */
        int cc = 0;
        
        System.out.println("Iniciando contagem com do-while:");
        do {
            cc++;
            System.out.println("Cambalhota " + cc);
        } while (cc < 4); // O teste lógico é feito no final (com ponto e vírgula)
        
        /* 
         * ==========================================
         * 2. EXEMPLO PRÁTICO: SOMA COM ENTRADA DO UTILIZADOR
         * ==========================================
         */
        System.out.println("\n--- Programa de Soma de Números ---");
        int n, soma = 0;
        String resp;
        
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            
            soma += n; // Acumula o valor introduzido
            
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();
            
        } while (resp.equalsIgnoreCase("S"));
        
        System.out.println("A soma de todos os valores introduzidos é: " + soma);
        
        teclado.close();
    }
}