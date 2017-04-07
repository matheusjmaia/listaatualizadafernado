
import java.util.Scanner;

public class EXE7 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite a idade do idade do conveniado");
        int idade = console.nextInt();
        if (idade < 10) {
            int valor = 100 + 80;
            System.out.println("O valor a ser pago será " + valor + " Reais.");

        }
        if ((idade >= 10) && (idade < 30)) {
            int valor = 100 + 50;
            System.out.println("O valor a ser pago será " + valor + " Reais.");

        }
        if ((idade >= 30) && (idade <= 60)) {
            int valor = 100 + 95;
            System.out.println("O valor a ser pago será " + valor + " Reais.");

        }

        if (idade > 60) {
            int valor = 100 + 130;
            System.out.println("O valor a ser pago será " + valor + " Reais.");

        }
    }

}
