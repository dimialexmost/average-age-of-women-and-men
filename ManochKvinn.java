import java.util.*;
	class ManochKvinn { 
	public static void main(String[] agr) { 
		String mataintxt;									//variabel för inläsning av scanner
		int kvinna = 0;										//tal variabel får värde fr.inmatning och sen fr. operator ++
		int summalderkvinn = 0; 								//tal variabel får värde fr. inmatning och sen fr. tilldelningsoperator
		int man = 0;										//tal variabel får värde fr.inmatning och sen fr. operator ++
		int summalderman = 0;									//tal variabel får värde fr. inmatning och sen fr. samansatt tilldelningsoperator
	do {												//sats för utförande av del av koden tills den inte avslutas med while-sats
	Scanner scan = new Scanner(System.in);								//läser av data fr. inmatning
	System.out.print("Mata in M - man eller K - kvinna. A om du vill avsluta och räkna ut. \n"); 	//meddelande till användare
	mataintxt = scan.nextLine(); 									//variabel får värde i text fr. Scanner
	{
	if (mataintxt.equals("M")) 									//sats - om info handlar om män - räknas vidare i grupp för män
	{	
	System.out.print("Mans aldern - ");								// skriver kommando för användare mata in mans åldern
	summalderman += scan.nextInt();									//adderar åldern av varje män till genomsnittsåldern mäns åldern
	man++;												//adderar antalet av inmatade män till varabel "int man" summan av alla män
	}
	else if (mataintxt.equals("K")) 								//i fall handlar om kvinnor och skiljers fr. sats if - räknas i grupp för kvinnor
	{
	System.out.print("Kvinnas aldern - "); 								// skriver meddelande till användare
	summalderkvinn += scan.nextInt();								//adderar åldern av varje kvinna till genomsnittsåldern kvinnors åldern
	kvinna++;											//adderar antalet av inmatade kvinnor till varabel "int kvinna" summan av kvinnor
	}
	}
	} while (!mataintxt.equals("A"));								//avslutar do-sats när användare är klar för räkning och matar in A
		if (mataintxt.equals("A")); {								//i fall matas in A programmet räknar ut och skriver ut resultat
		System.out.println("Antalet av kvinnor är: " + kvinna); 				//skriver ut antalet i grupp kvinnor
		System.out.println("Genomsnittsåldern för kvinnor: " + summalderkvinn / kvinna); 	//skriver ut Genomsnittsåldern för kvinnor
		System.out.println("Antalet av män är: " + man);					//skriver ut antalet i grupp män
		System.out.println("Genomsnittsåldern för män: " + summalderman / man);			//skriver ut Genomsnittsåldern för män
		}
}
}
