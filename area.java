
// Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado deverá ser informado pelo usuário.
import java.util.*;

public class area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float x;
        float y;
        float resultado;

        System.out.println("Digite o primeiro valor: ");
        x = input.nextFloat();
        System.out.println("Digite o segundo valor: ");
        y = input.nextFloat();

        resultado = x * y;

        System.out.println("a area do quadrado: " + resultado);

    }

}