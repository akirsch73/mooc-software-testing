package tudelft.ghappy;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
	
	GHappy gH; 
	
	@BeforeEach
	public void initialize() {
	this.gH = new GHappy();
	}
	
	@Test
	public void emptyInput() {
		assertTrue(gH.gHappy(""));
		
	}
	
	@Test
	public void doubleInput() {
		assertTrue(gH.gHappy("gg"));
		
	}
	
	@Test
	public void doubleInputwithsurroundings() {
		assertTrue(gH.gHappy("xggx"));
		
	}
	
	@Test
	public void singleinputwithsurroundings() {
		assertTrue(gH.gHappy("xgx"));
		
	}
}
