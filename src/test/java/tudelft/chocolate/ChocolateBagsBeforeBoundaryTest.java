package tudelft.chocolate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChocolateBagsBeforeBoundaryTest {
    private ChocolateBags bags; 
    
    @BeforeEach
    public void initialize() {
    	this.bags=new ChocolateBags();
    }
	
	@Test
    public void totalIsBiggerThanAmountOfBars() {
        int result = bags.calculate(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = bags.calculate(5, 3, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void bigAndSmallBars() {
        int result = bags.calculate(5, 3, 17);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void onlySmallBars() {
        int result = bags.calculate(4, 2, 3);
        Assertions.assertEquals(3, result);
    }
    
    @Test
    public void bug() {
        int result = bags.calculate(2, 3, 17);
        Assertions.assertEquals(2, result);
    }
    
    @ParameterizedTest
    @CsvSource ({"5,2,10,0", "4,0,10,-1", "4,1,10,-1", "5,3,10,0"})
//    @Test
    public void onlyBigBars(int small, int big, int total, int expected) {
    	int result = bags.calculate(small, big, total);
    	assertEquals(expected, result);
    	
    }
}


