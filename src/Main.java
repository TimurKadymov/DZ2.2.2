public class Main {
    public static void main(String[] args) {
        int i = 300;
        int popolnenya = 1000;
        int balans = i + popolnenya;
        int percent;
        if (popolnenya >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        //int percent = p >= 1000 ? 1 : 0;
        int bonus = popolnenya * percent / 100;
        System.out.println("Итоговый бонус: " + bonus);
    }
}
