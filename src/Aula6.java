





public class Aula6 {

    public static void main(String[] args) {

    char grade = 'C';
    switch (grade) {
        case 'A':
            System.out.println("Excelente!");
            break;  
        case 'B':
        case 'C':
            System.out.println("Bem feito!");
           break;       
        case 'D':
            System.out.println("Você passou!");
            break;    
        case 'E':
            System.out.println("Melhor tentar novamente!");
           break;
        default :
            System.out.println("Conceito inválido!");
    }
    }
    
}
