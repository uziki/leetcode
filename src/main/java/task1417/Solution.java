package task1417;

//Given alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).
//You have to find a permutation of the string where no letter is followed by another letter and no digit is followed
// by another digit. That is, no two adjacent characters have the same type.
//Return the reformatted string or return an empty string if it is impossible to reformat the string.

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public static String reformat(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                letters.add(s.charAt(i));
            } else {
                digits.add(s.charAt(i));
            }
        }

        if (letters.isEmpty()) {
            if (digits.size() == 1) {
                return digits.get(0).toString();
            } else {
                return "";
            }
        }

        if (digits.isEmpty()) {
            if (letters.size() == 1) {
                return letters.get(0).toString();
            }
        }
        if (Math.abs(letters.size() - digits.size()) >= 2) {
            return "";
        }

        for (int i = 0; i != Math.min(letters.size(), digits.size()); i++) {
            sb.append(letters.get(i)).append(digits.get(i));
        }

        if (letters.size() > digits.size()) {
            sb.append(letters.get(letters.size()-1));
        } else if (letters.size() < digits.size()){
            sb.insert(0, digits.get(digits.size()-1));
        }

        return sb.toString();
    }
}
