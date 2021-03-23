package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
//    @DisplayName("1.0 - First Test - already complete")
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    @DisplayName("2.1 - had to include numbers")
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }
//
    @Test
    @DisplayName("2.2 - had to include numbers - again")
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals((-15),result);
    }
}
