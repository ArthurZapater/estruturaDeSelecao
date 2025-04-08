import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        //Declaração das variáveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);
        double total, totalComDesconto, valorEconomizado;

        //Entrada de dados
        System.out.print("Digite o total da sua compra --> ");
        total = teclado.nextDouble();

        //Processamento
        if (total > 1000){
            totalComDesconto = total * 0.85;
        }
        else {
            totalComDesconto = total * 0.92;
        }
        valorEconomizado = total - totalComDesconto;

        //Saída de dados
        System.out.println("Total com desconto R$" + df.format(totalComDesconto));
        System.out.println("Valor economizado R$" + df.format(valorEconomizado));


    }
}
