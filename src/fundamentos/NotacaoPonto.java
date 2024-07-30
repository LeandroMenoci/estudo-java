package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {
        
        // double a = 2.3;
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!!!");

        System.out.println(s);

        System.out.println("Leandro".toUpperCase());

        String x = "Romano".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Leandro");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        int a = 3;
        // a. // nada acontece
        System.out.println(a);
    }

}
