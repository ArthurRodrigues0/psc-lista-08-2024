public class Atv3 {
        public static void main(String[] args) {
            int a = 5;
            int b = 10;
            int c = 15;
            
            int soma = calcularSoma(a, b, c);
            
            System.out.println("A soma de " + a + ", " + b + " e " + c + " é: " + soma);
        }
        
        public static int calcularSoma(int x, int y, int z) {
            return x + y + z;
        }
    }

