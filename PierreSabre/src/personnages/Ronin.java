package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentDonner = (this.getArgent() * 10) / 100;
		this.parler(beneficiaire.getNom() + " prends ces " + argentDonner + " sous.");
		beneficiaire.recevoir(argentDonner);
		this.perdreArgent(argentDonner);
	}
}
