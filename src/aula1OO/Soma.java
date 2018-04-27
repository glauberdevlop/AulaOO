package aula1OO;

import java.util.Scanner;


public class Soma {
	private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        int a, b, soma;
        
        a = in.nextInt();
        b = in.nextInt();
        
        soma = a + b;
        
        System.out.println(soma);
	}
}
