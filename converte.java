import java.util.Scanner;

public class converte {

    public static double converteFarenheitt(double centigrade) {

        return (centigrade * 9 / 5) + 32;

    }

    public static void main(String[] args) {
        double centigrade;
        double farenheitt;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Centigrados: ");
        centigrade = input.nextDouble();

        farenheitt = converteFarenheitt(centigrade);

        System.out.println(" a temperatura em farenheitt é " + farenheitt);

    }

}
