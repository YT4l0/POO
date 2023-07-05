import java.util.Scanner;

public class contrario {

    public static int numeroContrario(int numero){

        int dezena,centena,unidade,novoNumero;
         centena = numero / 100;
        dezena = (numero/10)%10;
        unidade = numero%10;

        novoNumero = (unidade * 100) + dezena + (centena * 10) ;

        return novoNumero;


    }

    public static void main(String[] args) {
        int numero;
        int result;
        

        Scanner sc = new Scanner (System.in);

        System.out.println("digite um numero de 3 digitos: ");
        numero = sc.nextInt();

        result = numeroContrario(numero);
        System.out.print ("O número invertido é " + result );



       

        
        
    }
    
}
