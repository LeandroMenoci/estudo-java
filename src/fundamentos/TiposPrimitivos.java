package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos numérios inteiros

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long ponstoAcumulados = 3_234_845_223L;

        // Tipos numérios reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_979_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVoos /2);

        // Pontos acumulados por real
        System.out.println(ponstoAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Está de férias? " + estaDeFerias);
        System.out.println("Status " + status);

    }
}
