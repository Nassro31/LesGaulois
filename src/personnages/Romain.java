package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement [2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert(forcePositive());
	}
	
	private boolean forcePositive() {
		return force>0 ;
	}
	
	public int getForce() {
		return force;
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + " "  + texte + " ");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert(forceCoup>0);
		int force1 = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert(force1>force);
	}
	
	public void sEquiper(Equipement equipement){
		switch (nbEquipement) {
		case 2: 
			System.out.println("Le soldat " + getNom() + " est deja bien protégé !");
			break;
		
		case 1 : 
			if(equipements[0]  == equipement){
				System.out.println("Le soldat " + getNom() + " possède déjà un " + equipement  + "!");
				}
			else {
				equipements[1] = equipement;
				nbEquipement++;
				System.out.println("Le soldat " + getNom() + " s’équipe avec un " + equipement  + "!");
			}
			break;
		case 0:
			equipements[nbEquipement] = equipement;
			nbEquipement++;
			System.out.println("Le soldat " + getNom() + " s’équipe avec un " + equipement  + "!");
			break;
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		minus.prendreParole();
		minus.parler("Je suis minus");
		minus.recevoirCoup(2);
		Equipement casque = Equipement.CASQUE; 
		Equipement bouclier = Equipement.BOUCLIER; 
		minus.sEquiper(casque);
		minus.sEquiper(casque);
		minus.sEquiper(bouclier);
		minus.sEquiper(casque);
		}
	}