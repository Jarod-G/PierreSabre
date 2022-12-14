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

	public void provoquer(Yakuza adversaire) {
		this.parler("Je t'ai retrouv? vermine, tu vas payer pour ce que tu as fait ? ce pauvre marchand!");
		int force = this.honneur * 2;
		int reputationYakuza = adversaire.getReputation();
		if (force >= reputationYakuza) {
			this.parler("Je t'ai eu petit yakusa !");
			this.gagnerArgent(adversaire.perdre());
		} else {
			this.honneur -= 1;
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.getArgent());
		}
	}
}
