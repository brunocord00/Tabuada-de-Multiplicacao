package TabuadaDeMultiplicar;

import java.util.Scanner;

public class TabuadaMulti {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        int multi;
        int num;

        System.out.println("Digite um número: ");
        num = input.nextInt();

        for(int i=1; i<=10; i++){

            multi = num*i;
            System.out.println(num+" x "+i+" = "+multi);
        }
    }
}