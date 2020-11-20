package protocol1;

import lombok.Data;

@Data
public class Bob {
    private String outstr;
    private int outint;
    private long input;
    private boolean isOb;
    private int reward;

    public void getInput(long input) {
        this.input = input;
    }

    public long[] produceOutput(boolean isOb) {
        if (isOb){
            return null;
        } else {
//            return obfuscatedprogram.program1;
            return originProgram.program2.computeFirstFactorization(input);
        }
    }

    public void obfuscateProgram() {
    }

    public void produceParticularOutput() {
    }

    public void uploadOutput() {
    }

    public void getReward(int reward){
        this.reward = reward;
    }

    public int getMoney(){
        return reward;
    }
}