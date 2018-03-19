package com.codility.solution.BinaryGap;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTestSuite {
    @Test
    public void solutionTest(){
        Assert.assertEquals(5, Solution.solution(1041));
        Assert.assertEquals(0, Solution.solution(15));
        Assert.assertEquals(0, Solution.solution(1));
        Assert.assertEquals(1, Solution.solution(5));
        Assert.assertEquals(2, Solution.solution(328));
        Assert.assertEquals(2, Solution.solution(19));
        Assert.assertEquals(1, Solution.solution(42));
        Assert.assertEquals(2, Solution.solution(51712));
    }
}
