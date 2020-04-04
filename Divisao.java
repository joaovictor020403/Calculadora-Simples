
package calculadorasimles;
import java.util.Scanner;


public class Divisao {
    
    public int realizarDivisao(Integer num1, Integer num2){
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o Dividendo:"  );
        num1 = scanner.nextInt();

        System.out.println("Digite o Divisor"  );
        
        num2 = scanner.nextInt();
        
        
        int resultadoDivisao;
        resultadoDivisao = (int)num1/num2;
        System.out.print("Resultado da Divisao = " );
        return resultadoDivisao;
    }
        
    
}
