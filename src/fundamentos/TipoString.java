package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        
        System.out.println("Olá pessoal".charAt(4));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!!!"));
        System.out.println(s + "!!!!!");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12334.12;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + 
        "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f. \n\n", 
        nome, sobrenome, idade, salario);

        String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.\n\n", 
        nome, sobrenome, idade, salario);
        System.out.println(frase);

    }
}
