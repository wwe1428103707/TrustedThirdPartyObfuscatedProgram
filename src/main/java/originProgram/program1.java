package originProgram;

import java.util.ArrayList;

public class program1 {
    public static long [][] computeFactorizations(long num){
        ArrayList<ArrayList<Long>> arr = new ArrayList<>();
        for(int i = 2; i < num/2; i++){
            if(num%i==0){
                ArrayList<Long> temp = new ArrayList<>();
                temp.add((long)i);
                temp.add(num/i);
                arr.add(temp);
            }
        }
        long[][] longs = new long[arr.size()][2];
        return arr.toArray(longs);
    }
}
