package Test1;

import java.util.Arrays;

public class Question1 {
        public void solution(int N) {
            for(int i = 1; i<=N; i++){
                StringBuilder sb = new StringBuilder();
                if(i%2==0){
                    sb.append("Codility");
                }
                if(i%3==0){
                    sb.append("Test");
                }
                if(i%5==0){
                    sb.append("Coders");
                }
                if(i%2!=0 && i%3!=0 && i%5!=0){
                    sb.append(i);
                }
                System.out.println(sb.toString());
            }
            // write your code in Java SE 8
        }
    }

