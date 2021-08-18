package stringmanipulation;

import org.junit.jupiter.api.Test;

import java.util.*;

public class StringManipulation {

    @Test
    public void countNumberOfVowels() {
        String string = "";
        String vowels="aeiou";
        int count=0;
        String [] splittedStrings= string.split("");
        for(var i=0; i<splittedStrings.length; i++) {
            if(vowels.contains(splittedStrings[i].toLowerCase()))
                count++;
        }
        System.out.println(count);
    }


    @Test
    public void reverseString() {
        String string = "";
        StringBuilder buffer = new StringBuilder();
        for(var i=string.length()-1; i>=0; i-- ) {
            buffer.append(string.charAt(i));
        }
        String reversed=buffer.toString();
        System.out.println(reversed);
    }

    @Test
    public void reverseWords() {
        String sentence = "";
        String[] splitted = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(var i=splitted.length-1; i>= 0;i--) {
            //System.out.println(splitted[i]);
            stringBuilder.append(splitted[i]);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }

    @Test
    public void reverseWordsUsingCollections() {
        String[] sentence = "   Java is wonderful    ".split(" ");
        Collections.reverse(Arrays.asList(sentence));
        System.out.println(String.join(" ",sentence ));

    }

}
