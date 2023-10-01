package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getEffetPotion() {
		return effetPotion;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
		}

	
	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup(force * effetPotion/ 3);
		}
	
	public void boirePotion(int effetPotion){
		this.effetPotion = effetPotion;
		System.out.println(" Merci Druide, je sens que ma force est" + effetPotion  +"fois décuplée. ");
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix",8);
		asterix.parler("je suis le goat");
		asterix.boirePotion(3);
		Romain cesar = new Romain("cesar", 8);
		asterix.frapper(cesar);
		}
}

