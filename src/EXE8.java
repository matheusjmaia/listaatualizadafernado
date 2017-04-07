
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus.jmaia
 */
public class EXE8 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Insira o numero do mes a ser pago a multa");   
        int mes = console.nextInt();
        switch (mes){
            case 1:
                double multa = 100;
                break;
            case 2:
                double multa2 = 100 + ((100*5)/100);
                System.out.println(multa2);
            case 3:
                double multa3 = (100 + ((100*5)/100) * 5)/100;
                System.out.println(multa3);
            case 4:
        }
    
    
    }
}