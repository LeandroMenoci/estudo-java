package classe;

public class PrimeiroTrauma {

    int a = 3; // não pode mexer nessa linha
    static int b = 4;

    public static void main(String[] args) {
        // consegue acessar um membro de instancia a partir de um método static se criar uma instancia
        PrimeiroTrauma p = new PrimeiroTrauma(); 
        System.out.println(p.a);

        // um membro static consegue acessar outro membro static sem acessar uma instancia antes
        System.out.println(b);

    }
}
