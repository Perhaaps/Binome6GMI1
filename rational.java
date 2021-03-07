
public class rational {
	
	
	int num; int denom; // private ?

	
	// un objet se crée en utilisant le constructeur
	static rational CreerRational(){
		rational r = new rational();
		r.num = 3;
		r.denom = 2;
		return(r);
		
	}
	
	
	static void AffichageRational(rational r){
		System.out.println("Le num est "+r.num+" et de denom est "+r.denom);
	}

	static String AffichageToString(rational r){
		String s = new String();
		s= String.valueOf(r.num);
		s = s+" / ";
		s= s + String.valueOf(r.denom);
		return(s);
	}
	
	static rational mul(rational r,rational r1) {
		rational rf = new rational();
		rf.num = r.num *
		r1.num;
		rf.denom = r.denom
		* r1.denom;
		return rf;
		}
	
	static rational add(rational r, rational r1){
		rational rf = new rational();
		rf.num = r.num * r1.denom + r.denom * r1.num;
		rf.denom = r.denom * r1.denom;
		return(rf);
		
	}
	
	static int pgcd(int a, int b){
		if(b==0){
			return(a);
		}else{
			return(pgcd(b,a%b));
		}
	}
	
	static void set(int i, rational r){
		rational[] v = new rational[i+1];
		v[i]=r;
		
		
	}
	
	
	public static void main(String[] args){
		rational r1 = new rational();
		rational r1bis = new rational();
		String r2 = new String();
		r1 = CreerRational();
		r1bis = CreerRational();
		AffichageRational(r1);
		r2=AffichageToString(r1);
		System.out.println(r2);
		r1bis=mul(r1,r1bis);
		System.out.println(r1bis.num+"/"+r1bis.denom);
		
	}
	}

// question 3 : C'est un problème car une division par 0 est impossible 
// question 4 : on peut mettre une condition sur denom a travers une boucle qui se réalisera seulement si denom est différent de 0 




	
	

