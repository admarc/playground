package com.github.admarc.algorithms.stringcompressor;

import com.github.admarc.algorithms.Repeat;
import com.github.admarc.algorithms.RepeatRule;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;

public class StringBuilderCompressorTest {
    
    @Rule
    public RepeatRule repeatRule = new RepeatRule();
    
    @Test
    public void itShouldReturnInputStringIfCompressedOneIsLonger() {
        StringBuilderCompressor compressor = new StringBuilderCompressor();
        String compressedString = compressor.compress("abcd");
        assertEquals(compressedString, "abcd");
    }
    
    @Test
    public void itShouldReturnInputStringIfCompressedOneIsTheSameLength() {
        StringBuilderCompressor compressor = new StringBuilderCompressor();
        String compressedString = compressor.compress("aabbccddde");
        assertEquals(compressedString, "aabbccddde");
    }
    
    @Test
    @Repeat(times = 50000000)
    public void itShouldCompressInputString() {
        StringBuilderCompressor compressor = new StringBuilderCompressor();
        String compressedString = compressor.compress(
            "aaaaaaabbbcddrrrggggggooooooooooYYYYYYYYqqqqqrwwwwwwwSSSSSS"
        );
        assertEquals("a7b3c1d2r3g6o10Y8q5r1w7S6", compressedString);
    }
}