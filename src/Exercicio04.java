import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        //Declaracao das variaveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double x, y;

        //Entrada de dados
        System.out.print("Digite o numero de x que seja maior que 5 ou menor que -5 --> ");
        x = sc.nextDouble();

        //Processamento
        if (x>5 || x<-5){
            y = 8.0 / Math.sqrt(Math.pow(x,2.0) - 25.0);
            System.out.print("Resultado --> " + df.format(y));
        }
        else {
            System.out.println("Seu X não é valido, operação encerrada.SEU BURRO");
        }






    }
}
