public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int deposit_amount = 1000;
        int balance_final = balance + deposit_amount;
        int percent;
        if (deposit_amount >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        //int percent = p >= 1000 ? 1 : 0;
        int bonus = deposit_amount * percent / 100;
        System.out.println("Итоговый бонус: " + bonus);
    }
}
