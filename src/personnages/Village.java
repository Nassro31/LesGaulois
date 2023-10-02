package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public int getNbVillageois() {
		return nbVillageois;
	}

	public void setNbVillageois(int nbVillageois) {
		this.nbVillageois = nbVillageois;
	}

	public void ajouterHabitant(Gaulois unGaulois) {
		villageois[getNbVillageois()] = unGaulois;
		nbVillageois++;
	}
	public Gaulois trouverHabitant(int numero){
		Gaulois gaulois = null ;
		for (int i = 0; i < nbVillageois; i++) {
			if(i == numero){
				 gaulois = villageois[i];
			}
		}
		return gaulois;
	}
	
	public static void main(String[] args) {
		Village vill = new Village("Village des Irr�ductibles",30);
		Gaulois asterix = new Gaulois("Asterix", 8);
		vill.ajouterHabitant(asterix);
		Gaulois gaulois = vill.trouverHabitant(1);
		System.out.println(gaulois);

		
	}
}
