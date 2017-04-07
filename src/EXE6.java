
import java.util.Scanner;

public class EXE6 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Digite o dia da semana em números: ");
    int dia = console.nextInt();
    switch (dia){
        case 1:
            System.out.println("Semana");
            break;
        case 2:
            System.out.println("Semana");
            break;    
        case 3:
            System.out.println("Semana");
            break;
        case 4:
            System.out.println("Semana");
            break;
        case 5:
            System.out.println("Semana");
            break;
        case 6:
            System.out.println("Final de semana");
            break;
        case 7:
            System.out.println("Final de semana");
            break; 
        default: 
            System.out.println("Dia incorreto.");
    }
    
}
}
