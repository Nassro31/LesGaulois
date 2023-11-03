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
	
	public Chef getChef() {
		return chef;
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
		return  villageois[numero-1];
	}

	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+ getChef().getNom() + " vivent les legendaires gualois :  " );
		for (int i = 0; i <nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
			
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irr�ductibles",30);
//		Gaulois gaulois = village.trouverHabitant(30);
		Chef Abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(Abraracourcix);
		Gaulois asterix = new Gaulois("asterix", 8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		Gaulois Obélix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(Obélix);
		village.afficherVillageois();
		
	}
}
