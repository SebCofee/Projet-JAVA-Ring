import java.*;

public class TestPerso {
	public static void main (String [] args) {
		
		Personnage perso1 = null;
		int x  = perso1.tauxVitalite();
		try
		{
			perso1 = new Personnage(117,1,1,1,x,20,"Bob");
		}
		catch (ExperienceException e)
		{ }
		
		System.out.println(perso1);
	}
}
