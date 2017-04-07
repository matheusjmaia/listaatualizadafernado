
import java.util.Scanner;

public class EXE5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Escrevao nome do mês");
        String mes = console.next();
        switch (mes){
            case "Dezembro":
            case "Janeiro":
            case "Fevereiro":
            case "Junho":
            case "Julho":
                System.out.println("Alta temporada");    
                break;
            case "Março":
            case "Abril":
            case "Agosto":
            case "Setembro":
            case "Outubro":
            case "Novembro":
                System.out.println("Baixa temporada");
                break;
            default:
                System.out.println("Dados incorretos");
        }
        
        
        
        
}
}    
