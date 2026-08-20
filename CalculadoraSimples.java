import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner Daemon = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int a = Daemon.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int b = Daemon.nextInt();

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (b != 0) {
            double divisao = (double) a / b;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão: não é possível dividir por zero");
        }

        Daemon.close();
    }
}
