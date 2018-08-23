package Test2;

import org.junit.Assert;
import org.junit.Test;

public class Question6Test {
    @Test
    public void test(){
        int N = 2;
        String test ="1A 2F 1C";
        Question6 q = new Question6();
        Assert.assertEquals(5, q.solution(N,test));
    }
}

