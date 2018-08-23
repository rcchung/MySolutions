package Test2;

public class Question4 {
    public int solution(String S) {
        // write your code in Java SE 8
        String[] sentences = splitIntoSentences(S);
        int maxCount = 0;
        for(String sentence: sentences){
            int wordCount = countWords(sentence);
            if(wordCount>maxCount){
                maxCount = wordCount;
            }
        }
        return maxCount;
    }

    public String[] splitIntoSentences(String S){
        return S.split("[.?!]");
    }

    public int countWords(String sentence){
        String[] words = sentence.split(" ");
        int wordCount = 0;
        for(String word: words){
            if(word!=null && !word.equals("")){
                wordCount++;
            }
        }
        return wordCount;
    }

}

