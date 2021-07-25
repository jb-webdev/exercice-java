public class Exercice4v1
{
	public static void main(String[] args) {
		int prixFarine = 2;
		int nbFarine = 1;
		int prixTotalFarine = nbFarine * prixFarine;

		int prixSucre = 1;
		int nbSucre = 3;
		int prixTotalSucre = nbSucre * prixSucre;

		int prixTotal = prixTotalFarine + prixTotalSucre;

		System.out.println("Le prix total de la farine est de : " + prixTotalFarine);
		System.out.println("Le prix total du sucre est de : " + prixTotalSucre);
		System.out.println("Le prix total est de : " + prixTotal);

		
		// javac Exercice4v1.java
		// java Exercice4v1
		
	}
}