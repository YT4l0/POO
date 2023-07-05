// Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
// valores reais serão informados pelo usuário.
import java.util.*;

public class media {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double num1,num2,num3,media;

        System.out.println("digite um numero real: ");
        num1 = input.nextDouble();
        System.out.println("\ndigite outro numero real:");
        num2 = input.nextDouble();
        System.out.println("\nDigite o ultimo numero real: ");
        num3 = input.nextDouble();

        media = (num1 + num2 + num3)/3;

        System.out.println("a media é: " + media);
    }

    
}
