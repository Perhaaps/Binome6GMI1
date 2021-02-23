
import java.util.Scanner;

public class Calculette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); //variable sc de type Scanner et initialisation
	
		System.out.println("Saisir deux entier: ");
		int value = sc.nextInt(); //variable value de type entier et initialisation
		int value2 = sc.nextInt(); //variable value de type entier
		System.out.println(value + value2); //affiche la somme des deux variables value et value2
		
		sc.close(); //fermeture de l'entrée
		
	}

}
