public class Exercice3Serie2 {
    public static void main(String[] args) {
		
		// je cree un tableau pour simuler les nombre donné par l'utilisateur
		int [] arrayUser = {40, 12, 28, 32, 360, 0};
		// je cree une variable pour stocker ma moyenne pour la fin
		int nb_userBefore = 0;

		int sommeNumber = 0;
		// Je cree une variable pour compter les nombre de boucle réalisée
		int compteurNombre = 0;
		int moyenneActuel = 0;

		for (int userNumber : arrayUser){
			
			System.out.println("Donnez moi un nombre ?");
			System.out.println("Votre nombre est " + userNumber);
			
			if (userNumber < 1 ){
				System.out.println("la boucle vas s'arreter !");
			} else {
				if (sommeNumber == 0 ){
					System.out.println("c'est votre premier nombre !");
					sommeNumber = sommeNumber + userNumber;
					compteurNombre = compteurNombre +1;
					moyenneActuel = sommeNumber / compteurNombre;
					System.out.println("La moyenne actuel est de : " + moyenneActuel);
					if (moyenneActuel > userNumber){
						System.out.println("votre nombre est inferieur a la moyenne actuel !");
					} else if (moyenneActuel < userNumber){
						System.out.println("votre nombre est superieur a la moyenne actuel !");
					}else if (moyenneActuel == userNumber){
						System.out.println("votre nombre est egale a la moyenne actuel !");
					}
					nb_userBefore = userNumber;

				} else {
					sommeNumber = sommeNumber + userNumber;
					compteurNombre = compteurNombre ++;
					moyenneActuel = sommeNumber / compteurNombre;
					System.out.println("La moyenne actuel est de : " + moyenneActuel);
					if (moyenneActuel > userNumber){
						System.out.println("votre nombre est inferieur a la moyenne actuel !");
					} else if (moyenneActuel < userNumber){
						System.out.println("votre nombre est superieur a la moyenne actuel !");
					} else if (moyenneActuel == userNumber){
						System.out.println("votre nombre est egale a la moyenne actuel !");
					}

					if(nb_userBefore == userNumber){
						System.out.println("Vous m'avez donné le meme nombre que precedement !");
					} else if (nb_userBefore < userNumber){
						System.out.println("votre nombre est superieur a votre nombre precedent !");
					} else if (nb_userBefore > userNumber){
						System.out.println("votre nombre est inferieur a votre nombre precedent !");
					}
					nb_userBefore = userNumber;
				}

			}
		}
	
				// javac Exercice3Serie2.java
				// java Exercice3Serie2
			}
}
