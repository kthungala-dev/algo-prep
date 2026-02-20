package com.kiran.collections.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final Map<Character, String> digitToLetter = new HashMap<>();

    public Solution() {
        digitToLetter.put('2', "abc");
        digitToLetter.put('3', "def");
        digitToLetter.put('4', "ghi");
        digitToLetter.put('5', "jkl");
        digitToLetter.put('6', "mno");
        digitToLetter.put('7', "pqrs");
        digitToLetter.put('8', "tuv");
        digitToLetter.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        result.add("");

        for (char digit : digits.toCharArray()) {

            String letters = digitToLetter.get(digit);

            List<String> tempResult = new ArrayList<>();

            if (letters != null) {
                for (String existingCombination : result) {
                    for (char letter : letters.toCharArray()) {
                        tempResult.add(existingCombination + letter);
                    }
                }

                result = tempResult;
            }
        }

        return result;
    }

    public List<String> recursiveApproach(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        recursive(digits, 0, new StringBuilder(), result);

        return result;
    }

    private void recursive(String digits, int idx, StringBuilder comb, List<String> res) {
        if (idx == digits.length()) {
            res.add(comb.toString());
            return;
        }

        String letters = digitToLetter.get(digits.charAt(idx));

        if (letters == null) {
            recursive(digits, idx + 1, comb, res);
            return;
        }

        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            recursive(digits, idx + 1, comb, res);
            comb.deleteCharAt(comb.length() - 1);
        }
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.letterCombinations("123"));
        System.out.println(sol.recursiveApproach("123"));
    }

}
