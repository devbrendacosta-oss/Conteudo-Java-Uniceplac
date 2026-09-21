// AULA 14 GUSTAVO GUANABARA - Vetores: https://youtu.be/KAS94-Lcboc

package cursemvideo;

import java.util.Arrays;

public class AulaQuatorze {

    public static void main(String[] args) {
        
        /* 
         * ==========================================
         * 1. DECLARAÇÃO E INICIALIZAÇÃO DE VETORES
         * ==========================================
         */
        // Forma 1: Declarar tamanho e atribuir valores manualmente
        int n[] = new int[4]; 
        n[0] = 3;
        n[1] = 5;
        n[2] = 8;
        n[3] = 9;
        
        // Forma 2: Declaração direta com atribuição de valores (o Java descobre o tamanho)
        int num[] = {3, 5, 8, 9, 2, -7, 13};
        
        System.out.println("O vetor 'num' possui " + num.length + " elementos.");
        
        // Exibindo os elementos do vetor com um laço 'for' tradicional
        System.out.println("\nElementos do vetor 'num':");
        for (int c = 0; c < num.length; c++) {
            System.out.println("Na posição " + c + " temos o valor " + num[c]);
        }
        
        /* 
         * ==========================================
         * 2. CLASSE AUXILIAR java.util.Arrays
         * ==========================================
         */
        // Preenchimento automático de vetores (Ex: preencher tudo com o número 7)
        int v[] = new int[5];
        Arrays.fill(v, 7);
        
        System.out.println("\nVetor preenchido com Arrays.fill:");
        for (int valor : v) { // Exemplo de uso do For-Each
            System.out.print(valor + " ");
        }
        System.out.println();
        
        // Ordenação de vetores
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        Arrays.sort(vet); // Ordena os elementos em ordem crescente
        
        System.out.println("\nVetor ordenado (Arrays.sort):");
        for (int i : vet) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Busca binária (O vetor DEVE estar ordenado previamente)
        int p = Arrays.binarySearch(vet, 6);
        System.out.println("\nO valor 6 foi encontrado na posição: p = " + p);
    }
}