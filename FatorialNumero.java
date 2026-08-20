import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {
        Scanner Daemon = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = Daemon.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido");
        } else {
            long fatorial = 1;
            int i = numero;

            while (i > 1) {
                fatorial = fatorial * i;
                i--;
            }

            System.out.println("Fatorial de " + numero + " é " + fatorial);
        }

        Daemon.close();
    }
}
