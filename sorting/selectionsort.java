import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {

        // selection sort
        int arr[] = { 64, 25, 12, 22, 11 };

        
        for (int i = 0 ; i<arr.length-1; i++) {
            int smalest = i;
            for (int j = i+1; j<arr.length; j++) {
                if(arr[smalest] > arr[j]) {
                    smalest = j;

                }
            }
            int temp = arr[smalest];
                arr[smalest] = arr[i];
                arr[i] = temp;
        }

        System.out.println("Slection sort : " + Arrays.toString(arr));
    }
}
