package Test2;

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {
    @Test
    public void test1(){
        Question4 q= new Question4();
        String test = "We test coders. Give us a try?";
        Assert.assertEquals(4, q.solution(test));
    }

}

