import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner Daemon = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = Daemon.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = Daemon.nextInt();

        int inicio;
        int fim;

        if (a <= b) {
            inicio = a;
            fim = b;
        } else {
            inicio = b;
            fim = a;
        }

        System.out.println("Números pares:");

        int i = inicio;
        while (i <= fim) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("Números ímpares:");

        i = inicio;
        while (i <= fim) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

        Daemon.close();
    }
}
