package particularOut;

// TODO: 编写检查额外输出的函数
public class checkParticularOut {
    public static boolean check(long[] input, long comparNum){
        if(input[0] * input[1] == comparNum){
            return true;
        }
        return false;
    }
}
