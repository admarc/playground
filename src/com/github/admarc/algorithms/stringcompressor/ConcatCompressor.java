package com.github.admarc.algorithms.stringcompressor;

public class ConcatCompressor implements StringCompressor {

    @Override
    public String compress(String stringToCompress) {
        int previousCharIndex = 0;
        String compressedString = "";
        int inputStringLength = stringToCompress.length();
        int count = 1;
        for(int i=1; i < inputStringLength; i++){
            if(stringToCompress.charAt(previousCharIndex) == stringToCompress.charAt(i)) {
                count++;
            }
            else {
                compressedString += stringToCompress.charAt(previousCharIndex)+ "" + count;
                count = 1;
            }
            previousCharIndex++;
        }
        
        compressedString += stringToCompress.charAt(previousCharIndex)+ "" + count;
        
        if(inputStringLength <= compressedString.length()) {
            return stringToCompress;
        }
        
        return compressedString;
    }
}
