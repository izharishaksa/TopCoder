public class OrganicChemistry {

    public int countHydrogens(String atoms, int[] X, int[] Y) {
        int N = atoms.length();
        int[] cur = new int[N];
        for (int i = 0; i < X.length; i++) {
            cur[X[i]]++;
            cur[Y[i]]++;
        }
        int res = 0;
        for (int i = 0; i < N; i++) {
            char c = atoms.charAt(i);
            switch (c) {
                case 'O':
                    res += 2 - cur[i];
                    break;
                case 'N':
                    res += 3 - cur[i];
                    break;
                case 'C':
                    res += 4 - cur[i];
                    break;
            }
        }
        return res;
    }
}
