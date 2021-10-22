import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test(expected = StringUtilsException.class)
	public void StringUtilsTest() throws StringUtilsException{
		
		int distance= StringUtils.levenshteinDistance(null, null);
		

	}
	
	


}
