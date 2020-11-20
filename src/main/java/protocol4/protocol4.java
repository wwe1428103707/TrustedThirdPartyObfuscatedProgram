package protocol4;

public class protocol4 {
    public static void main(String[] args) {
        long uncertainPrimeNumber = 6553379L;
        int reward = 10;
        long[] result;

        Alice alice = new Alice();
        alice.setMoney(100);
        Bob bob = new Bob();
        bob.setReward(0);

        alice.initialRequest(uncertainPrimeNumber);
        bob.getInput(uncertainPrimeNumber);
        bob.setOb(true);
        result = bob.produceParticularOutput();
        alice.getResult(result);
        alice.checkParticularResult(result);
        if(alice.getIspay()){
            bob.getReward(alice.payMoney(reward));
            bob.produceOutput(bob.isOb());
        }else {
            alice.refusePay();
        }
        System.out.println("Alice money:" + alice.getMoney());
        System.out.println("Bob money:"+bob.getReward());
    }
}
