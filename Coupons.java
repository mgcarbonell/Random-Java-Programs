public class Coupon { // Coupon can also be cards if we're collecting cards
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int coupons = 0;  // numbers of coupons collected
        int distinct = 0; // number of distinct coupons

        boolean[] found = new boolean[M]; // Have we seen it before or not?
        while (distinct < M) // As long as the # of values we have is less than M, keep going
        {
            int r = (int) (Math.random() * M); // Generate a random coupon between M & -1
            coupons++; // Count it, number of cards we've generated
            if (!found[r]) { // Check to see if we've seen it before
                distinct++; // New different value to count
                found[r] = true; // our found array
            }
        }
        System.out.println(coupons);
    }
}
