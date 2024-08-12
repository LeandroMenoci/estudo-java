package OO.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(-30);
        
        // p1.idade = -30; // alterar o valor da variável
        // System.out.println(p1.idade); // ler o valor da variável
        p1.setIdade(-13);
        System.out.println(p1.getIdade());
    }
}
