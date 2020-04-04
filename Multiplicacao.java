
package calculadorasimles;

import java.util.Scanner;

public class Multiplicacao {
    public int realizarMultiplicacao(Integer num1, Integer num2){
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o Fator:"  );
        num1 = scanner.nextInt();

        System.out.println("Digite o Multiplicador"  );
        
        num2 = scanner.nextInt();
        
        
        int resultadoMultiplicacao= (int)num1*num2;
        System.out.print("A Diferenca eh = " );
        return resultadoMultiplicacao;
    
        
    }
    
}
