package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public int getArgent() {
		return this.argent;
	}

	public String getNom() {
		return this.nom;
	}

	public void parler(String texte) {
		System.out.println(this.nom + " : " + texte + ".");
	}

	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boissonFavorite);
	}

	public void boire() {
		this.parler("Mmmm, un bon verre de " + this.boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (this.argent < prix) {
			this.parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offir un " + bien
					+ " à " + prix + " sous");
		} else {
			this.parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix
					+ " sous");
			this.perdreArgent(prix);
		}
	}

	public void gagnerArgent(int gain) {
		this.argent += gain;
	}

	public void perdreArgent(int perte) {
		this.argent -= perte;
	}
}
