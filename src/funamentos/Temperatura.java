package funamentos;

public class Temperatura {

    public static void main(String[] args) {
        // (F - 32) * 5/9 = C
        int temperaturaF;
        final int subF = 32;
        final double fatorMult = 5/9.0;


        temperaturaF = 86;
        double temperaturaC = (temperaturaF - subF) * fatorMult;
        System.out.println(temperaturaC);

        temperaturaF = 150;
        temperaturaC = (temperaturaF - subF) * fatorMult;
        System.out.println(temperaturaC);
    }

}
