package switchCase;
import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();

		scanner.close();

		String mensagem = (idade >= 18) ? "Você é maior de idade" : "Você é menor de idade";
		System.out.println(mensagem);
	}

}
