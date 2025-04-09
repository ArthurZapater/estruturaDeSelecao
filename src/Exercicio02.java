import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        //Declaracao das variaveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        double prova1, prova2, trab1, trab2, trab3, mediaFinal;
        double mediaProva, mediaTrab;

        //Entrada de dados
        System.out.print("Digite a nota da primeira prova --> ");
        prova1 = teclado.nextDouble();

        System.out.print("Digite a nota da segunda prova --> ");
        prova2 = teclado.nextDouble();

        System.out.print("Digite a nota do primeiro trabalho --> ");
        trab1 = teclado.nextDouble();

        System.out.print("Digite a nota do segundo trabalho --> ");
        trab2 = teclado.nextDouble();

        System.out.print("Digite a nota do terceiro trabalho --> ");
        trab3 = teclado.nextDouble();

        //Processamento

        mediaProva = (prova1 + prova2) / 2 ;

        mediaTrab = (trab1 + trab2 + trab3) / 3;

        mediaFinal = (mediaProva * 0.7) + (mediaTrab * 0.3);

        //Saída

        System.out.println("Sua média final é --> " + df.format(mediaFinal));

        if (mediaFinal >= 5.9999999999){
            System.out.print("Você foi APROVADO");
        }
        else {
            System.out.print("Você foi REPROVADO");
        }




    }
}
