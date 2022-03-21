class Solution799 {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] glasses = new double[101][101];
        glasses[0][0] = poured;
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                //нашли остаток для детишек
                double rem = Math.max((glasses[i][j] - 1) / 2, 0);
                //налили детишкам
                glasses[i + 1][j] += rem;
                glasses[i + 1][j + 1] += rem;
            }
        }
        //вдруг налили дохрена, а позиция сверху
        return Math.min(glasses[query_row][query_glass], 1.0);
    }

//    public double champagneTower(int poured, int query_row, int query_glass) {
//        double[][] glasses = new double[101][101];
//        glasses[0][0] = poured;
//        for (int i = 0; i < query_row; i++) {
//            for (int j = 0; j < query_glass; j++) {
//                double remain = Math.max(glasses[i][j] - 1.0, 0);
//                glasses[i + 1][j] += remain / 2;
//                glasses[i + 1][j + 1] += remain / 2;
//            }
//        }
//        return Math.min(glasses[query_row][query_glass], 1.0);
//    }
}