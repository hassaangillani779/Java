import java.util.Random;

public class SixCoinToss {
    public static void main(String[] args) {
        final int TRIALS = 50_000;
        final int COINS_PER_TRIAL = 6;
        Random rng = new Random();

        int currentCombo = 0;
        int maxCombo = 0;
        int previousHeadsCount = -1; // -1 = "no previous trial yet"

        for (int trial = 0; trial < TRIALS; trial++) {

            // --- Step 1: flip six coins for THIS trial, count heads ---
            int headsInThisTrial = 0; // reset fresh for every trial
            for (int coin = 0; coin < COINS_PER_TRIAL; coin++) {
                boolean isHeads = rng.nextBoolean();
                if (isHeads) {
                    headsInThisTrial++;
                }
            }
            // headsInThisTrial is now a single number, 0 to 6

            // --- Step 2: compare this trial's count to the previous trial's count ---
            if (trial > 0 && headsInThisTrial == previousHeadsCount) {
                currentCombo++;
            } else {
                currentCombo = 1;
            }

            // --- Step 3: update maxCombo if this streak is a new record ---
            if (currentCombo > maxCombo) {
                maxCombo = currentCombo;
            }

            // --- Step 4: remember this trial's count for the next comparison ---
            previousHeadsCount = headsInThisTrial;
        }

        System.out.println("Total trials : " + TRIALS);
        System.out.println("Max combo    : " + maxCombo);
    }
}
