package switchCase;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Informe um valor: ");
		double a = sc.nextDouble();

		String msng = a % 5 == 0 ? "É Multiplo de 5": "Não é multiplo de 5";
		System.out.println(msng);

		sc.close();

	}

}
