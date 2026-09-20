
import java.util.*;

public class ArrayList01 {
    public static void main(String[] args) {

        // Array List

        // how to create ArrayList
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("vishal");
        list1.add("sharma!");
        list1.add(1, "shivam");

        // how to access
        System.out.println(list1);
        System.out.println(list1.get(2));

        // how to insert
        list1.set(1, "Anshu");
        System.out.println(list1);

        // how to remove an element
        list1.remove(1);
        System.out.println(list1);

        // how to run a loop

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // how to sort arrylist
        Collections.sort(list1);
        System.out.println(list1);

        // how to clar arraylist
        list1.clear();
        System.out.println(list1);

    }

}
