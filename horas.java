import java.util.Scanner;

public class horas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em minutos: ");
        int minutos = scanner.nextInt();

        int dias = minutos / (24 * 60);
        int horas = (minutos % (24 * 60)) / 60;
        int minutosRestantes = (minutos % (24 * 60)) % 60;

        System.out.println(minutos + " minutos = " + dias + " dias, " + horas + " horas e " + minutosRestantes + " minutos.");

        scanner.close();
    }
}
