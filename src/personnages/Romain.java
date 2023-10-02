package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert(forcePositive());
	}
	
	private boolean forcePositive() {
		return force>0 ;
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
	public static void main(String[] args) {
		Romain minus = new Romain("minus", 6);
		minus.prendreParole();
		minus.parler("Je suis minus");
		minus.recevoirCoup(2);
	}
}