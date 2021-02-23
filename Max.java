import java.util.Scanner;

public class Max {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); //variable sc de type Scanner et initialisation
	
		System.out.println("Saisir quatre entiers: ");
		int value1 = sc.nextInt(); 
		int value2 = sc.nextInt(); 
		int value3 = sc.nextInt();
		int value4 = sc.nextInt();
		int valueMax=value1;
		
		if(value2 > valueMax) valueMax=value2;
		if(value3 > valueMax) valueMax=value3;
		if(value4 > valueMax) valueMax=value4;
		
		
		
		System.out.println("Le max des trois nombres est : " + valueMax ); 
		
		sc.close(); //fermeture de l'entrée
}
}
