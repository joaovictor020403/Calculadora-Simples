package calculadorasimles;

public class CalculadoraSimples {
    

    public static void main(String[] args) {
       
        
        Divisao d = new Divisao();
        Soma s = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao m = new Multiplicacao();
        
        
        try{
            
            System.out.println(d.realizarDivisao(0,0));
            System.out.println(s.realizarSoma(0,0));
            System.out.println(sub.realizarSubtracao(0,0));
            System.out.println(m.realizarMultiplicacao(0,0));
        }
        
        catch (ArithmeticException e){
            System.err.println("Erro de Aritmetica");
                        
        }
         finally{
            System.out.println("Processo encerrado");
        }
               
        
        
    }
    
}
