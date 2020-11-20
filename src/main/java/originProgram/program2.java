package originProgram;

public class program2 {
    public static long [] computeFirstFactorization(long num){
        for (long i = 2; i < num/2; i++) {
            if (num%i==0) {
                return new long[]{i, num / i};
            }
        }
        return null;
    }
}
