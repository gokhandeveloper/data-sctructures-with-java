import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    @Test
    public void findFirstNonRepeatingChars(){
        String str= "a green apple";
        char [] characters = str.toCharArray();
        for(int i=0; i<characters.length; i++) {
            int found=0;
            for(int j=0; j<characters.length; j++) {
                if(characters[i]==characters[j]) {
                        found++;
                }
            }
            if(found==1){
                System.out.println(characters[i]);
                break;
            }
        }

    }

    @Test
    public void findFirstRepeatingCharsUsingHashMap(){
        Map<Character, Integer> map = new HashMap<>();
        String string="a green apple";
        char [] chars = string.toCharArray();
        for( var ch: chars) {
         var count= map.containsKey(ch) ? map.get(ch) : 0;
         map.put(ch, count+1);
        }
        for(var ch: chars){
           // System.out.println(ch);
            if(map.get(ch)>1){
                System.out.println(ch);
                break;
            }
        }

    }

    @Test
    public void nothing () {

    }

}
