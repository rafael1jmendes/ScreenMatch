public class Condicional {
    public static void main(String[] args) {
        int anoDeLacamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLacamento >= 2022) {
            System.out.println( "Lancamento que os clientes estao curtindo!");
        } else {
            System.out.println("Filme retro que vale a pena assistir!");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Pague para assitir");
        }
    }
}
