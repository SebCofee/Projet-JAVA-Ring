import java.util.*;
import java.lang.*;

public class Personnage {

	public static final int EXP_MAX = 20;
	public static final int EXP_MIN = 1;
	private int force;
	private int dexterite;
	private int intelligence;
	private int concentration;
	private int vitalite;
	private int experience;
	private String nom;

	public Personnage() { // CONSTRUCTEUR PAR DÉFAUT
	}

	public Personnage(int force, int dexterite, int intelligence, int concentration, int vitalite, int experience, String nom) { // CONSTRUCTEUR CHAMP À CHAMP
		this.force = force;
		this.dexterite = dexterite;
		this.intelligence = intelligence;
		this.concentration = concentration;
		this.vitalite = vitalite;
		this.experience = experience;
		this.nom = nom;
	}

	public Personnage(Personnage perso) { // CONSTRUCTEUR PAR RECOPIE
		this.force = perso.getForce();
		this.dexterite = perso.getDexterite();
		this.intelligence = perso.getIntelligence();
		this.concentration = perso.getConcentration();
		this.vitalite = perso.getVitalite();
		this.experience = perso.getExperience();
		this.nom = new String(perso.getNom());
	}

	public int getForce() { // ACCESSEUR STAT FORCE
		return this.force;
	}

	public void setForce(int force) { // MUTATEUR STAT FORCE
		this.force = force;
	}

	public int getDexterite() { // ACCESSEUR STAT DEXTERITÉ
		return this.dexterite;
	}

	public void setDexterite(int dexterite) { // MUTATEUR STAT DEXTERITÉ
		this.dexterite = dexterite;
	}

	public int getIntelligence() { // ACCESSEUR STAT INTELLIGENCE
		return this.intelligence;
	}

	public void setIntelligence(int intelligence) { // MUTATEUR STAT INTELLIGENCE
		this.intelligence = intelligence;
	}

	public int getConcentration() { // ACCESSEUR STAT CONCENTRATION
		return this.concentration;
	}

	public void setConcentration(int concentration) { // MUTATEUR STAT CONCENTRATION
		this.concentration = concentration;
	}

	public int getVitalite() { // ACCESSEUR STAT VITALITÉ
		return this.vitalite;
	}

	public void setVitalite(int vitalite) { // MUTATEUR STAT VITALITÉ
		this.vitalite = vitalite;
	}

	public int getExperience() { // ACCESSEUR STAT EXPÉRIENCE
		return this.experience;
	}

	public void setExperience(int experience) { // MUTATEUR STAT EXPÉRIENCE
		this.experience = experience;
	}

	public String getNom() { // ACCESSEUR NOM
		return this.nom;
	}

	public void setNom(String nom) { // MUTATEUR NOM
		this.nom = nom;
	}
	
	public int tauxVitalite() {
		this.vitalite = 200 - (getForce() + getDexterite() + getIntelligence() + getConcentration()) + (getExperience()*3);
		return this.vitalite;
	}
	
	class ExperienceException extends Exception {
		public ExperienceException() {
			System.out.println("Experience Invalide");
		}

		public void experienceValide() throws ExperienceException {
			if (getExperience() > EXP_MAX || getExperience() < EXP_MIN)
			{
				throw new ExperienceException ();
			}
		}
	}

	public boolean equilibreStats() {
		int total1 = (getForce() + getDexterite() + getIntelligence() + getConcentration());
		int total2 = (100 + getExperience());

		if (total1 <= total2)
		{
			return true;
		}
		else
		{
			return false;
		}
	 }
	
	public String toString() {
		String s1 = new String("Force : " + getForce() + "\nDexterité : " + getDexterite() + "\nIntelligence : " + getIntelligence() + "\nConcentration : " + getConcentration() + "\nExperience : " + getExperience() + " Experience valide" + "\nVitalité : " + this.tauxVitalite());

		/*if (!experienceValide())
		{
			return ("ERREUR ! EXPERIENCE NON VALIDE !");
		}
		else if(!equilibreStats())
		{
			return ("ERREUR ! EQUILIBRE NON RESPECTÉ !");
		}
		
		else
		{*/
			return s1;
		//}
	}
}
