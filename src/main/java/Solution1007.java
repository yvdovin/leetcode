public class Solution1007 {

    public int minDominoRotations(int[] A, int[] B) {
        int x = A[0];
        int y = B[0];
        int z = 0;
        if(A[0] == B[0]) {
            z = A[0];
        }else {
            for(int i = 1; i < A.length; ++i) {
                if((A[i] == x && B[i] == y) || (A[i] == y && B[i] == x)) {
                    continue;
                }else {
                    if(A[i] == x || B[i] == x) {
                        z = x;
                        break;
                    }else if(A[i] == y || B[i] == y) {
                        z = y;
                        break;
                    }else{
                        return -1;
                    }
                }
            }
        }
        int countA = 0;
        int countB = 0;
        for(int i = 0; i < A.length; ++i) {
            if(A[i] == z && B[i] == z) {
                continue;
            }
            if(A[i] == z) {
                countA++;
            }else if(B[i] == z) {
                countB++;
            }else{
                return -1;
            }
        }
        return Math.min(countA, countB);

    }
}
