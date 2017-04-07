

import java.util.Scanner;


public class EXE1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("DIGITE UM NÚMERO INTEIRO: ");
        int numero = console.nextInt();
        int n2 = numero%3;
        switch (n2){
            case 0:
                System.out.println("O número é divisivel por 3");
            break;
            default: 
                System.out.println("O número não é divisivel por 3");
                }
            
    }
}
