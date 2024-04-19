package switchCase;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);


		System.out.println("Anos trabalhados: ");
		int anos = sc.nextInt();

		String mnsgn = anos <= 3 ? "Você receberá 5% de bônus":"Você receberá 7% de bônus"; 
		System.out.println(mnsgn);

		sc.close();
	}

}
