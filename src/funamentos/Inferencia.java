package funamentos;

public class Inferencia {
    public static void main(String[] args) {
        
        double a = 4.5; // declaração e inicialização
        System.out.println(a);

        var b = 5.5; // java já identifica o tipo da variável tipo double
        System.out.println(b);

        var c = "Um texto!"; // java já identifica o tipo da variável tipo string
        System.out.println(c);

        c = "outro texto";
        System.out.println(c);

        // c = 5; // se a variável for do tipo string, não é possível utilizar o tipo int ou outro tipo de declaração
        // System.out.println(c);

        double d; // variável foi declarada
        d = 145.2; // variário foi inicializada
        System.out.println(d); // usada!

    }
}
