import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PrintArgs {
	public static void main(String[] args){
		// 9°) Si on run on a pas d'arguments donc il y a une erreur
		//System.out.println(args[0]);	
		
		for(int i=0; i< args.length;i++){
			System.out.println(args[i]);}
		
		
		for(String name : args)
			System.out.println(name.toString());
		// Peut ne pas marcher si le Compilator Compliance est en dessous de 1.5 
		// changer manuellement pour ma part
		// Project -> Properties -> Java Compiler -> Compiler compliance -> 1.6
		
		}
		
}
