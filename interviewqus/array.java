import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        int number[] = { 10, 5, 30, 40, 15, 20, 31 };

        // 1 find minimum and max element in this array

        int max = number[0];
        int min = number[0];

        // find max element

        for (int i = 1; i <= number.length - 1; i++) {
            if (number[i] > max) {

                max = number[i];

            }
        }
        System.out.print("maximum element : ");
        System.out.println(max);

        // find min element

        for (int i = 1; i <= number.length - 1; i++) {

            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.print("minimum element : ");
        System.out.println(min);

        // 2 calculate sum of all elements

        int sum = 0;
        for (int a : number) {
            sum = sum + a;

        }
        System.out.println("sum of all elements  : " + sum);

        // 3 count even and odd element

        int even = 0;
        int odd = 0;

        for (int a : number) {
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        System.out.println("even : " + even);
        System.out.println("odd : " + odd);

        // 4 reverse the array

        // int reverse[] = new int[number.length];
        // for (int i = 0; i <= number.length-1; i++) {
        // reverse[i] = number[number.length-1 - i];
        // }

        // System.out.print("reverse array : ");
        // for (int a:reverse){
        // System.out.print(" "+ a);
        // }

        int start = 0;
        int end = number.length - 1;

        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
        System.out.println("reverse array : " + Arrays.toString(number));

        // 5 second largest element

        int large = Integer.MIN_VALUE;
        int secondlage = Integer.MIN_VALUE;

        for (int i = 0; i <= number.length - 1; i++) {
            if (number[i] > large) {
                secondlage = large;
                large = number[i];
            } else if (secondlage < number[i] && large != number[i]) {
                secondlage = number[i];
            }
        }
        System.out.println("Second largest : " + secondlage);

        // 6 check array is sorted or not

        boolean isorted = false;

        for (int i=0; i<number.length-1; i++ ){
            if(number[i] < number[i+1]){
                isorted = true;
            } else {
                isorted=false;
                break;
            }
        }
        if(isorted) {
            System.out.println("Sorted : " + isorted);
        } else {
            System.out.println("Sorted : " + isorted);
        }





    }

}
