class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[m-1].length;
        List<Integer> result =new ArrayList<>();
        int tp = 0, bm = m - 1, lt = 0, rt = n - 1;
        while (tp <= bm && lt <= rt) {
            //lt to rt
            for (int i = lt; i <= rt; i++) {
                result.add(matrix[tp][i]);
            }
            tp++;

            // tp to bm
            for (int i = tp; i <= bm; i++) {
                result.add(matrix[i][rt]);
            }
            rt--;

            //  rt to lt
            if (tp <= bm) {
                for (int i = rt; i >= lt; i--) {
                    result.add(matrix[bm][i]);
                }
                bm--;
            }

            // bm to tp
            if (lt <= rt) {
                for (int i = bm; i >= tp; i--) {
                    result.add(matrix[i][lt]);
                }
                lt++;
            }
        }
        return result;
    }
}
