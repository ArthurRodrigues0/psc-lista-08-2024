import java.util.Scanner;
public class Atv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            System.out.print("Digite a hora (formato 24 horas): ");
            int hora = scanner.nextInt();
            System.out.print("Digite os minutos: ");
            int minutos = scanner.nextInt();
            
            
            System.out.println("Hora convertida: " + converterHora(hora, minutos));
            
            
            System.out.print("Deseja converter outra hora? (S/N): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("S")) {
                break; 
            }
        }
        
        scanner.close();
    }
    
    
    public static String converterHora(int hora, int minutos) {
        String periodo;
        if (hora >= 0 && hora < 12) {
            periodo = "A.M.";
        } else {
            periodo = "P.M.";
            if (hora > 12) {
                hora -= 12;
            }
        }
        return hora + ":" + minutos + " " + periodo;
    }
}
