package Test2;

import Test1.Question2;
import org.junit.Assert;
import org.junit.Test;

public class Q5Test {
    @Test
    public void test1(){
        String G = "SRR";
        Question5 q = new Question5();
        System.out.println('A'+1);
        Assert.assertEquals(13, q.solution(G));

    }
}

