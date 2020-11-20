package obfuscatedprogram;

public class program2 {
    public static long[] computeFirstFactorization(long a) {
        long var2;
        for(long var10000 = var2 = 2L; var10000 < a / 2L; var10000 = ++var2) {
            if (a % var2 == 0L) {
                long[] var4 = new long[2];
                boolean var10002 = true;
                var4[0] = var2;
                var4[1] = a / var2;
                return var4;
            }
        }

        return null;
    }
}
