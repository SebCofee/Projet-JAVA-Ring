public class TestMage {
	public static void main (String [] args) {
		Mage mage = new Mage();

		int force = 30;
		int dex = 30;
		int inte = 30;
		int conc = 30;
		int exp = 20;
	
		mage.setForce(force);
		mage.setDexterite(dex);
		mage.setIntelligence(inte);
		mage.setConcentration(conc);
		mage.setExperience(exp);
		mage.tauxVitalite();

		System.out.println(mage);
	}
}
