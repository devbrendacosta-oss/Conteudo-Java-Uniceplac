package testefuncao01;

public class TesteFuncao01 {

    // Procedimento (não retorna valor -> void)
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }

    // Função (retorna um valor inteiro -> int)
    static int somar(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa");
        
        // Chamada do procedimento
        soma(5, 2);
        
        // Chamada da função com atribuição do valor retornado
        int sm = somar(5, 2);
        System.out.println("A soma vale " + sm);
    }
}