package com.github.admarc.algorithms.stringcompressor;

public class StringBuilderCompressor implements StringCompressor {

    @Override
    public String compress(String stringToCompress) {
        int previousCharIndex = 0;
        StringBuilder compressedString = new StringBuilder();
        int inputStringLength = stringToCompress.length();
        int count = 1;
        for(int i=1; i < inputStringLength; i++){
            if(stringToCompress.charAt(previousCharIndex) == stringToCompress.charAt(i)) {
                count++;
            }
            else {
                compressedString.append(stringToCompress.charAt(previousCharIndex));
                compressedString.append(count);
                count = 1;
            }
            previousCharIndex++;
        }
        
        compressedString.append(stringToCompress.charAt(previousCharIndex));
        compressedString.append(count);
        
        if(inputStringLength <= compressedString.length()) {
            return stringToCompress;
        }
        
        return compressedString.toString();
    }
}
