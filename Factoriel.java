import java.util.Scanner;

public class Factoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); //variable sc de type Scanner et initialisation
	
		System.out.println("Saisir un entiers: ");
		int value=sc.nextInt();
		int facto=1;
		for(int i=1;i <= value;i++){
			facto=facto*i;
		}
		System.out.println("Le factoriel de " + value + " est " + facto);
		sc.close();
}
}