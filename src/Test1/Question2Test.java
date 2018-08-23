package Test1;

import org.junit.Assert;
import org.junit.Test;

public class Question2Test {
    @Test
    public void test1(){
        String G = "SRR";
        Question2 q = new Question2();
        Assert.assertEquals(4, q.solutiosn(G));

    }
}

