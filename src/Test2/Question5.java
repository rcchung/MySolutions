package Test2;

public class Question5 {
    public int solution(String G) {
        // write your code in Java SE 8
        int rockScore = 0;
        int paperScore = 0;
        int scissorScore = 0;

        for (int i = 0; i < G.length(); i++) {
            if (G.charAt(i) == 'R') {
                paperScore += 2;
                rockScore++;
            } else if (G.charAt(i) == 'P') {
                scissorScore += 2;
                paperScore++;
            } else if (G.charAt(i) == 'S') {
                rockScore += 2;
                scissorScore++;
            }
        }

        int maxScore = rockScore;
        if (paperScore > maxScore) {
            maxScore = paperScore;
        }
        if (scissorScore > maxScore) {
            maxScore = scissorScore;
        }
        return maxScore;
    }
}

