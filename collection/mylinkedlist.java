
import java.util.LinkedList;

public class mylinkedlist {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.addLast("3");
        list.addFirst("4");
        System.out.println(list.getFirst());

    }
    
}
