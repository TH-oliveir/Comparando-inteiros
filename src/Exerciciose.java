import java.util.Scanner;
public class Exerciciose {

    public static void main(String[] args)
    {

        Scanner ler = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Digite um primeiro numero:  ");
        numero1 = ler.nextInt();
        System.out.print("Digite segundo numero:  ");
        numero2 = ler.nextInt();

        if (numero1 > numero2) {

            System.out.printf("é maior %d > %d%n", numero1, numero2);
        }

       if (numero1 == numero2){

        System.out.printf(" Os números são iguais %d == %d%n", numero1, numero2);

        }




























    }
}
