// AULA 10 GUSTAVO GUANABARA - Estruturas Condicionais (Parte 2): https://youtu.be/oNSrBld06qs

package cursemvideo;

import java.util.Scanner;

public class AulaDez {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        /* 
         * ==========================================
         * 1. ESTRUTURAS CONDICIONAIS ENCADEADAS (if / else if)
         * ==========================================
         * Exemplo: Verificar a obrigatoriedade do voto com base na idade.
         */
        System.out.print("Em que ano você nasceu? ");
        int nascimento = teclado.nextInt();
        int idade = 2015 - TdIdade(nascimento); // Exemplo baseado no ano de 2015 da aula
        
        System.out.println("Sua idade é " + idade + " anos.");
        
        // Condicionais encadeadas utilizando else if
        if (idade < 16) {
            System.out.println("Não vota.");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
            System.out.println("Voto opcional.");
        } else {
            System.out.println("Voto obrigatório.");
        }
        
        /* 
         * ==========================================
         * 2. ESTRUTURA DE MÚLTIPLA ESCOLHA (switch)
         * ==========================================
         * Exemplo: Classificar um ser de acordo com a quantidade de pernas.
         */
        System.out.print("\nQuantas pernas você tem? ");
        int pernas = teclado.nextInt();
        String tipo;
        
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        
        System.out.println("Isso é um(a): " + tipo);
        
        teclado.close();
    }
    
    // Método auxiliar simulando o cálculo direto da idade
    public static int TdIdade(int nasc) {
        return nasc;
    }
}