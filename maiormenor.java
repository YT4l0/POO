import java.util.*;

public class maiormenor {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("digite o primeiro numero: ");
        numero1 = inputScanner.nextInt();
        System.out.println("\ndigite o segundo numero:");
        numero2 = inputScanner.nextInt();
        System.out.println("\nDigite o terceiro numero");
        numero3 = inputScanner.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("o menor é: " + numero1);
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("o menor é " + numero2);
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println("O Menor número é " + numero3);
        }

    }

}
