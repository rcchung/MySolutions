package Test2;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Question6 {
    public int solution(int N, String S) {
        // write your code in Java SE 8
        if(S.length()==0){
            return N*3;
        }
        String[] seats = S.split(" ");
        if(seats.length==N*10){
            return 0;
        }

        Map<String, int[]> sortedSeats = sortSeats(seats);

        return count(N,sortedSeats);
    }

    public Map<String, int[]> sortSeats(String[] seats){

        Map<String, int[]> sortedSeats = new TreeMap<>();
        for(String seat: seats){
            String key;
            if(seat.length()==3){
                key = seat.substring(0,1);
            } else {
                key = String.valueOf(seat.charAt(0));
            }
            int[] row = sortedSeats.getOrDefault(key,new int[10]);
            int index = seat.charAt(seat.length()-1)-65;
            if(index>9){index--;}
            row[index] = 1;
            sortedSeats.put(key,row);
        }
        return sortedSeats;
    }

    public int count(int N, Map<String, int[]> sortedSeats){
        int maxFamilyCount = N*3;
        for(String key: sortedSeats.keySet()){
            int[] row = sortedSeats.get(key);
            for(int i = 0; i < 3; i++){
                if(row[i]==1){
                    maxFamilyCount--;
                    break;
                }
            }
            for(int i = 7; i < 10; i++){
                if(row[i]==1){
                    maxFamilyCount--;
                    break;
                }
            }
            if(row[4]==1 || row[5]==1){
                maxFamilyCount--;
                break;
            }
            if(row[3]==1 && row[6]==1){
                maxFamilyCount--;
            }
        }
        return maxFamilyCount;
    }
}

