package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 1/5/2017.
 */
public class RomanToInt {
    public static void main(String args[]) {
        RomanToInt romanToInt = new RomanToInt();

        System.out.print(romanToInt.romanToInt("MCVXIII"));
    }
    private int romanToInt(String s) {
        if(s.equals("")) {
            return 0;
        }

        Map<Character, Integer> map = romanConversion();
        int solution = 0;

        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                return 0;
            }
            int addend = map.get(s.charAt(i));

            if(i+1 < s.length() && map.containsKey(s.charAt(i+1)) && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                addend = -map.get(s.charAt(i));
            }
            solution += addend;
        }

        return solution;
    }
    private Map<Character, Integer> romanConversion() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return map;
    }
}
