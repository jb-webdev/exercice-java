public class Exercice5v2
{
	public static void main(String[] args) {
		
		int prixPlaceEnfant = 5;
		int prixPlaceAdulte = 9;
		
		int nombreAdulte = 1;
		int nombreEnfant = 4;
		
		int reductionFamilleNombreuse = 1;

		System.out.println("Le montant total des billets adultes est de : " + (prixPlaceAdulte * nombreAdulte) + " Euros");
		System.out.println("Le montant total des billets enfant est de : " + (prixPlaceEnfant * nombreEnfant) + " Euros");
		System.out.println("Le montant total des billets plein tarif est de : " + ((prixPlaceEnfant * nombreEnfant) + (prixPlaceAdulte * nombreAdulte)) + " Euros");
		System.out.println("Le montant total des billets avec reduction est de : " + ((prixPlaceEnfant * nombreEnfant) + (prixPlaceAdulte * nombreAdulte) - reductionFamilleNombreuse ) + " Euros");

		
		// javac Exercice5v2.java
		// java Exercice5v2
	}
}