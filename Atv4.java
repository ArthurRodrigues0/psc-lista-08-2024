public class Atv4 {
    public static void main(String[] args) {
        int numero = 7;
        
        char resultado = verificarPositivo(numero);
        
        System.out.println("O resultado é: " + resultado);
    }
    
    public static char verificarPositivo(int num) {
        if (num > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}
