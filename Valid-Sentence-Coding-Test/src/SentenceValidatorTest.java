import static org.junit.Assert.*;
import org.junit.Test;

public class SentenceValidatorTest {

    // Test for sentences starting with a capital letter
    @Test
    public void testStartsWithCapital() {
        assertTrue(SentenceValidator.validSentence("This is very true."));
        assertFalse(SentenceValidator.validSentence("this is very false."));
    }
    
    // Test for sentences with an even number of quotes
    @Test
    public void testEvenNumberOfQuotes() {
        assertTrue(SentenceValidator.validSentence("This is a very true sentence."));
        assertFalse(SentenceValidator.validSentence("This is \"very false."));
    }
    
    // Test for sentences ending with proper punctuation
    @Test
    public void testEndsWithProperPunctuation() {
        assertTrue(SentenceValidator.validSentence("This is very true."));
        assertFalse(SentenceValidator.validSentence("This is very false"));
    }

    // Test for sentences that  has no period characters other than last character
    @Test
    public void testisPeriodAtEnd() {
        assertTrue(SentenceValidator.validSentence("This is very true."));
        assertFalse(SentenceValidator.validSentence("This is not. very false."));
    }

    // Test for sentences with numbers below 13 spelled out
    @Test
    public void testNumbersBelowThirteenSpelledOut() {
        assertTrue(SentenceValidator.validSentence("Eleven is spelled out."));
        assertFalse(SentenceValidator.validSentence("12 is not spelled out."));
    }

    // Lastly this test is for overall sentence validity
    @Test
    public void testOverallValidity() {
        assertTrue(SentenceValidator.validSentence("This is a very true sentence."));
        assertFalse(SentenceValidator.validSentence("this has several issues: 12, and a missing end!"));
    }

}

