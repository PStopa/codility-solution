package com.codility.solution.BinaryGap;

public class Solution {

    static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int longestGap = 0;
        int currentGap = 0;

        if (binary.length() != 0) {
            for(int i=0; i < binary.length(); i++) {
                if (binary.charAt(i) != '1' && (i-1 != binary.length())) {
                    currentGap++;

                } else {
                    if(currentGap > longestGap) longestGap = currentGap;
                    currentGap = 0;
                }
            }
        }
        return longestGap;
    }

    public static void main(String[] args) {
        int sol = solution(529);
        System.out.printf("Solution: " + sol);
    }
}
