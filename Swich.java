package switchCase;
import java.util.Scanner;

public class Swich {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escolha um número entre 1 a 3: ");
		int numero = sc.nextInt();

		switch (numero) {
		case 1:
			System.out.println("O número escolhido foi 1");
			break;
		case 2:
			System.out.println("O número escolhido foi 2");
			break;
		case 3:
			System.out.println("O número escolhido foi 3");
			break;
		default:
			System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
		}

		sc.close();


	}

}
