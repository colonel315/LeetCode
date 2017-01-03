package Easy;

/**
 * Created by Dell on 1/3/2017.
 */
public class Reverse {
    public static void main(String args[]) {
        Reverse reverse = new Reverse();

        System.out.print(reverse.reverse(Integer.MIN_VALUE));
    }
    private int reverse(int x) {
        int solution = 0;

        while(x != 0) {
            int tail = x%10;
            int newresult = solution*10+tail;
            if((newresult - tail)/10 != solution) {
                return 0;
            }
            solution = newresult;
            x /= 10;
        }

        return solution;
    }
}