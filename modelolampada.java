import java.util.Scanner;

public class modelolampada {

    public static int model(int modelo) {
        Scanner input = new Scanner(System.in);

        int opcao;
        switch (modelo) {
            case 1:

                System.out.println("parabens voce comprou uma lampada led");

                break;

            case 2:

                System.out.println("parabens voce comprou uma lampada rgb");

                break;

            case 3:

                System.out.println(" parabens voce comprou uma lampada tubular");

                break;

            default:

                System.out.println("não temos essa opção");
                System.out.println("digite novamente: ");
                opcao = input.nextInt();
                model(opcao);

                break;
        }

        return 0;
    }

    public static void main(String[] args) {
        int modelo;
        Scanner input = new Scanner(System.in);

        System.out.println("digite o modelo da lampada");
        System.out.println("lampada led-1");
        System.out.println("lampada rgb-2");
        System.out.println("lampada tubular-3");

        System.out.println("digite a opção: ");
        modelo = input.nextInt();

        model(modelo);

    }

}
