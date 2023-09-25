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
	public Gaulois ajouterHabitant(int numero){
		Gaulois gaulois = null ;
		for (int i = 0; i < nbVillageois; i++) {
			if(i== numero) {
				 gaulois = villageois[i];
			}
		}
		return gaulois;
	}
	public static void main(String[] args) {
		village = Village("Village des Irréductibles",30);
		Gaulois gaulois = village.trouverHabitant(30);
		
	}
}
