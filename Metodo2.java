package testefuncao02;

public class Operacoes {
    
    // Método público e estático que retorna uma String formatada com uma contagem
    public static String contador(int inicio, int fim) {
        String s = "";
        for (int c = inicio; c <= fim; c++) {
            s += c + " ";
        }
        return s;
    }
}