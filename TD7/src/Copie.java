import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
public class Copie {
	public static void main(String[] args) 
	{ 
		try { 
			FileReader fr=new FileReader("c:\\temp\\essai.txt"); 
			BufferedReader br= new BufferedReader(fr);
			FileWriter fw=new FileWriter("c:\\temp\\essai1.txt"); 
			BufferedWriter bw= new BufferedWriter(fw); 
			while(br.ready()){
				bw.write(br.readLine());
				bw.newLine();}
			
				br.close();
				bw.close();
				
			
			}
			catch (Exception e) 
			{System.out.println("Erreur "+e);} 
			} 
}
