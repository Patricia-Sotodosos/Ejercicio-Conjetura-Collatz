package conjetura_collatz;

import java.util.Scanner;

public class Conjetura_Collatz {

    public static void collatz(int numero) {
       System.out.println("resultado:");
        if(numero>0){
        while (numero != 1) {
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                numero = numero * 3 + 1;
            }
            System.out.print(numero + " ");
          }
        }
      else{
      return;
      }
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba un numero para calcular la conjetura de Collatz: ");
        int numero = lector.nextInt();
        collatz(numero);
    }

}
