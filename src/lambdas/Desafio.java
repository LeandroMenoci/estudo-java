package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {


        Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> impostoMunicipal = v -> v >= 2500 ? v * 1.085 : v;
        UnaryOperator<Double> frete = p -> p >= 3000 ? p + 100 : p + 50;
        UnaryOperator<Double> arrendondar = p -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", p));
        Function<Double, String> formatar = p -> ("R$" + p).replace(",", ".");

        Produto p1 = new Produto("iPad",3235.89, 0.13);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arrendondar)
                .andThen(formatar)
                .apply(p1);

        System.out.println("O preço final é " + preco);
    }
}
