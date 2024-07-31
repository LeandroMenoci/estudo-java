package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        
        double a = 1; // implicito
        System.out.println(a);

        float b = (float) 1.10; // explicito (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // explicito
        System.out.println(d);

    }
}
