public class BMExercicio03 {
    public static void main(String[] args) {
        double lapis = 2.95;
        double caneta = 3.50;

        System.out.println("O item 1 (lápis) custa R$ " + lapis);
        System.out.println("O item 2 (caneta) custa R$ " + caneta);

        double custoTotal = lapis + caneta;
        System.out.println("O custo final da compra é de R$ " + custoTotal);
        
        final double TAXA = 8.25/100;
        double taxaCalculada = custoTotal * TAXA;
        System.out.println("O valor da taxa calculada é de R$ " + taxaCalculada);

        lapis += TAXA; caneta += TAXA;
        double novoCusto = lapis + caneta;

        boolean muitoCaro = (novoCusto>10);
        System.out.println("A resposta obtida pela variável muitoCaro foi: " + muitoCaro);
    }
}
