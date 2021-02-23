
import java.lang.Integer;
import java.util.*;


public class StringToInt {
	public static void main(String[] args){
		// Entrez le tableau que vous voulez
		int somme=0;
		int[] tableauInt = new int[args.length];
		
		
		//12°) tableauString --> tableauInt
		for(int i = 0; i< args.length;i++){
			tableauInt[i]= Integer.parseInt(args[i]);
		}
		
			//Affiche le tableau avec la classe java.util.Arrays
			List< String> list = Arrays.asList(args);
			System.out.println(list);
			
			
			//Affiche le table avec la méthode foreach
			for(String name : args)
			System.out.println(name.toString());
		
		for(int i = 0; i< args.length;i++){
			somme = somme+ Integer.parseInt(args[i]);
		}
		System.out.println("La somme du table est " + somme);
		
}
}
