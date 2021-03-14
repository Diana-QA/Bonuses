public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        int totalSum;
        if (refill >= 1000) {
            int bonus = refill / 100;
            totalSum = bonus + refill + balance;
        } else {
            totalSum = balance + refill;
        }
        System.out.println("Итоговая сумма равна " + totalSum);
    }
}
