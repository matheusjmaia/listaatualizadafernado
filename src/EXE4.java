
import java.util.Scanner;

public class EXE4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Insira o número do mês:");
        byte mes = console.nextByte();
        System.out.println("Insira o ano:");
        int ano = console.nextInt();
        int anobi2 = ano % 4;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 dias");
                break;
            case 2:
                if (anobi2 == 0) {
                    switch (mes) {
                        case 2:
                            System.out.println("29 dias");
                            break;
                    }
                }
                if (!(anobi2 == 0)) {
                    switch (mes) {
                        case 2:
                            System.out.println("28 dias");
                    }

                }

        }
    }
}
