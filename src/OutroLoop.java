import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;
        int totalDeNotas= 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliacao para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvalicao += nota;
                totalDeNotas++;

            }


        }
        System.out.println("media de avaliacao: " + mediaAvalicao/totalDeNotas);
    }

}
