package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 1/6/2017.
 */
public class FizzBuzz {
    public static void main(String args[]) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        List<String> list = fizzBuzz.fizzBuzz(20);
    }
    private List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();

        for(int i = 1; i <= n; i++) {
            if(i%15 == 0) {
                list.add("FizzBuzz");
            }
            else if(i%3 == 0) {
                list.add("Fizz");
            }
            else if(i%5 == 0) {
                list.add("Buzz");
            }
            else {
                list.add("" + i);
            }
        }

        return list;
    }
}
