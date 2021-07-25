public class Exercice3Serie2 {
    public static void main(String[] args) {
		
		// je cree un tableau pour simuler les nombre donné par l'utilisateur
		int [] arrayUser = {10, 4, 3, 0, 10, 8, 25, 7, 38, 78, 209};

		// je cree une variable pour stocker ma moyenne pour la fin
		int resultat = 0;

		// Je cree une variable pour compter les nombre superieur a 0
		int compteurNombreSuperieurAZero = 0;
		
		// je cree une compteurNombreSuperieurAZero for pour pour recuperer les valeur dans mon tableau
		for (int userNumber : arrayUser){
			
			System.out.println("Donnez moi un nombre superieur a zero ?");
			System.out.println("Votre nombre est " + userNumber);
			
			if (userNumber < 1 ){
				System.out.println("Votre nombre n'est pas bon !");
			} else {
				System.out.println("Super ! je note !");
				resultat = resultat + userNumber;
				compteurNombreSuperieurAZero ++;
			}
		}
		System.out.println("la moyenne des nombres est de : " + (resultat / compteurNombreSuperieurAZero));
		System.out.println("valeur compteur nombre superieur a zero :" + compteurNombreSuperieurAZero);
		System.out.println("sommme des nombres de l'utilisateur :" + resultat);
		
		// javac Exercice3Serie2.java
		// java Exercice3Serie2
	}
}
