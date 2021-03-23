import java.io.BufferedWriter;
import java.io.FileWriter;
public class EcrireTest { 
	public static void main(String[] args) 
	{ 
		int i =0;
		try { 
			FileWriter fw=new FileWriter("c:\\temp\\test.txt"); 
			BufferedWriter bw= new BufferedWriter(fw); 
			while(i < 1000000){
				bw.write(String.valueOf(2*i));
				i++;
			}
			bw.close();
			} 
		catch (Exception e) 
		{ System.out.println("Erreur "+e);} 
		} 
	} 

