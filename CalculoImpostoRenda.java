import java.util.Scanner;

public class CalculoImpostoRenda {
    public static void main(String[] args) {
        Scanner Daemon = new Scanner(System.in);

        System.out.print("Digite seu salário bruto: ");
        double salario = Daemon.nextDouble();

        double[] faixasInss = {1621.00, 2902.84, 4354.27, 8475.55};
        double[] aliquotasInss = {0.075, 0.09, 0.12, 0.14};

        double salarioContribuicao;
        if (salario > faixasInss[3]) {
            salarioContribuicao = faixasInss[3];
        } else {
            salarioContribuicao = salario;
        }

        double inss = 0;
        double faixaAnterior = 0;
        int i = 0;

        while (i < faixasInss.length && salarioContribuicao > faixaAnterior) {
            double baseFaixa;

            if (salarioContribuicao < faixasInss[i]) {
                baseFaixa = salarioContribuicao - faixaAnterior;
            } else {
                baseFaixa = faixasInss[i] - faixaAnterior;
            }

            inss = inss + (baseFaixa * aliquotasInss[i]);
            faixaAnterior = faixasInss[i];
            i++;
        }

        double base = salario - inss;

        double aliquotaIr;
        double deducaoIr;

        if (base <= 2428.80) {
            aliquotaIr = 0;
            deducaoIr = 0;
        } else if (base <= 2826.65) {
            aliquotaIr = 0.075;
            deducaoIr = 182.16;
        } else if (base <= 3751.05) {
            aliquotaIr = 0.15;
            deducaoIr = 394.16;
        } else if (base <= 4664.68) {
            aliquotaIr = 0.225;
            deducaoIr = 675.49;
        } else {
            aliquotaIr = 0.275;
            deducaoIr = 908.73;
        }

        double irTabela = (base * aliquotaIr) - deducaoIr;

        if (irTabela < 0) {
            irTabela = 0;
        }

        double ir;

        if (salario <= 5000.00) {
            ir = 0;
        } else if (salario <= 7350.00) {
            double reducao = 908.73 - (0.133 * salario);

            if (reducao < 0) {
                reducao = 0;
            }

            ir = irTabela - reducao;

            if (ir < 0) {
                ir = 0;
            }
        } else {
            ir = irTabela;
        }

        System.out.println("Contribuição INSS: " + inss);
        System.out.println("Base de cálculo do IR: " + base);
        System.out.println("Imposto de Renda retido: " + ir);

        Daemon.close();
    }
}
