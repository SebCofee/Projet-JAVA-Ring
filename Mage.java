public class Mage extends Personnage {
	
	public Mage() {
		super();
	}
	
	public Mage (int force, int dexterite, int intelligence, int concentration, int vitalite, int experience, String nom) {
		super();
	}

	public Mage (Mage mage) {
		super();
	}

	public boolean tauxIntelligence() {
		
	}

	public boolean tauxConcentration() {
		
	}

	public String toString() {
		String s1 = new String("Force : " + getForce() + "\nDexterité : " + getDexterite() + "\nIntelligence : " + getIntelligence() + "\nConcentration : " + getConcentration() + "\nExperience : " + getExperience() + " Experience valide" + "\nVitalité : " + this.tauxVitalite() + "\nEquilibre des stats respecté")

		if (!experienceValide())
		{
			return ("ERREUR ! EXPERIENCE NON VALIDE !");
		}
		
		else if(!equilibreStats())
		{
			return ("ERREUR ! EQUILIBRE NON RESPECTÉ !");
		}

		else if(!tauxIntelligence() ||!tauxConcentration())
		{
			return ("ERREUR ! TAUX DE STATS NON RESPECTE !");
		}

		else
		{
		}
	}
}
			return s1;
