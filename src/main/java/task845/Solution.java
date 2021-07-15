package task845;

//Let's call any (contiguous) subarray B (of A) a mountain if the following properties hold:
//
//B.length >= 3
//There exists some 0 < i < B.length - 1 such that B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
//(Note that B could be any subarray of A, including the entire array A.)
//
//Given an array A of integers, return the length of the longest mountain.
//
//Return 0 if there is no mountain.

public class Solution {
    public static void main(String[] args) {

    }

    public int longestMountain(int[] A) {
        int max = 0;
        int currentMax = 0;

        if (A.length < 4) {
            return 0;
        }

        if (A[0] < A[1]) {
            currentMax = A[1];
        }
        for (int i = 1; i < A.length-1; i++) {

        }
    return 5;
    }
}
