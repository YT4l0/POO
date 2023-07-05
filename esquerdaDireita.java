import java.util.Scanner;

public class esquerdaDireita {

    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de x : ");
        x=input.nextInt();
        System.out.println("");
        System.out.println("digite o valor de y: ");
        y=input.nextInt();
        System.out.println("");

        
    if(x>0 && y > 0){
        System.out.println("em cima na direita");
    }else if(x>0 && y<0){
        System.out.println("em cima na esquerda");
    }else if(x<0 && y>0){
        System.out.println("abaixo na direita");
    }else if(x<0 && y<0){
        System.out.println("abaixo na esquerda");
    }



        
    }
   
}
