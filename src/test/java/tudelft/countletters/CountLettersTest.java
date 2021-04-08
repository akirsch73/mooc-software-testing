package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void notWordDoesNotMatch() {
        int words = new CountLetters().count("Greifer|Katze");
        Assertions.assertEquals(1, words);
    }
    
    @Test
    public void singlersWordDoesNotMatch() {
        int words = new CountLetters().count("r|s?s!r");
        Assertions.assertEquals(4, words);
    }
}