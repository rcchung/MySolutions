package Test2;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {
    @Test
    public void test1(){
        Question1 q= new Question1();
        String test = "We test coders. Give us a try?";
        Assert.assertEquals(4, q.solution(test));
    }

}

