public class CouponCollector {
    // Debugged code, compare to Coupon.java
    // We added in 2 args, and a for loop for (int i = 0; i < trials; i++)
    // Like Gambler's Ruin optimization
    // We're going to average this, cards over trials.
    // Laplace analysis
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int cards = 0;
        boolean[] found;

        for (int i = 0; i < trials; i++) {
            int distinct = 0;
            found = new boolean[M];
            while (distinct < M) {
                int r = (int) (Math.random() * M);
                cards++;
                if (!found[r]) {
                    distinct++;
                    found[r] = true;
                }
            }
        }
        System.out.println(cards / trials);
    }
}
