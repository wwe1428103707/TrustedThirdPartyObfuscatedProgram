package protocol1;

//TODO: 错误情况下的协议执行流程
public class wrongProtocol1 {
    public static void main(String[] args) {

        long uncertainPrimeNumber = 6553379L;
        int reward = 10;
        long[] result = new long[2];

        Alice alice = new Alice();
        alice.setMoney(100);
        Bob bob = new Bob();
        bob.setReward(0);

        alice.initialRequest(uncertainPrimeNumber);
        bob.getInput(uncertainPrimeNumber);
        result = bob.produceOutput(bob.isOb());
        alice.getResult(result);
        alice.checkResult();
        if(alice.getIspay()){
            bob.getReward(alice.payMoney(reward));
        }else {
            alice.refusePay();
        }
        System.out.println("Alice money:" + alice.getMoney());
        System.out.println("Bob money:"+bob.getReward());
    }
}
