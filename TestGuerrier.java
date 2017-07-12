public class TestGuerrier {
	public static void main (String [] args) {
		Guerrier guerrier = new Guerrier();
		
		int force = 47;
		int dex = 33;
		int inte = 18;
		int conc = 1;
		int exp = 7;
	
		guerrier.setForce(force);
		guerrier.setDexterite(dex);
		guerrier.setIntelligence(inte);
		guerrier.setConcentration(conc);
		guerrier.setExperience(exp);
		guerrier.tauxVitalite();

		System.out.println(guerrier);
	}
}
