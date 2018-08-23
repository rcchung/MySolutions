package Test1;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public int solutiosn(String G) {
        // write your code in Java SE 8
        System.out.print(G);
        //G.replaceAll("\'","");
        Map<Character,Integer> gioMoves = tallyGioMoves(G);
        int rockScore = calculateRockScore(gioMoves);
        int paperScore = calculatePaperScore(gioMoves);
        int scissorsScore = calculateScissorsScore(gioMoves);

        if(rockScore>=paperScore && rockScore>=scissorsScore){
            return rockScore;
        } else if (paperScore>=rockScore && paperScore>=scissorsScore){
            return paperScore;
        } else {
            return scissorsScore;
        }
    }

    public Map tallyGioMoves(String G){
        Map<Character,Integer> gio = new HashMap<>();
        for(int i = 0; i < G.length(); i++){
            Integer tally = gio.getOrDefault(G.charAt(i),0);
            gio.put(G.charAt(i),tally+1);
            System.out.println(G.charAt(i));
            System.out.println(tally);
        }
        return gio;
    }

    public int calculateRockScore(Map<Character,Integer> moves){
        int ties = moves.getOrDefault('R',0);
        int wins = moves.getOrDefault('S',0);
        return ties + (wins*2);
    }

    public int calculatePaperScore(Map<Character,Integer> moves){

        int ties = moves.getOrDefault('P',0);
        int wins = moves.getOrDefault('R',0);
        return ties + (wins*2);
    }

    public int calculateScissorsScore(Map<Character,Integer> moves){
        int ties = moves.getOrDefault('S',0);
        int wins = moves.getOrDefault('P',0);
        return ties + (wins*2);
    }


    public int solution(String G) {
        // write your code in Java SE 8
        int rScore = 0;
        int sScore = 0;
        int pScore = 0;

        for(int i = 0; i<G.length();i++){
            if(G.charAt(i)=='R'){
                rScore++;
                pScore= pScore+2;
            } else if (G.charAt(i)=='P'){
                pScore++;
                sScore=sScore+2;
            } else if(G.charAt(i)=='S'){
                sScore++;
                rScore=rScore+2;
            }
        }

        if(rScore>=pScore && rScore>=sScore){
            return rScore;
        } else if (pScore>=rScore && pScore>=sScore){
            return pScore;
        } else if (sScore>=rScore && sScore>=pScore){
            return sScore;
        }
        return 0;
    }
}

