public class Atv5 {
    public static void main(String[] args) {
        double custo = 100.0;
        double taxaImposto = 10.0; // 10% de imposto
        
        double custoComImposto = somaImposto(taxaImposto, custo);
        
        System.out.println("O custo do item, incluindo imposto, é: R$" + custoComImposto);
    }
    
    public static double somaImposto(double taxaImposto, double custo) {
        double valorImposto = custo * (taxaImposto / 100.0);
        return custo + valorImposto;
    }
}
