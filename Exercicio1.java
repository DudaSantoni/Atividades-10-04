package switchCase;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nota 1: ");

		double n1 = sc.nextDouble();

		System.out.println("Nota 2: ");

		double n2 = sc.nextDouble();

		System.out.println("Nota 3: ");

		double n3 = sc.nextDouble();

		System.out.println("Nota 4: ");

		double n4 = sc.nextDouble();

		double md = (n1+n2+n3+n4)/4;

		String mnsgn = md >= 7 ? "Aprovado!":"Reprovado!";

		System.out.println(mnsgn);

		sc.close();	

	}

}
