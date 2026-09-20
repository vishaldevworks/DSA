import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {

        int arr[] = { 10, 4, 6, 2, 9 };

        // bubble sort

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j=0;  j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

          System.out.println("Bubble sort : " + Arrays.toString(arr));

    }
}
