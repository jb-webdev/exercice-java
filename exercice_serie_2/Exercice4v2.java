public class Exercice4v2
{
	public static void main(String[] args) {

		int prixFarine = 2;
		int nbFarine = 1;
		int prixTotalFarine = nbFarine * prixFarine;
		System.out.println("Le prix total de la farine est de : " + prixTotalFarine);

		int prixSucre = 1;
		int nbSucre = 3;
		int prixTotalSucre = nbSucre * prixSucre;
		System.out.println("Le prix total du sucre est de : " + prixTotalSucre);

		int prixTotal = prixTotalFarine + prixTotalSucre;
		System.out.println("Le prix total est de : " + prixTotal);
		
		// javac Exercice4v2.java
		// java Exercice4v2
	}
}