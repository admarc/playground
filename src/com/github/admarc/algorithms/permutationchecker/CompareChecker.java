package com.github.admarc.algorithms.permutationchecker;

public class CompareChecker implements PermutationChecker {
    @Override
    public boolean check(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        
        int[] charCount = new int[255];
        
        for(char c: chars1) {
            charCount[c]++;
        }
        
        for(char c: chars2) {
            if(--charCount[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
