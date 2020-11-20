package protocol5;

import lombok.Data;

@Data
public class Alice {
    private long inputnum;
    private int money;
    private long[] result;
    private boolean ispay;

    public long initialRequest( long originData) {
        this.inputnum = originData;
        return originData;
    }

    public void getResult(long[] output) {
        this.result = output;
    }

    public void checkResult() {
        if (result == null){
            ispay = false;
        }else if(result[0] * result[1] == inputnum){
            ispay = true;
        }else {
            ispay = false;
        }
    }

    public int payMoney(int num) {
        money = money - num;
        return num;
    }

    public void refusePay() {
        result = null;
    }

    public boolean getIspay() {
        return ispay;
    }

    public void getParticularResult() {
    }
}