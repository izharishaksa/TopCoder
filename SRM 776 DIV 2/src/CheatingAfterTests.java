public class CheatingAfterTests {

    public int cheat(int[] report) {
        int total = 0, max = 0;
        for (int i : report) {
            total += i;
            if (i < 10) {
                max = Math.max(max, 9 - i);
            } else if (i < 90) {
                max = Math.max(max, (90 + i % 10) - i);
            } else {
                max = Math.max(max, 9 - i % 10);
            }
        }
        return total + max;
    }
}
