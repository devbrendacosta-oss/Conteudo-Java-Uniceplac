package testefuncao02;

public class TesteFuncao02 {

    public static void main(String[] args) {
        System.out.println("Vai começar a contagem");
        
        // Chamando o método contador localizado na classe 'Operacoes'
        String res = Operacoes.contador(1, 5);
        System.out.println(res);
    }
}