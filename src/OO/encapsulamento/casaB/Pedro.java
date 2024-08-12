package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    // Ana mae = new Ana(); // por ser herança não é necessário instanciar

    void testeAcessos() {
        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem
        
        // System.out.println(segredo); 
        // System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);

    }
}
