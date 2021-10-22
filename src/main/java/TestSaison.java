
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestSaison {
	
	@Test
	public void compareLibelleSaisonTest() {
		try {
			Saison saisonResultat = Saison.compareLibelleSaison("Hiver");
			assertEquals(Saison.HIVER.getNom(), saisonResultat.getNom());
		} catch (CompareLibelleSaisonException e) {
			
			fail();
		}
	}
	
	@Test(expected =  CompareLibelleSaisonException.class)
	
	public void libelleSaisonEnexistantTest()  throws  CompareLibelleSaisonException {
		
		Saison	saisonResultat= Saison.compareLibelleSaison("fffdj");
				
		
	}

	@Test(expected =  CompareLibelleSaisonException.class)

	public void libelleSaisonNullTest() throws  CompareLibelleSaisonException {
		
			Saison saisonResultat = Saison.compareLibelleSaison(null);
		
	}
	
	
}
