package Test1;


import org.junit.Assert;
import org.junit.Test;

public class PracticeTest {
    @Test
    public void test1(){
        Practice p = new Practice();
        int[] test = {2};
        Assert.assertEquals(1,p.solution(test));
    }
}

