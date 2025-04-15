import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        //Declaração da variáveis
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;

        //Entrada de dados
        System.out.print("Digite o valor do primeiro numero --> ");
        lado1 = sc.nextDouble();
        System.out.print("Digite o valor do segundo numero --> ");
        lado2 = sc.nextDouble();
        System.out.print("Digite o valor do terceiro numero --> ");
        lado3 = sc.nextDouble();

        //Condição para ser um triângulo
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2){
            System.out.println("Os valores representam os lados do triângulo");
        }
        else {
            System.out.println("Os valores não formam um triângulo");
        }



    }
}
