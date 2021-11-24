package Lesson3;

public class Lesson3 {
//                  1дз
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }


//                      2 дз
        public static void fillArray() {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
                System.out.print(arr[i] + " ");
            }

        }
    //                 3 Дз
    public static void changeArray(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] <= 6) {
                arr[i] *= 2;
                System.out.print(arr[i] + " ");
            }
        }
    }
}





