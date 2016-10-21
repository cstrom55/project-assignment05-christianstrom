package se.nackademin.examination.examination_jacoco;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;
public class GameTest {
	@Test
	public void testRun(){
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		String value = "Game";
		values.add(value);
		value = "FirstName";
		values.add(value);
		value = "LastName";
		values.add(value);
		value = "M";
		values.add(value);
		value = "31";
		values.add(value);
		value = "HomeCity";
		values.add(value);
		game.run(values);
	}
	@Test
	public void testCalcNames1(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("AS", "ASD");
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void testCalcNames2(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("ASD", "AS");
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testCalcNames3(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("ASD", "ASD");
		assertEquals("The result should be 2", i, 2);
	}
	@Test
	public void testCalcGender1(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void testCalcGender2(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testCalcGender3(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('G');
		assertEquals("The result should be 2", i, 2);
	}
	@Test
	public void testCalcAge1(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(50);
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testCalcAge2(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(5);
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void testCalcHomeCity1(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("ASDF");
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void testCalcHomeCity2(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("BSDF");
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testCalcHomeCity3(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("CSDF");
		assertEquals("The result should be 2", i, 2);
	}
	@Test
	public void testCalcHomeCity4(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("DSDF");
		assertEquals("The result should be 3", i, 3);
	}
	@Test
	public void testCalcHomeCity5(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("ESDF");
		assertEquals("The result should be 4", i, 4);
	}
	@Test
	public void testCalcHomeCity6(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("FSDF");
		assertEquals("The result should be 5", i, 5);
	}
	@Test
	public void testCalcHomeCity7(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("GSDF");
		assertEquals("The result should be 6", i, 6);
	}
	@Test
	public void testCalcHomeCity8(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("HSDF");
		assertEquals("The result should be 7", i, 7);
	}
	@Test
	public void testCalcHomeCity9(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("ISDF");
		assertEquals("The result should be 8", i, 8);
	}
	@Test
	public void testCalcHomeCity10(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("JSDF");
		assertEquals("The result should be 9", i, 9);
	}
	@Test
	public void testCalcHomeCity11(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("TSDF");
		assertEquals("The result should be 10", i, 10);
	}
}
