package com.github.admarc.algorithms.permutationchecker;

import com.github.admarc.algorithms.Repeat;
import com.github.admarc.algorithms.RepeatRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class SortCheckerTest {
    
    private SortChecker checker = new SortChecker();;
    
    @Rule
    public RepeatRule repeatRule = new RepeatRule();

    @Test
    @Repeat(times = 10_000_000)
    public void itShouldReturnFalseIfStringsHaveDifferentSize() {
        Assert.assertFalse(this.checker.check("str", "string"));
        
    }
    
    @Test
    @Repeat(times = 10_000_000)
    public void itShouldReturnFalseIfStringsAreNotPermutations() {
        Assert.assertFalse(this.checker.check("adamqwertyui", "marcqwertyui"));
    }
    
    @Test
    @Repeat(times = 10_000_000)
    public void itShouldReturnFalseIfStringsArePermutations() {
        Assert.assertTrue(this.checker.check("fadahmejwqjvv", "damaqwefhjjvv"));
    }
}
