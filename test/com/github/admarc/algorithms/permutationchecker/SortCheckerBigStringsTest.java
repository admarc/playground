package com.github.admarc.algorithms.permutationchecker;

import com.github.admarc.algorithms.Repeat;
import com.github.admarc.algorithms.RepeatRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class SortCheckerBigStringsTest {
    
    private SortChecker checker = new SortChecker();
    
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
        String str1 = "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxy"
                + "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxyyyy"
                + "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxyyyy";
        String str2 = "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxy"
                + "qwertyui1damqwertyui1damqwertyui1damqwertyui1dXmqwertyui1damqwertyui1damqwertyui1damqwertyuixxxyyyy"
                + "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxyyyy";
        Assert.assertFalse(this.checker.check(str1, str2));
    }
    
    @Test
    @Repeat(times = 10_000_000)
    public void itShouldReturnFalseIfStringsArePermutations() {
        String str1 = "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxy"
                + "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxyyyy"
                + "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxyyyy";
        String str2 = "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxy"
                + "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxyyyy"
                + "qwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyui1damqwertyuixxxyyyy";
        Assert.assertTrue(this.checker.check(str1, str2));
    }
}
