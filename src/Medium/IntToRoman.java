package Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 1/5/2017.
 */
public class IntToRoman {
    public static void main(String args[]) {
        IntToRoman intToRoman = new IntToRoman();

        System.out.print(intToRoman.intToRoman(3445));
    }
    private String intToRoman(int num) {
        if(num == 0) {
            return "";
        }

        Map<Integer, String> map = romanConversion();
        String solution = "";

        while(num > 0) {
            if(num/1000 > 0) {
                solution += map.get(1000);
                num -= 1000;
            }
            else if(num/900 > 0) {
                solution += map.get(900);
                num -= 900;
            }
            else if(num/500 > 0) {
                solution += map.get(500);
                num -= 500;
            }
            else if(num/400 > 0) {
                solution += map.get(400);
                num -= 400;
            }
            else if(num/100 > 0) {
                solution += map.get(100);
                num -= 100;
            }
            else if(num/90 > 0) {
                solution += map.get(90);
                num -= 90;
            }
            else if(num/50 > 0) {
                solution += map.get(50);
                num -= 50;
            }
            else if(num/40 > 0) {
                solution += map.get(40);
                num -= 40;
            }
            else if(num/10 > 0) {
                solution += map.get(10);
                num -= 10;
            }
            else if(num/9 > 0) {
                solution += map.get(9);
                num -= 9;
            }
            else if(num/5 > 0) {
                solution += map.get(5);
                num -= 5;
            }
            else if(num/4 > 0) {
                solution += map.get(4);
                num -= 4;
            }
            else {
                solution += map.get(1);
                num--;
            }
        }

        return solution;
    }
    private Map<Integer, String> romanConversion() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        return map;
    }
}
