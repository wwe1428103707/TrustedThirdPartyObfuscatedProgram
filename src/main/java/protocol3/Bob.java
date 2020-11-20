package protocol3;

import lombok.Data;

@Data
public class Bob {
    private String outstr;
    private int outint;
    private long input;
    private boolean isOb;
    private int reward;
    private boolean isSendOutput;

    public void getInput(long input) {
        this.input = input;
    }

    public long[] produceOutput(boolean isOb) {
        if (isOb){
            return obfuscatedprogram.program2.computeFirstFactorization(input);
        } else {
            return originProgram.program2.computeFirstFactorization(input);
        }
    }

    public void obfuscateProgram() {
    }

    public long[] produceParticularOutput() {

        return particularOut.makeParticularOut.makeParticularOut(produceOutput(isOb));
    }

    public void uploadOutput() {
    }

    public void getReward(int reward){
        this.reward = reward;
    }

    public int getMoney(){
        return reward;
    }

    public long[] sendOutput(){
        if (isSendOutput){
            return produceOutput(isOb);
        } else {
            return null;
        }
    }
}