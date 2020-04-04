
package calculadorasimles;

import java.util.Scanner;

public class Subtracao {
    
    public int realizarSubtracao(Integer num1, Integer num2){
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o Minuendo:"  );
        num1 = scanner.nextInt();

        System.out.println("Digite o Subtraendo"  );
        
        num2 = scanner.nextInt();
        
        
        int resultadoSubtracao= (int)num1-num2;
        System.out.print("A Diferenca eh = " );
        return resultadoSubtracao;
    
    }
    
}
