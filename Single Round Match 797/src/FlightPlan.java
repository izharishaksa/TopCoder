public class FlightPlan {

    public long fly(int R, int C, int[] H, int cup, int cdn, int clr) {
        if (R > C) {
            R ^= C;
            C ^= R;
            R ^= C;
        }
        int[][] altitude = new int[R][C];
        long[][] res = new long[R][C];
        for (int i = 0, row = 0, col = 0; i < H.length; i++) {
            altitude[row][col] = H[i];
            if (i > 0 && col == C - 1) {
                row++;
                col = 0;
            } else {
                col++;
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                res[i][j] = Long.MAX_VALUE;
            }
        }
        res[0][0] = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                long cost = Long.MAX_VALUE;
                try {
                    if (altitude[i][j] > altitude[i - 1][j]) {
                        cost = Math.min(cost + res[i - 1][j], cup);
                    } else {
                        cost = Math.min(cost + res[i - 1][j], clr);
                    }
                } catch (Exception e) {

                }
                try {
                    if (altitude[i][j] > altitude[i][j - 1]) {
                        cost = Math.min(cost + res[i][j - 1], cup);
                    } else {
                        cost = Math.min(cost + res[i][j - 1], clr);
                    }
                    System.err.println(cost);
                    res[i][j] = Math.min(cost, res[i][j]);
                } catch (Exception e) {

                }
            }
        }
        return res[R - 1][C - 1];
    }
}
