package classe;

public class DataTeste {
    public static void main(String[] args) {
        
        Data d1 = new Data();
        d1.dia = 2;
        d1.mes = 8;
        d1.ano = 2024;

        String dataFormatada = d1.obterDataFormatada();

        System.out.println(dataFormatada);
        System.out.println(d1.obterDataFormatada());

        d1.imprimirDataFormatada();

    }
}
