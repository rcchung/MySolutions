package Test2;

public class Question2 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int count = 0;
        for(int i=0; i<A.length-1; i++){
            if (A.length==1){
                return A[0];
            } else if(A[i]<A[i+1]){
                count += A[i+1]-A[i];
                if(count>1000000000){
                    return -1;
                }
            }
        }
        return count+A[0];
    }
}

