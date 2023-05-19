public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int recharge = 300;

        if(recharge<1000) {
            balance = balance + recharge;
        } else {
            balance = balance+recharge+(recharge/100);
        }
        System.out.println(balance);
    }
}
