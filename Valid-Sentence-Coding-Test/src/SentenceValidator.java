
public class SentenceValidator {

    
     //This should verify if a given sentence meets the set of rules
   
    public static boolean validSentence(String sentence) {
        // to check for null / really short sentences
        if (sentence == null || sentence.length() < 2) {
            return false;
        }

        // Validate the sentence by checking all rules
        return startsWithCapital(sentence) &&
               endsWithProperPunctuation(sentence) &&
               hasEvenNumberOfQuotes(sentence) &&
               isPeriodAtEnd(sentence) &&
               numbersBelowThirteenSpelledOut(sentence);
    }

    
    //Checks if the sentence starts with a capital letter
    
    public static boolean startsWithCapital(String sentence) {
        return Character.isUpperCase(sentence.charAt(0));
    }

    
    
    //Checks for an even number of quotation marks
    
    public static boolean hasEvenNumberOfQuotes(String sentence) {
        long quotes = sentence.chars().filter(ch -> ch == '"').count();
        return quotes % 2 == 0;
    }
    
    
    //Checks if the sentence ends with a period, question mark, or exclamation mark
    
    public static boolean endsWithProperPunctuation(String sentence) {
        return sentence.endsWith(".") || sentence.endsWith("?") || sentence.endsWith("!");
    }

    
    //Ensures that there are no period characters other than the last character
     
    public static boolean isPeriodAtEnd(String sentence) {
        return !sentence.substring(0, sentence.length() - 1).contains(".");
    }

    
    //Verifies that numbers below 13 are spelled out in the sentence
     
    public static boolean numbersBelowThirteenSpelledOut(String sentence) {
        String[] numbers = {" 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", " 10", " 11", " 12"};
        for (String number : numbers) {
            if (sentence.contains(number)) {
                return false;
            }
        }
        return true;
    }

}

