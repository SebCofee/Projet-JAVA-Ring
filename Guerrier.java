public class Guerrier extends Personnage {
	
	public Guerrier() {
		super();
	}
	
	public Guerrier (int force, int dexterite, int intelligence, int concentration, int vitalite, int experience, String nom) {
		super();
	}

	public Guerrier (Guerrier guerrier) {
		super();
	}

	public boolean tauxForce() {
		int int10 = getIntelligence() + 10;
		int dex10 = getDexterite() + 10;
		
		if(getForce() >= dex10)
		{
			if(dex10 >= int10)
			{
				if (int10 >= getConcentration())
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

	public String toString() {
		super.tauxVitalite();
		String s1 = new String("Force : " + getForce() + " Contrainte de force respectée" + "\nDexterité : " + getDexterite() + "\nIntelligence : " + getIntelligence() + "\nConcentration : " + getConcentration() + "\nExperience : " + getExperience() + " Experience valide" + "\nVitalité : " + tauxVitalite() + "\nEquilibre des stats respecté");
		if (!experienceValide())
		{
			return ("ERREUR ! EXPERIENCE NON VALIDE !");
		}
		else if(!equilibreStats())
		{
			return ("ERREUR ! EQUILIBRE NON RESPECTÉ !");
		}
		else if(!tauxForce())
		{
			return ("ERREUR ! CONTRAINTE DE FORCE NON RESPECTÉE !");
		}

		else
		{
			return s1;
		}
	}
}	
