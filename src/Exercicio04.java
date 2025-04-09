import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        //Declaracao das variaveis
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double x, y;

        //Entrada de dados
        System.out.print("Digite o numero de x --> ");
        x = sc.nextDouble();

        if (x>5 || x<-5){
            System.out.println("Seu x é valido segue a conta abaixo:");
        }



    }
}
