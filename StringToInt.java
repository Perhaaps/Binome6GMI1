
import java.lang.Integer;
import java.util.*;


public class StringToInt {
	
	static int[] TabStrToInt(String[]  tab){
		int[] tableauInt = new int[tab.length];
		for(int i = 0; i< tab.length;i++){
			tableauInt[i]= Integer.parseInt(tab[i]);
		}
		return tableauInt;
	}
	
	static int Somme(int[] tab){
		int somme = 0;
		for(int i = 0; i< tab.length;i++){
			somme = somme+ tab[i];
		}
		return somme;
	}
	
	public static void main(String[] args){
		// Entrez le tableau que vous voulez entrée =[1,2,3,4,5]
		
		int somme=0;
		int[] tableauInt = new int[args.length];
		
		tableauInt=TabStrToInt(args);
		somme=Somme(tableauInt);
		
		
		
			//Affiche le tableau avec la classe java.util.Arrays
			List< String> list = Arrays.asList(args);
			System.out.println(list);
			
			
			//Affiche le table avec la méthode foreach
			for(String name : args)
			System.out.println(name.toString());
		
		System.out.println("La somme du table est " + somme);
		
}
}
