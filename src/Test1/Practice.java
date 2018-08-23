package Test1;
    // you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
public class Practice {
        public int solution(int[] A) {
            // write your code in Java SE 8
            Arrays.sort(A);
            int number = A[0];
            for(int x: A){
                if(x==number||x==number+1){
                    number = x;
                }else{
                    break;
                }
            }
            if (number>0){
                return number+1;
            }
            return 1;
        }
    }

