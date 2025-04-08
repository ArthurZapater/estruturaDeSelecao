    /*Programa exemplo para calcular
        a média entre duas notas e imprimir a situação de aluno
    */

    import java.text.DecimalFormat;
    import java.util.Scanner;

    public class Exemplo01 {
    public static void main(String[] args) {


        //Declaração das variaveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        //Entrada de dados
        System.out.print("Digite a primeira nota --> ");
        nota1 = teclado.nextDouble();

        System.out.print("Digite a segunda nota --> ");
        nota2 = teclado.nextDouble();

        //processamento

        media = (nota1 + nota2) / 2;


        //Saída de dados

        System.out.println("Sua média é --> " + df.format(media));

        if (media >= 6) {
            System.out.println("Você está APROVADO");
        }
        else {
            System.out.println("Você está REPROVADO");
        }

    }
}
