package se.nackademin.examination.examination_jacoco;
import static org.junit.Assert.*;
import org.junit.Test;
public class ResultsFromInputsTest {
	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);
		resultsFromInputs.setResultForAge(5);
		assertEquals("The result should be 5", resultsFromInputs.getResultForAge(), 5);
		resultsFromInputs.setResultForGender(1);
		assertEquals("The result should be 1", resultsFromInputs.getResultForGender(), 1);
		resultsFromInputs.setResultForHomeCity(1);
		assertEquals("The result should be 1", resultsFromInputs.getResultForHomeCity(), 1);
	}
}
