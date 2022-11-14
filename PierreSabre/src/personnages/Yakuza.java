package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public int getReputation() {
		return this.reputation;
	}

	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		this.parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int argentExt = victime.getArgent();
		this.gagnerArgent(argentExt);
		victime.seFaireExtorquer();
		this.parler("J'ai piqu� les " + argentExt + " sous de " + victime.getNom() + ", ce qui me fait "
				+ this.getArgent() + " sous dans ma poche. Hi ! Hi !");
		this.reputation += 1;
	}

	public int perdre() {
		int argentYakuza = this.getArgent();
		this.perdreArgent(argentYakuza);
		this.reputation -= 1;
		this.parler("J'ai perdu mon duel et mes " + argentYakuza + " sous, snif... J'ai d�shonor� le clan de "
				+ this.clan + ".");
		return argentYakuza;
	}

	public void gagner(int gain) {
		this.gagnerArgent(gain);
		this.reputation += 1;
		this.parler("Ce ronin pensant vraiment battre " + this.getNom() + " du clan de " + this.clan
				+ " ?\n Je l'ai d�pouill� de ses " + gain + " sous.");
	}
}
