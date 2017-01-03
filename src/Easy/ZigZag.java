package Easy;

/**
 * Created by Dell on 1/2/2017.
 */
public class ZigZag {
    public static void main(String args[]) {
        ZigZag zigZag = new ZigZag();

        String solution = zigZag.zigZag("WhatIsGoingOn", 5);
        System.out.print(solution);
    }
    private String zigZag(String s, int numRows) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        StringBuilder[] builder = new StringBuilder[numRows];

        for(int j = 0; j < numRows; j++) {
            builder[j] = new StringBuilder();
        }

        int i = 0;
        while(i < length) {
            for(int j = 0; j < numRows && i < length; j++) {
                builder[j].append(chars[i++]);
            }
            for(int j = numRows-2; j > 0 && i < length; j--) {
                builder[j].append(chars[i++]);
            }
        }

        for(int j = 1; j < numRows; j++) {
            builder[0].append(builder[j]);
        }

        return builder[0].toString();
    }
}
