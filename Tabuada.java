import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner Daemon = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = Daemon.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        Daemon.close();
    }
}
