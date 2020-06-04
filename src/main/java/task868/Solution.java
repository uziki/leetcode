package task868;

//Given a positive integer N, find and return the longest distance between two consecutive 1's in the binary representation of N.
//
//If there aren't two consecutive 1's, return 0.

public class Solution {
    public static void main(String[] args) {
        System.out.println();
        int test = 15;
        System.out.println(Integer.toBinaryString(test));
        System.out.println(binaryGap(test));
    }
    public static int binaryGap(int N) {
        int max = 0;
        int currentMax = 0;
        String binary = Integer.toBinaryString(N);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (currentMax == 0) {
                    currentMax++;
                    continue;
                } else {
                    if (currentMax > max) {
                        max = currentMax;
                    }
                    currentMax = 1;
                }
            } else if (binary.charAt(i) == '0') {
                currentMax++;
            }
        }
        return max;
    }
}
