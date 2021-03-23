
import java.io.*;
public class Ecrire { 
	public static void main(String[] args) 
	{ 
		try { 
			FileWriter fw=new FileWriter("c:\\temp\\essai.txt"); 
			BufferedWriter bw= new BufferedWriter(fw); 
			bw.write("Ceci est une phrase gentille"); 
			bw.newLine(); 
			bw.write("Ceci est une autre phrase gentille");
			bw.close(); 
			} 
		catch (Exception e) 
		{ System.out.println("Erreur "+e);} 
		} 
	} 