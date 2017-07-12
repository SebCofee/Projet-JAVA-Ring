public class TestChasseur {
	public static void main (String [] args) {
		
		Chasseur chasseur = new Chasseur();

		int force = 30;
		int dex = 30;
		int inte = 30;
		int conc = 30;
		int exp = 20;
	
		chasseur.setForce(force);
		chasseur.setDexterite(dex);
		chasseur.setIntelligence(inte);
		chasseur.setConcentration(conc);
		chasseur.setExperience(exp);
		chasseur.tauxVitalite();

		System.out.println(chasseur);
	}
}
