public class Chasseur extends Personnage {
	
	public Chasseur() {
		super();
	}
	
	public Chasseur (int force, int dexterite, int intelligence, int concentration, int vitalite, int experience, String nom) {
		super();
	}

	public Chasseur (Chasseur chasseur) {
		super();
	}

	public boolean tauxForce() {
		if (getForce() >= 20)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean tauxDexterite() {
		if (getDexterite() >= 20)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean tauxIntelligence() {
		if (getIntelligence() >= 20)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean tauxConcentration() {
		if (getConcentration() >= 20)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString() {
		String s1 = new String("Force : " + getForce() + "\nDexterité : " + getDexterite() + "\nIntelligence : " + getIntelligence() + "\nConcentration : " + getConcentration() + "\nExperience : " + getExperience() + " Experience valide" + "\nVitalité : " + this.tauxVitalite() + "\nEquilibre des stats respecté");

		if (!experienceValide())
		{
			return ("ERREUR ! EXPERIENCE NON VALIDE !");
		}

		else if(!equilibreStats())
		{
			return ("ERREUR ! EQUILIBRE NON RESPECTÉ !");
		}

		else if(!tauxForce() || !tauxDexterite() ||!tauxIntelligence() || !tauxConcentration())
		{
			return ("ERREUR ! NIVEAU DE STATS NON RESPECTE !");
		}

		else
		{
			return s1;
		}
	}
}
