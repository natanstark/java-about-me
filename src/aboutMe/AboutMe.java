package aboutMe;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
	
	public static void main(String[] args) {
		
		try {
		//cria objeto scanner
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o seu nome");
		String nome = scanner.next();
		
		System.out.println("Digite o seu sobrenome");
		String sobrenome = scanner.next();
		
		System.out.println("Digite a sua idade (apenas digitos)");
		int idade = scanner.nextInt();
		
		System.out.println("Digite a sua altura ");
		double altura = scanner.nextDouble();
		
		//Imprime dados digitados pelo usuário
		System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("Minha altura e " + altura + "m");
		scanner.close();
		
		}
		catch (InputMismatchException e){
			System.out.println("Neste campo utilize apenas digitos");
		}
	}
	

}
