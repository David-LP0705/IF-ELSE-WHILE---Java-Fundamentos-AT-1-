import java.util.Scanner;

public class CalculoINSS {
    public static void main(String[] args) {
        Scanner Daemon = new Scanner(System.in);

        System.out.print("Digite seu salário bruto: ");
        double salario = Daemon.nextDouble();

        double[] faixas = {1621.00, 2902.84, 4354.27, 8475.55};
        double[] aliquotas = {0.075, 0.09, 0.12, 0.14};

        double salarioContribuicao;
        if (salario > faixas[3]) {
            salarioContribuicao = faixas[3];
        } else {
            salarioContribuicao = salario;
        }

        double contribuicao = 0;
        double faixaAnterior = 0;
        int i = 0;

        while (i < faixas.length && salarioContribuicao > faixaAnterior) {
            double baseFaixa;

            if (salarioContribuicao < faixas[i]) {
                baseFaixa = salarioContribuicao - faixaAnterior;
            } else {
                baseFaixa = faixas[i] - faixaAnterior;
            }

            contribuicao = contribuicao + (baseFaixa * aliquotas[i]);
            faixaAnterior = faixas[i];
            i++;
        }

        double salarioLiquido = salario - contribuicao;

        System.out.println("Contribuição INSS: " + contribuicao);
        System.out.println("Salário líquido: " + salarioLiquido);

        Daemon.close();
    }
}
