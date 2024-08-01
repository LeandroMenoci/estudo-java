package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {
        
        double media = 8;
        String resultadoRecuperacao = media >= 5.0 ? "em recuperação." : "reprovado.";
        String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoRecuperacao;
        // String resultado = media >= 7.0 ? "Aprovado" : media >= 5.0 ? "em recuperação." : "reprovado.";
        System.out.println("O aluno em está " + resultadoFinal);

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "sim" : "não";

        System.out.println("Tem desconto? " + resultado);

    }
}
