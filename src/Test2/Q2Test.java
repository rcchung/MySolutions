package Test2;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {
    @Test
    public void test1(){
        int[] arr = {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2};
        Question2 q = new Question2();
        Assert.assertEquals(9,q.solution(arr));
    }
}

