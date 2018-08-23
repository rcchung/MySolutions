package Test2;

import java.util.ArrayList;

public class Question1 {
    public int solution(String S) {
        // write your code in Java SE 8
        String[] sentences = splitIntoSentences(S);
        int max = 0;
        for(String sentence: sentences){
            if(!sentence.equals("")){
                int count = countWords(sentence);
                if(count>max){
                    max = count;
                }
            }
        }
        return max;
    }

    public String[] splitIntoSentences(String S){
        String[]arr = S.split("[?.!]");
        return arr;
    }

    public int countWords(String sentence){
        String[]words = sentence.split(" ");
        int count = 0;
        for(String word: words){
            if(word.equals("") || word.equals(" ")){

            } else{
                count++;
            }
        }
        return count;
    }
}

