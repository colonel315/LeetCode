package Easy;

/**
 * Created by Dell on 1/3/2017.
 */
public class IntPalindrome {
    public static void main(String args[]) {
        IntPalindrome palindrome = new IntPalindrome();

        System.out.println(palindrome.isPalindrome(-11));
    }
    private boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int numLength = (int)Math.log10(x)+1;
        int pow10 = numLength-1;

        if(numLength == 1) {
            return true;
        }

        for(int i = 0; i < numLength/2; i++) {
            if(x/(int)Math.pow(10, pow10) != x%10) {
                return false;
            }
            x %= Math.pow(10, pow10);
            x /= 10;
            pow10 -= 2;
        }

        return true;
    }
}
