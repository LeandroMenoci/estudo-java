package OO.heranca;

public class Jogo {
    public static void main(String[] args) {
        
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Jogador heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;



        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);


        System.out.println("O monstro tem => " + monstro.vida);
        System.out.println("O heroi tem => " + heroi.vida);
    }
}
