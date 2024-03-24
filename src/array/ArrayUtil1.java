package array;

public class ArrayUtil1 {
    // 최대값과 최소값
    public static void main(String[] args) {
        int[] score = {79, 88, 35, 2123, 44, 55};

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            } // end of for
        }
        System.out.println("최댓값 :" + max);
        System.out.println("최댓값 :" + min);
    }

}
