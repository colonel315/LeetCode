package Easy;

/**
 * Implement atoi to convert a string to an integer.
 *
 * test cases:
 * +1 = 1
 * -1 = -1
 * -1+2 = -1
 * +1-2 = 1
 * ++1 = 0
 * +1x = 1
 * Created by Dell on 1/3/2017.
 */
public class ATOI {
    public static void main(String args[]) {
        ATOI atoi = new ATOI();

        System.out.println("        2147483649x");
        System.out.print(atoi.atoi("      2147483649x"));
    }
    private int atoi(String str) {
        int solution = 0;
        char operator = ' ';
        str = str.trim();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(operator == ' ' && (c == '+' || c == '-')) {
                operator = str.charAt(i);
            }
            else if(Character.isDigit(c)) {
                int newResult = solution*10+(str.charAt(i)-'0');
                if(solution != newResult/10) {
                    if(str.charAt(0) == '-') {
                        return Integer.MIN_VALUE;
                    }
                    else {
                        return Integer.MAX_VALUE;
                    }
                }
                solution = solution*10 + str.charAt(i)-'0';
            }
            else {
                if(operator == '-') {
                    return -solution;
                }
                return solution;
            }
        }
        if(operator == '-') {
            return -solution;
        }
        return solution;
    }
}
