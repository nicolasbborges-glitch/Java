public class ListaOperadores {

    public static void main(String[] args) {

        System.out.println("=== 1 - Cálculo para Empresa TERMAL ===");
        double instalacao = 300.00, limpeza = 150.00, manutencao = 499.99;
        double totalServicos = instalacao + limpeza + manutencao;
        System.out.println("Total a pagar: R$" + totalServicos + "\n");

        System.out.println("=== 2 - Cálculo de Salário ===");
        double valorHora = 35.00;
        int horasPorDia = 8;
        double salarioDia = valorHora * horasPorDia;
        System.out.println("Salário diário: R$" + salarioDia + "\n");

        System.out.println("=== 3 - Caixas de Bombons ===");
        int bombonsPorCaixa = 27, caixasCompradas = 16;
        int totalBombons = bombonsPorCaixa * caixasCompradas;
        System.out.println("Total de bombons: " + totalBombons + "\n");

        System.out.println("=== 4 - Garrafas de Água ===");
        int totalGarrafas = 300, garrafasPorCaixa = 20;
        int caixasUsadas = totalGarrafas / garrafasPorCaixa;
        System.out.println("Caixas utilizadas: " + caixasUsadas + "\n");

        System.out.println("=== 5 - Cálculo para Camisetas ===");
        int camisetasCompradas1 = 120, camisetasVendidas = 80, camisetasCompradas2 = 50;
        int camisetasRestantes = (camisetasCompradas1 - camisetasVendidas) + camisetasCompradas2;
        double precoCamiseta = 30.00, faturamento = camisetasVendidas * precoCamiseta;
        System.out.println("Camisetas no estoque: " + camisetasRestantes);
        System.out.println("Faturamento: R$" + faturamento + "\n");

        System.out.println("=== 6 - Dobro e Metade ===");
        int numero = 20;
        int dobro = numero * 2;
        double metade = numero / 2.0;
        System.out.println("Número: " + numero);
        System.out.println("Dobro: " + dobro);
        System.out.println("Metade: " + metade + "\n");
    }
}