public class Exercice5v1
{
	public static void main(String[] args) {
		
		int prixPlaceEnfant = 4;
		int prixPlaceAdulte = 10;
		
		int nombreAdulte = 2;
		int nombreEnfant = 2;
		
		int reductionFamilleNombreuse = 2;

		System.out.println("Le montant total des billets adultes est de : " + (prixPlaceAdulte * nombreAdulte) + " Euros");
		System.out.println("Le montant total des billets enfant est de : " + (prixPlaceEnfant * nombreEnfant) + " Euros");
		System.out.println("Le montant total des billets plein tarif est de : " + ((prixPlaceEnfant * nombreEnfant) + (prixPlaceAdulte * nombreAdulte)) + " Euros");
		System.out.println("Le montant total des billets avec reduction est de : " + ((prixPlaceEnfant * nombreEnfant) + (prixPlaceAdulte * nombreAdulte) - reductionFamilleNombreuse ) + " Euros");

		
		// javac Exercice5v1.java
		// java Exercice5v1
		
	}
}