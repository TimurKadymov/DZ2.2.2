public class Main {
    public static void main (String[] args) {
        int i = 300;
        int p = 3000;
        int x = i+p;
        int percent;
        if (p > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        //int percent = p >= 1000 ? 1 : 0;
        int bonus = p * percent / 100;
    }
}
