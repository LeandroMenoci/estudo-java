package fundamentos.controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        double media = entrada.nextDouble();

        if(media <= 10 && media >= 7) {
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }

        if(media > 0 && media < 7) {
            System.out.println("Reprovado");
        }

        if(media > 10 || media < 0) {
            System.out.println("Informe um valor válido entre 0 e 10");
        }

        entrada.close();

    }
}
