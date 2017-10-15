package com.github.admarc.algorithms.permutationchecker;

import java.util.Arrays;

public class SortChecker implements PermutationChecker {
    @Override
    public boolean check(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] chars1 = str1.toCharArray();
        Arrays.sort(chars1);
        
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);
        
        return new String(chars1).equals(new String(chars2));
    }
}
