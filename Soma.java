package calculadorasimles;
import java.util.Scanner;
public class Soma {
    
    public int realizarSoma(Integer num1, Integer num2){
        
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o Primeiro Numero da Adicao:"  );
        num1 = scanner.nextInt();

        System.out.println("Digite o Segundo Numero da Adicao"  );
        
        num2 = scanner.nextInt();
        
        
        int resultadoSoma= (int)num1+num2;
        System.out.print("Resultado da Soma = " );
        return resultadoSoma;
    
}
    
}
