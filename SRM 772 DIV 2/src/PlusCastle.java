public class PlusCastle {

    public int maximiseClosedFigures(int k) {
        int min = (int) Math.sqrt(k);
        int rest = k - min * min;
        int total = (min - 1) * (min - 1);
        for (int i = 0; i < rest; ++i) {
            if (i == 0 || i == min) continue;
            total++;
        }
        return total;
    }

}
